package blog;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

/**
 * @author 张瑞瑞
 * @date 2020/06/09 16:56
 */
public class ArticleDetailAction implements Action  {
    @Override
    public void run() {
        Scanner scanner=new Scanner(System.in);
        System.out.print("请输入要查看的文章id>");
        String id=scanner.nextLine();
        String authorId=null;
        String title=null;
        String content=null;
        String publishedAt=null;
        int likeCount=0;


        try(Connection connection =DBUtil .getConnection() ){
            //1.查找文章信息
            String queryArticleSql="select author_id,title,content,published_at from articles where id= ? ";
            try(PreparedStatement statement =connection .prepareStatement(queryArticleSql ) ){
                //绑定sql语句中的占位符
                statement .setString(1,id);
                try(ResultSet resultSet =statement .executeQuery() ){
                    if(!resultSet .next()){
                        System.out.println("** 没有这篇文章！！");
                        return;
                    }
                    authorId =resultSet .getString("author_id");//作者 id
                    title =resultSet .getString("title") ;//文章标题
                    content =resultSet .getString("content") ;//文章正文
                    publishedAt =resultSet .getString("published_at") ;//文章发表时间

                }
            }

            //2.查询点赞数量
            String likeCountSql="select count(*) from like_relations where article_id= ? ";
            try(PreparedStatement statement =connection .prepareStatement(likeCountSql ) ){
                statement .setString(1,id);//id 文章id
                try(ResultSet resultSet =statement .executeQuery() ){
                    resultSet .next();
                    likeCount =resultSet .getInt(1) ;//点赞数
                }
            }

            //3.查询评论信息
            List<String[]> commentList=new ArrayList<>() ;
            String queryCommentSql="select user_id,content,published_at from comments where article_id=? order by published_at desc ";
            try(PreparedStatement statement =connection .prepareStatement(queryCommentSql ) ){
                statement.setString(1,id);
                try(ResultSet resultSet =statement .executeQuery() ){
                    while(resultSet .next() ){
                        String[] comment=new String[3];
                        comment [0]=resultSet .getString("user_id") ;
                        comment [1]=resultSet .getString("content") ;
                        comment [2]=resultSet .getString("published_at");
                        //查出评论信息并放到 commentList
                        commentList.add(comment );
                    }
                }
            }

            //4.根据 用户id查询用户昵称
            //用户id来自（作者id+评论者id）
           Set<String> userIdSet=new HashSet<>() ;
            userIdSet .add(authorId );
            for(String[] comment: commentList ){
                userIdSet .add(comment[0]);
            }

            StringBuilder queryNicknameSql=new StringBuilder( "select id,nickname from users where id in (");
            for(int i=1;i<userIdSet .size() ;i++){
                queryNicknameSql .append("?,") ;
            }
            queryNicknameSql .append("?)") ;

            Map<String,String> userIdNicknameMap=new HashMap<>() ;
            try(PreparedStatement statement =connection .prepareStatement(queryNicknameSql .toString() ) ){
                int i=1;
                for(String userId:userIdSet ){
                    statement.setString(i++,userId ) ;
                }
                try(ResultSet resultSet =statement .executeQuery() ){
                    while(resultSet .next() ){
                        userIdNicknameMap .put(resultSet .getString("id"),resultSet .getString("nickname") ) ;
                    }
                }
            }

            //5.根据所有的信息进行显示
            System.out.print("文章标题：");
            System.out.println(title );
            System.out.print("文章作者：");
            System.out.println(userIdNicknameMap.get(authorId ));
            System.out.print("文章发表时间：");
            System.out.println(publishedAt );
            System.out.println("点赞人数："+likeCount );
            System.out.println("====================================================");
            System.out.print("文章正文：");
            System.out.println(content );
            System.out.println("====================================================");
            System.out.println("评论者的相关内容:");
            for(String[] comment:commentList ){
                System.out.println(userIdNicknameMap .get(comment[0])+"|"+comment [1]+"|"+comment [2]);
            }

        }catch(SQLException e){
            System.out.println("错误："+e.getMessage() );
        }
    }
}
