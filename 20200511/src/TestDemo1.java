import java.util.Scanner;

/**
 * @author 张瑞瑞
 * @date 2020/05/11 21:42
 */
//实现一个简单的控制台版用户登陆程序, 程序启动提示用户输入用户名密码. 如果用户名密码出错, 使用自定义异常的方式来处理
class UserException extends Exception {//用户名错误异常
    public UserException() {
        super();
    }
    public UserException(String message) {
        super(message);
    }
}
class PasswordException extends Exception {//密码错误异常
    public PasswordException() {
        super();
    }

    public PasswordException(String message) {
        super(message);
    }
}
public class TestDemo1 {
    private static String user="admin";
    private static String password="123456";
    public static void admin(String user,String password) throws UserException, PasswordException {
        if(!TestDemo1 .user.equals(user) ){
            throw new UserException("用户名错误！") ;
        }
        if(!TestDemo1 .password .equals(password ) ){
            throw new PasswordException("密码错误！") ;
        }
        System.out.println("登陆成功！");
    }
    public static void main(String[] args)  {
        Scanner scan=new Scanner(System.in);
        String user=scan.nextLine() ;
        String password=scan.nextLine() ;
        try {
            admin(user,password );
        } catch (UserException e) {
            e.printStackTrace();
        } catch (PasswordException e) {
            e.printStackTrace();
        }
    }
}
