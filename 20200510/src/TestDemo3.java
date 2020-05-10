/**
 * @author 张瑞瑞
 * @date 2020/05/10 14:13
 * 用户登录
 */
class UserException extends Exception{
    public UserException (String message){
            super(message);

    }
}
class PasswordException extends Exception{
    public PasswordException (String message){
        super(message);

    }
}

public class TestDemo3 {
    private static String userName="admin";
    private static String password="123456";
    public static void login(String userName ,String password) throws UserException ,PasswordException {
        if(!TestDemo3.userName .equals(userName ) ){
            throw new UserException("用户名错误") ;
        }
        if(!TestDemo3.password  .equals(password ) ){
            throw new PasswordException("密码错误") ;
        }
        System.out.println("登陆成功");
    }
    public static void main(String[]args){
       try{
           login("Admin","123456");
       }catch(UserException e){
          e.printStackTrace() ;
       }catch(PasswordException e){
           e.printStackTrace() ;
       }

    }
}
