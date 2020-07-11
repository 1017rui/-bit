package lab;

import java.util.ArrayList;
import java.util.List;

public class User {
    String username;
    String password;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }
    //提前准备一些用户
    private static final List<User> userList=new ArrayList<>();
    static{
        userList.add(new User("zrr","0210"));
        userList.add(new User("zjx","0417"));
        userList.add(new User("aq","0513"));
        userList.add(new User("dirb","0603"));
        userList.add(new User("lg","0520"));
    }

    //实现登录
    public static User login(String username, String password) {
        //本质是一个查找过程。
        for(User user:userList){
            if(user.username.equals(username)&&user.password.equals(password)){
                return user;
            }
        }
        return null;
    }

    //实现注册
    public static User register(String username, String password) {
        User user=new User(username,password);
        userList.add(user);
        return user;
    }
}
