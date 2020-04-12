
import java.util.Scanner;
//调试  打断点：让代码走到这一步停下来
//2.开始调试
public class TestDemo {
    //迭代==循环
    public static int fib1(int n) {//非递归实现
        int a1=1;
        int b2=1;
        int c3=1;//考虑到n为1，2的情况
        for(int i=3;i<=n;i++){
            c3=a1+b2;
            a1=b2;
            b2=c3;
        }
        return c3;
    }
    //4 求斐波那契数列的第 N  不适合使用递归，效率太低（会重复计算）
    public static int fib(int n){
        if(n==1||n==2){
            return 1;
        }
        return fib(n-1)+fib(n-2);
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int ret=fib1(10);
        System.out.println(ret);
    }
    //写一个递归方法，输入一个非负整数，返回组成它的数字之和. 例如，输入 1729, 则应该返回1+7+2+9， 它的和是19
    public static int func1(int n){
        if(n>9){
            return n%10+func1(n/10);
        }
        return n;
    }
    public static void main11(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int ret=func1(1729);
        System.out.println(ret);
    }
    //2 递归求 1 + 2 + 3 + ... + 10
    public static int sum(int n){
        if(n==1){
            return 1;
        }
        return n+sum(n-1);
    }
    public static void main9(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int ret=sum(10);
        System.out.println(ret);
}
    // 按顺序打印一个数字的每一位(例如 1234 打印出 1 2 3 4)
    public static void print(int n){
        if(n>9){
            print(n/10);
        }
        System.out.print(n%10);
    }
    public static void main8(String[] args) {
     Scanner scanner=new Scanner(System.in);
     print(123);
    }
    //方法的递归
    //求n的阶乘
  //  n!=n*(n-1)!
    public static int fac(int n){
        if(n==1){
            return 1;
        }
        return n*fac(n-1);
    }
    public static void main7(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int ret=fac(n);
        System.out.println(ret);
    }
    //java当中方法写到前面和后面都可以

    //方法的重载和重写的区别：
    //重载（overload）：1.方法名相同2.返回值不做要求3.参数列表不同（参数个数或类型不同）4.同一个类当中
    //注释快捷键 ctrl+/  ctrl+shift+/
    public static int sum(int a,int b){
        return (a+b);
    }
    public static double sum(double a,double b){
        return (a+b);
    }
    public static int sum(int a,int b,int c){
        return (a+b+c);
    }
    public static int sum(int a,int b,int c,int d){
        return (a+b+c+d);
    }
    public static void swap(int x,int y){
        int tmp=x;
        x=y;
        y=tmp;
    }//不能实现交换两个数字，只是交换了x,y，并没有交换a,b
    //对于基础类型来说, 形参相当于实参的拷贝. 即 传值调用
    public static void main6(String[] args) {
        int a=10;
        int b=20;
        swap(a,b);
        System.out.println("a="+a+"b="+b);
    }

    /*public static int factor(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
           sum+=fac(i);
        }
        return sum;
    }*/
/*public static int fac(int i){
    int ret = 1;
    for (int j = 1; j <= i; j++) {
        ret *= j;
    }
    return ret;
}*/

    public static void main5(String[] args) {
      //求阶乘之和
        Scanner scanner=new Scanner(System.in);
        int n1=scanner.nextInt();
       // System.out.println(factor(n1));
    }
public static int maxNum(int num1,int num2){
    return num1>num2?num1:num2;
}
//求三个数的最大值
    public static int maxThreeNum(int num1,int num2,int num3) {
        return maxNum(maxNum(num1,num2),num3);
    }

    public static void main4(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n1=scanner.nextInt();
        int n2=scanner.nextInt();
        int n3=scanner.nextInt();

        int ret=maxNum(n1,n2);

        System.out.println(ret);
        System.out.println(maxThreeNum(n1,n2,n3));

    }
    public static void main3(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        for(int i=31;i>=1;i-=2) {
            System.out.print(((n>>i)&1)+" ");
        }
        System.out.println();
        for(int i=30;i>=0;i-=2) {
            System.out.print(((n>>i)&1)+" ");
        }
        System.out.println();
        }

    public static void main2(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int count=0;
        while(n!=0) {
            n=n&(n-1);
            count++;
        }
        System.out.println(count);
        }

    public static void main1(String[] args) {//psvm
        //System.out.println("hello");//sout
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        //判断2进制1的个数：让当前数字和1进行与操作 整型有32位
        int count=0;
        for(int i=0;i<32;i++) {
            if(((n>>i)&1)==1) {
                count++;
            }
        }
        System.out.println(count);
        }
    }

