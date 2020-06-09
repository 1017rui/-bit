package blog;

import java.sql.*;
import java.util.Scanner;

// 完整实现用户注册的功能   所有的事情在这里自行完成。
public class UserRegisterAction implements Action {
    @Override
    public void run() {
        // 1. 提示用户输入需要的信息，并且使用 jdbc 执行 sql
        System.out.println("开始用户注册...");
        System.out.println();

        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入用户名称> ");
        String username = scanner.nextLine();
        System.out.print("请输入用户昵称> ");
        String nickname = scanner.nextLine();
        System.out.print("请输入密码> ");
        String password = scanner.nextLine();


        //获取Connection
        try (Connection connection = DBUtil.getConnection()) {
            String sql = "insert into users (username, nickname, password) values (?, ?, ?)";
            //通过Connection获取PreparedStatement
            try (PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS )) {
                //通过setxxx()系列的操作填充PrepareStatement中的占位符
                statement.setString(1, username);
                statement.setString(2, nickname);
                statement.setString(3, password);
                //根据有无结果执行相应的操作
                //由于没有结果，则执行executeUpdate()
                statement.executeUpdate();



                //获取用户id

                //在这个语句中PreparedStatement statement = connection.prepareStatement(sql )添加 , Statement.RETURN_GENERATED_KEYS，如上所示。
                // Statement.RETURN_GENERATED_KEYS 返回生成的keys
                int id;
                //通过ResultSet获取信息
                try (ResultSet r = statement.getGeneratedKeys()) {//返回生成的自增主键
                    //获取一行一列信息
                    r.next();
                    id = r.getInt(1);
                }

                System.out.println("注册成功，欢迎您的加入，" + nickname);

                // 是否应该让刚注册的这个用户自动登录成功呢？还是让该用户重新登录？
                // 两种方法都可以接受，我们选择让其自动登录成功
                //创建了一个用户对象
                User user = new User();
                //填写它的属性

                //因为注册成功就直接需要登录
                //所以我们需要刚注册成功的用户id信息

                //用户表中的id来自 自增主键
                //insert之前，我们并不清楚，本次insert成功后 id会是什么。
                //所以我们需要通过sql获取insert成功后的id信息
                user.id = id;
                user.nickname = nickname;
                user.username = username;
                User.login(user);
            }
        } catch (SQLException e) {
            //出错 打印错误信息
            System.out.println("错误: " + e.getMessage());
        }
    }
}
