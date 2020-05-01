import book.BookList;
import user.Admin;
import user.NormalUser;
import user.User;

import java.util.Scanner;

/**
 * @author 张瑞瑞
 * @date 2020/04/30 19:27
 */
//主函数
public class TestMain {
    public static User login(){//发生了向上转型
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入姓名：");
        String name=scanner.nextLine();
        System.out.println("请输入你的身份：1>管理员，2>普通用户");
        int choice=scanner.nextInt();
        if(choice ==1){//管理员
            return new Admin(name) ;
        }else{//普通用户
            return new NormalUser(name);
        }
    }

    public static void main(String[] args) {
        //1.准备书籍
        BookList bookList=new BookList();
        //2.登录
        User user=login();
        while(true) {
            int choice = user.menu();
            //选择是啥，对应那个方法
            user.doOperation(bookList, choice);
        }
    }
}
