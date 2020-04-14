import java.util.Arrays;
import java.util.Scanner;

/**
 * @author 张瑞瑞
 * @date 2020/04/14 12:39
 */
//有一组数据，只有一个数字是出现一次，其他是两次，请找出这个数字
/*public class TestDemo {
    public static void find(int[]array){
        for(int i=0;i<array.length;i++){
            int count=0;
            for(int j=0;j<array.length;j++){
                if(array[i]==array[j]){
                    count++;
                }
            }
           if(count==1){
               System.out.println(array[i]);
           }
        }
    }
    public static void main(String[] args) {
        int[]array={1,2,4,2,6,1,6,5,4};
        find(array);
    }
}*/
//求斐波那契数列的第n项。(迭代实现)
    //1 1 2 3 5 8 13 21 34
/*public class TestDemo{
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
}*/
//求1！+2！+3！+4！+........+n!的和
/*public class TestDemo{
    public static int sumOfFactorial (int n){
        int sum=0;
        for(int i=1;i<=n;i++){
            int ret=1;
            for(int j=1;j<=i;j++){
                ret=ret*j;
            }
            sum=sum+ret;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int ret=sumOfFactorial(n);
        System.out.println(ret);
    }
}*/
//求 N 的阶乘
/*public class TestDemo{
    public static int factor(int n){
        int ret=1;
        for(int i=1;i<=n;i++){
            ret=ret*i;
        }
        return ret;
    }
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int n=scanner.nextInt();
        int ret=factor(n);
        System.out.println(ret);
    }
}*/
//调整数组顺序使得奇数位于偶数之前。调整之后，不关心大小顺序。
/*public class TestDemo{
    public static int[] adjust(int[] array){
        int[] ret=new int[array.length];
        int left=0;
        int right=array.length-1;
        for(int i=0;i<array.length;i++){
            if(array[i]%2!=0){
                ret[left]=array[i];
                left++;
            }else if(array[i]%2==0){
                ret[right]=array[i];
                right--;
            }
        }
        return ret;
    }
    public static void main(String[] args) {
        int[]array={1,2,3,4,5,6,7,8,9,10};
        int[]ret=adjust(array);
        System.out.println(Arrays.toString(ret));
    }
}*/
//创建方法求两个数的最大值max2，随后再写一个求3个数的最大值的函数max3。
//​ 要求：在max3这个函数中，调用max2函数，来实现3个数的最大值计算
/*public class TestDemo{
    public static int max2(int a,int b){
        return (a>b?a:b);
    }
    public static int max3(int a,int b,int c){
        return (max2(max2(a,b),c));
    }
    public static void main(String[] args) {
        int a=10;
        int b=30;
        int c=50;
        int ret2=max2(a,b);
        int ret3=max3(a,b,c);
        System.out.println("ret2="+ret2+",ret3="+ret3);
    }
}*/
//在同一个类中定义多个方法：
// 要求不仅可以求两个整数的最大值，还可以求两个小数的最大值，以及两个小数和一个整数的大小关系
/*public class TestDemo{
    public static int max(int a,int b){
        return (a>b?a:b);
    }
    public static double max(double a,double b){
        return (a>b?a:b);
    }
    public static double max(int a,double a1,double b1 ){
        return max(max(a1,b1),a);
    }
    public static void main(String[] args) {
        int a=10;
        int b=20;
        double a1=12.3;
        double b1=23.4;
        int ret1=max(a,b);
        double ret2=max(a1,b1);
        double ret3=max(a,a1,b1);
        System.out.println("ret1="+ret1+",ret2="+ret2+",ret3="+ret3);
    }
}*/
//在同一个类中,分别定义求两个整数的方法 和 三个小数之和的方法。 并执行代码，求出结果
/*public class TestDemo{
    public static int sum(int a,int b){
        return (a+b);
    }
    public static double sum(double a,double b,double c){
        return (a+b+c);
    }
    public static void main(String[] args){
        int a=10;
        int b=20;
        double a1=12.3;
        double b1=23.4;
        double c1=34.5;
        int ret1=sum(a,b);
        double ret2=sum(a1,b1,c1);
        System.out.println("ret1="+ret1+",ret2="+ret2);
    }
}*/
//青蛙跳台阶问题
/*public class TestDemo{
    public static int jump(int n){
        if(n==1){
            return 1;
        } else if(n==2){
            return 2;
        }else {
            return (jump(n-1)+jump(n-2));
        }
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int ret=jump(n);
        System.out.println(ret);
    }
}*/
//递归求解汉诺塔问题
/*
public class TestDemo{
    public static void move(char pos1 ,char pos2)
    {
        System.out.print(pos1+"->"+pos2+" ");//从pos1位置挪动到pos2位置
    }
    //A起始的桩子
    //B经过的桩子
    //C目的地桩子
    public static void hanoi(int n,char A,char B,char C){
        if(n==1){
            move(A,C);
        }else{
            hanoi(n-1,A,C,B);
            move(A,C);
            hanoi(n-1,B,A,C);

        }
    }
    public static void main(String[] args) {
       hanoi(1,'A','B','C');
        System.out.println();
        hanoi(2,'A','B','C');
        System.out.println();
        hanoi(3,'A','B','C');
    }
}
*/
//递归求斐波那契数列的第 N 项
/*public class TestDemo{
    public static int fib(int n){
        if((n==1)||(n==2)){
            return 1;
        }else{
            return (fib(n-1)+fib(n-2));
        }
    }
    public static void main(String[] args) {
       Scanner scanner =new Scanner(System.in);
       int n=scanner.nextInt();
       int ret=fib(n);
        System.out.println(ret);
    }
}*/
//写一个递归方法，输入一个非负整数，返回组成它的数字之和
    //1234  10
/*public class TestDemo{
    public static int sum(int n){
        if(n>9){
            return sum(n/10)+n%10;
        }else{
            return n;
        }
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int num=scanner.nextInt();
        int ret=sum(num);
        //sum(1234)
        //sum(123)+4
        //sum(12)+3+4
        //sum(1)+2+3+4
        //1+2+3+4=10
        System.out.println(ret);
    }
}*/
//按顺序打印一个数字的每一位(例如 1234 打印出 1 2 3 4) （递归）
/*public class TestDemo{
    public static void printEveryBit(int n){
        if(n>9){
            printEveryBit(n/10);
        }
        System.out.print(n%10+" ");

    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        printEveryBit(n);
        //printEveryBit(1234)
        //printEveryBit(123)+4
        //printEveryBit(12)+3+4
    }
}*/
//递归求 1 + 2 + 3 + ... + 10
/*public class TestDemo{
    public static int sum(int n){
        if(n==1){
            return 1;
        }
        return sum(n-1)+n;
    }
    public static void main(String[] args) {
        int ret=sum(10);
        System.out.println(ret);
    }
}*/
//递归求 N 的阶乘
/*
public class TestDemo{
    public static int fac(int n){
        if(n==1){
            return 1;
        }
        return n*fac(n-1);
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int ret=fac(n);
        System.out.println(ret);
    }
}*/
//实现一个方法 avg, 以数组为参数, 求数组中所有元素的平均值(注意方法的返回值类型).
/*public class TestDemo{
    public static double avg(int[]array){
        int sum=0;
        for(int i=0;i<array.length;i++){
            sum=sum+array[i];
        }
        double avg=(double)sum/array.length;
        return avg;
    }
    public static void main(String[] args) {
        int[]array={1,2,3,4,5,6,7,8,9,10};
        double ret=avg(array);
        System.out.println(ret);
    }
}*/
//实现一个方法 sum, 以数组为参数, 求数组所有元素之和.
/*public class TestDemo{
    public static int sum(int[]array){
        int sum=0;
        for(int i=0;i<array.length;i++){
            sum=sum+array[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        int[]array={1,2,3,4,5,6,7,8,9,10};
        int ret=sum(array);
        System.out.println(ret);
    }
}*/
//实现一个方法 transform, 以数组为参数, 循环将数组中的每个元素 乘以 2 ,
// 并设置到对应的数组元素上. 例如 原数组为 {1, 2, 3}, 修改之后为 {2, 4, 6}
/*public class TestDemo{
    public static void transform(int[] array){
        for(int i=0;i<array.length;i++){
            array[i]=array[i]*2;
        }
    }
    public static void main(String[] args) {
        int[]array={1,2,3,4,5};
        transform(array);
        System.out.println(Arrays.toString(array));
    }
}*/
//实现一个方法 printArray, 以数组为参数, 循环访问数组中的每个元素, 打印每个元素的值.
/*public class TestDemo{
    public static void printArray(int[]array){
       *//* for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }*//*
       for(int x:array){
           System.out.print(x+" ");
       }
    }
    public static void main(String[] args) {
        int[]array={1,2,3,4,5,6,7,8,9,10};
        printArray(array);
    }
}*/
//创建一个 int 类型的数组, 元素个数为 100, 并把每个元素依次设置为 1 - 100
/*
public class TestDemo{
    public static void setValue(int[]array){
        for(int i=0;i<array.length;i++){
            array[i]=i+1;
        }
    }
    public static void main(String[] args) {
        int[]array=new int[100];
        setValue(array);
        System.out.println(Arrays.toString(array));
    }
}*/
//实现两个数的交换
/*public class TestDemo{
    public static void swap(int a,int b){
        int tmp=a;
        a=b;
        b=tmp;
    }
    public static void main(String[] args) {
        int a=10;
        int b=20;
        swap(a,b);
        System.out.println("a="+a+",b="+b);

    }
}*/
//会发现结果并不会发生任何改变，因为int是简单类型，形参相当于是实参的一份临时拷贝，
/*
public class TestDemo{
    public static void swap(int[]array){
        int tmp=array[0];
        array[0]=array[1];
        array[1]=tmp;
    }
    public static void main(String[] args) {
        int[]array={10,20};
        swap(array);
       // System.out.println(Arrays.toString(array));
        System.out.println("a="+array[0]+",b="+array[1]);
    }
}*/
//汉诺塔
public class TestDemo{
    //封装一个模拟鼠标移动的方法
    public static void move(char f1,char f2){
        System.out.print(f1+"->"+f2+" ");
    }
   /* n  圆盘的个数
      f1  起始的柱子
      f2  途径的柱子
      f3  目的地柱子*/
    public static void hanoi(int n,char f1,char f2,char f3){
        if(n==1){
            move(f1,f3);
        }else{
            hanoi(n-1,f1,f3,f2);
            move(f1,f3);
            hanoi(n-1,f2,f1,f3);
        }

    }
    public static void main(String[] args) {
        hanoi(1,'A','B','C');
        System.out.println();
        hanoi(2,'A','B','C');
        System.out.println();
        hanoi(3,'A','B','C');
        //运行发现结果和刚才分析一致
    }

}