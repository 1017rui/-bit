package blog;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

/**
 * @author 张瑞瑞
 * @date 2020/06/11 10:48
 */
//取消点赞指定文章-要求先登录
public class CancelLikeArticleAction implements Action  {
    @Override
    public void run() {
       if(!User.isLogined() ){
           System.out.println("** 需要先登录，才能操作该功能！！");
           return;
       }
        System.out.println("取消点赞...");
       Scanner scanner=new Scanner(System.in);
        System.out.print("你输入你要取消点赞的文章id>");
        int articleId=scanner .nextInt() ;
        //当前登录id即为评论者id
        int userId=User.getCurrentUser() .id;

        try(Connection connection =DBUtil .getConnection() ){
            String sql="delete from like_relations where user_id=? and article_id=?";
            try(PreparedStatement statement =connection .prepareStatement(sql) ){
                statement .setInt(1,userId ) ;
                statement .setInt(2,articleId ) ;

                statement .executeUpdate() ;
                System.out.println("**成功取消点赞！！");
            }

        }catch(SQLException e){
            System.out.println("错误："+e.getMessage() );
        }
    }
}
