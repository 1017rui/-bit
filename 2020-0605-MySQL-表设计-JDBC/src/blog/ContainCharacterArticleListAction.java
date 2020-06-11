package blog;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

/**
 * @author 张瑞瑞
 * @date 2020/06/11 11:29
 */
//查找标题中包含某些字符的文章列表
public class ContainCharacterArticleListAction implements Action  {
    @Override
    public void run() {
        Scanner scanner=new Scanner(System.in);
        System.out.print("请输入文章标题中需要包含的字符>");
        String str=scanner.nextLine() ;

        //获取connection
        try(Connection connection=DBUtil .getConnection() ){

            //articleList存放多篇文章的信息  存放多个字符串数组
            List<String[]> articleList=new ArrayList<>() ;

            String sql="select id,author_id,title,published_at from articles order by  published_at desc";
            //通过connection获取PreparedStatement
            try(PreparedStatement statement =connection .prepareStatement(sql) ){

                try(ResultSet resultSet =statement .executeQuery() ) {
                    while (resultSet.next()) {
                        String[] article = new String[4];
                        String id = resultSet.getString("id");
                        String authorId = resultSet.getString("author_id");
                        String title = resultSet.getString("title");
                        String publishedAt = resultSet.getString("published_at");
                        article[0] = id;
                        article[1] = authorId;
                        article[2] = title;
                        article[3] = publishedAt;
                        //如果标题当中包含这些字符 才把这篇文章的相关信息放入到articlelist 中
                        if(title.contains(str) ){
                            articleList.add(article);
                        }
                    }
                }
            }

            // TODO: 打印作者的昵称而不是id信息
            // 需要根据作者 id，再次去 users 表中查询出 用户的昵称信息
            //利用set中不会存在重复元素的特性

            //把所有的作者id放入authorIdSet中
            Set<String> authorIdSet=new HashSet<>() ;
            for(String[] article:articleList ){
                String authorId=article [1];
                authorIdSet.add(authorId );
            }

            //使用提取出的作者 id，拼接出一个根据id 查询作者昵称的sql语句。
            //select id，nickname from users where id in (...)
            //因为占位符需要多少个也不清楚，所以需要动态生成。
            StringBuilder querysql = new StringBuilder("select id,nickname from users where id in (");

            for(int i=1;i<authorIdSet .size();i++){
                querysql.append("?,");
            }
            querysql.append("?)");

            System.out.println("DEBUG:"+querysql.toString() );
            /*
            key  id
            value  nickname
             */
            Map<String,String> userIdNicknameMap=new HashMap<>();
            //通过connection获取PreparedStatement
            try(PreparedStatement statement =connection .prepareStatement(querysql.toString() ) ){
                int i=1;
                for(String id:authorIdSet ){
                    //绑定querysql语句中的占位符
                    statement .setString(i++,id) ;
                }

                try(ResultSet resultSet =statement .executeQuery() ){
                    while(resultSet .next()) {
                        String id = resultSet.getString("id");
                        String nickname = resultSet.getString("nickname");
                        userIdNicknameMap.put(id, nickname);
                    }
                }
            }

            //打印信息
            System.out.printf("#ID  | 标题           | 作者       | 发表时间%n");
            for (String[] article : articleList) {
                String id=article [0];
                String authorId=article [1];
                String authorNickName=userIdNicknameMap .get(authorId );
                String title=article [2];
                String publishedAt=article [3];
                System.out.printf("%-4s | %-10s | %-10s | %s%n", id,title,authorNickName ,publishedAt);
            }

        }catch(SQLException e){
            System.out.println("错误："+e.getMessage() );
        }
    }
}
