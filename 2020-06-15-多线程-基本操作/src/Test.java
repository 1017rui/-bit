
import java.util.Scanner;

/**
 * @author 张瑞瑞
 * @date 2020/06/16 19:06
 */
class A{
    public A(String str){

    }
    public static void func1(){

    }
    public void func3(){

    }
}

public class Test {
    private static void func2(){

    }
    public static int addAB(int A, int B) {
        // write code here
       int m=A^B;//异或与求和的结果基本一致
       int n=(A&B)<<1;//与运算与进位结果一致
       int sum=m+n;
       return sum;
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
       while(scan.hasNext() ){
           int a=scan.nextInt();
           int b=scan.nextInt();
           int num=addAB(a,b) ;
           System.out.println(num);
       }
    }
    public static void main4(String[] args) {
        A a=new A("12");
       a.func3() ;//可以实例方法通过对象名调用
        A.func1() ;//可以通过类名调用其他类中的方法
        func2() ;
    }

    public static void main3(String[] args) {
        String f1=args[1];
        String f2=args[2];
        String f3=args[3];
        System.out.println(args.toString() );

    }
    public static void main2(String[] args) {
        int a=10;
        double b=3.14;
        System.out.println('A' + a + b);
    }
    public static void main1(String[] args) {
        A class1=new A("he");
        A class2=new A("he");
        System.out.println(class1 ==class2);
    }
}
