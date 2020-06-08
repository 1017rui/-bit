package blog;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

/**
 * @author 张瑞瑞
 * @date 2020/06/08 19:12
 */
//负责用户登录功能
public class UserLoginAction implements Action  {
    @Override
    public void run() {

        System.out.println("开始用户登录...");
        System.out.println();

        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入用户名称> ");
        String username = scanner.nextLine();
        System.out.print("请输入密码> ");
        String password = scanner.nextLine();


        try(Connection connection =DBUtil .getConnection() ){
            String sql="select id,nickname from users where username= ? and password= ? ";
            try(PreparedStatement statement = connection .prepareStatement(sql)){
                //去读取用户输入，并且使用用户输入内容替换占位符
                statement.setString(1, username);//用户名
                statement.setString(2, password);//密码
                try(ResultSet resultSet =statement .executeQuery() ){
                    if(resultSet .next() ){
                        int id=resultSet .getInt(1) ;
                        String nickname=resultSet .getString(2) ;
                        User user=new User();
                        user.id=id;
                        user.username =username ;
                        user.nickname =nickname ;
                        //进行用户登录
                        user.login(user);

                    }else{
                        System.out.println("** 用户名或者密码错误，请重新输入!!");
                    }

                }
            }

        } catch (SQLException e) {
            System.out.println("错误: " + e.getMessage());
        }
        // 搞定用户登录的过程
        // 根据 username + password 判断用户是否登录成功
        // select id, nickname from users where username = ? and password = ?

    }
}
