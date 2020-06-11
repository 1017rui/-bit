package blog;

import javax.jws.soap.SOAPMessageHandlers;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * @author 张瑞瑞
 * @date 2020/06/11 8:53
 */
//评论指定文章-要求先登录
public class CommentArticleAction implements Action {
    @Override
    public void run() {
        if(!User.isLogined() ){
            System.out.println("** 需要先登录，才能操作该功能！！");
            return;
        }
        //提示用户输入信息
        System.out.println("发表评论中 ...");
        Scanner scanner=new Scanner(System.in);
        System.out.print("请输入要评论文章的id>");
        //输入文章id
        int articleId=scanner.nextInt();
        System.out.print("请输入你要评论的内容>");
        String  content=scanner.next();
        //当前登录的用户id即为评论者id
        int UserId=User.getCurrentUser().id;
        //获取当前时间
        Date publishedAt=new Date();
        DateFormat format =new SimpleDateFormat("yyyy-MM-dd HH:mm:ss") ;
        String publishedAtStr=format .format(publishedAt ) ;

        // 现在信息已经获取完全，通过 jdbc 执行 insert 操作
        //获取connection
        try(Connection connection =DBUtil .getConnection() ) {
            String sql="insert into comments(user_id,article_id,published_At,content) values (?,?,?,?)";
            try(PreparedStatement statement =connection .prepareStatement(sql) ) {
                //使用具体的值替换占位符
                statement .setInt(1,UserId);
                statement .setInt(2,articleId) ;
                statement .setString(3,publishedAtStr ) ;
                statement .setString(4,content ) ;

                statement .executeUpdate() ;
                System.out.println("**评论发表成功！！");
            }

        }catch(SQLException e){
            System.out.println("错误："+e.getMessage() );
        }
    }
}
