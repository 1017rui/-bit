package user;

import operation.*;

import java.util.Scanner;

/**
 * @author 张瑞瑞
 * @date 2020/05/06 17:05
 * 普通用户
 */
public class NormalUser extends User {
    public NormalUser(String name) {
        super(name);
        this.operations=new IOperation[]{
                new ExitOperation(),
                new FindOperation() ,
                new BorrrowOperation(),
                new ReturnOperation()
        };
    }

    @Override
    public int menu() {
        System.out.println("=====================");
        System.out.println("Hello "+this.name+" 欢迎来到图书系统！！");
        System.out.println("1.查找图书");
        System.out.println("2.借阅图书");
        System.out.println("3.归还图书");
        System.out.println("0.退出系统");
        System.out.println("=====================");
        Scanner scanner=new Scanner(System.in);
        int choice=scanner.nextInt();
        return choice;



    }
}
