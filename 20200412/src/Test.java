import java.util.Scanner;

/**
 * @author 张瑞瑞
 * @date 2020/04/12 18:15
 */
// 递归求 N 的阶乘
/*
public class Test {
    public static int factorial(int n){
        if(n==1){
            return 1;
        }
        return n*factorial(n-1);
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int ret=factorial(n);
        System.out.println(ret);
    }
}
*/
// 递归求 1 + 2 + 3 + ... + 10
/*
public class Test{
    public static int sum(int n){
        if(n==1){
            return 1;
        }
        return n+sum(n-1);
    }
    public static void main(String[] args) {
        int n=10;
        int ret=sum(n);
        System.out.println(ret);
    }
}*/
//写一个递归方法，输入一个非负整数，返回组成它的数字之和.
/*public class Test{
    public static int count(int n){
        if(n<10){
            return n;
        }
        return n%10+count(n/10);
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int ret=count(n);
        System.out.println(ret);
    }
}*/
//按顺序打印一个数字的每一位(例如 1234 打印出 1 2 3 4)
/*
public class Test{
    public static void print(int n){
        if(n>9){
            print(n/10);
        }
        System.out.print(n%10+" ");
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        print(n);
    }
}*/
// 求斐波那契数列的第 N 项
    //1 1 2 3 5 8 13 21 34 55 89……
//递归实现
/*public class Test{
    public static int fib(int n){
        if(n==1||n==2){
            return 1;
        }
        return fib(n-1)+fib(n-2);
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int ret=fib(n);
        System.out.println(ret);
    }
}*/
//非递归实现
public class Test{
    public static int fib(int n){
        int f1=1;
        int f2=1;
        int f3=1;
        for(int i=3;i<=n;i++){
            f3=f1+f2;
            f1=f2;
            f2=f3;
        }
        return f3;
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int ret=fib(n);
        System.out.println(ret);
    }
}