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
        /*
         根据 username + password 判断用户是否登录成功
         select id, nickname from users where username = ? and password = ?
         */
        // 1. 提示用户输入需要的信息，并且使用 jdbc 执行 sql
        System.out.println("开始用户登录...");
        System.out.println();
        //读取用户的输入信息
        Scanner scan=new Scanner(System.in);
        System.out.print("请输入用户名> ");
        String username=scan.nextLine();
        System.out.print("请输入密码> ");
        String password=scan.nextLine();
        //获取connection
        try(Connection connection = DBUtil.getConnection() ){
            //通过Connection获取PreparedStatement
            String sql="select id,nickname from users where username= ? and password= ? ";
            try(PreparedStatement statement =connection .prepareStatement(sql) ){
                //通过setxxx()系列的操作填充PrepareStatement中的占位符
                statement .setString(1,username );
                statement .setString(2,password );
                //根据有无结果执行相应的操作
                //由于有结果，则执行executeQuery()
                try(ResultSet resultSet =statement .executeQuery() ){
                    //因为username是唯一的
                    //所以查找的过程要不返回1行数据，要不返回0行数数据
                    //不可能找到多个
                    if(resultSet .next() ){
                        int id=resultSet .getInt(1);
                        String nickname=resultSet .getString(2) ;
                        User user=new User();
                        //属性值绑定
                        user.id=id;
                        user.username=username;
                        user.nickname =nickname ;
                        //用户登录
                        User.login(user) ;
                    }else{
                        System.out.println("**用户名或者密码错误，请重新输入！！");
                    }
                }
            }
        }catch(SQLException e){
            //出现异常打印错误信息
            System.out.println("错误："+e.getMessage() );
        }
    }
}
