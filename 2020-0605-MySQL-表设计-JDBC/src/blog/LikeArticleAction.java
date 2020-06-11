package blog;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

/**
 * @author 张瑞瑞
 * @date 2020/06/11 10:24
 */
//点赞指定文章-要求先登录
public class LikeArticleAction implements Action  {
    @Override
    public void run() {
        if(!User.isLogined() ){
            System.out.println("**需要先登录，才能操作该功能！！");
            return ;
        }
        //提示用户输入相关信息
        System.out.println("进行点赞...");
        Scanner scanner=new Scanner(System .in);
        System.out.print("请输入你要点赞的文章id>");
        int articleId=scanner.nextInt() ;
        //当前登录的用户id即为评论者id
        int userId=User.getCurrentUser() .id;

        //拿到connection
        try(Connection connection =DBUtil .getConnection() ){
            String sql="insert into like_relations (user_id,article_id) values (?,?)";
            try(PreparedStatement statement =connection .prepareStatement(sql) ){
                //指定占位符中的值
                statement .setInt(1,userId ) ;
                statement .setInt(2,articleId ) ;

                statement .executeUpdate() ;
                System.out.println("**点赞成功！！");
            }
        }catch(SQLException e){
            System.out.println("错误："+e.getMessage() );
        }
    }
}
