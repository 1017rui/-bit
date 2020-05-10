import java.util.Scanner;

/**
 * @author 张瑞瑞
 * @date 2020/05/10 13:05
 */
class Person implements Cloneable {
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
public class TestDemo {
    public static void main(String[] args) {
        Person person=new Person() ;
        try {
            Person person2=(Person)person.clone() ;
        } catch (CloneNotSupportedException e) {//编译时期异常  特点：在运行之前处理完。
            e.printStackTrace();
        }
    }
    public static int divide (int x,int y) throws UnsupportedOperationException{
        if(y==0){
            throw new UnsupportedOperationException("x==0") ;
        }
        return x/y;
    }
    //抛出异常 一般抛出你想抛出的异常（还可自定义）
    public static void main5(String[] args) {
        try{
            double ret= divide(20,0);
            System.out.println(ret);
        }catch(UnsupportedOperationException e){
            e.printStackTrace() ;
        }

    }
    public static void func1() {
        int[] arr = {1, 2, 3};
        System.out.println(arr[100]);
    }
    public static void main4(String[] args) {
       // func1() ;
      try {
        func1();
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }
        System.out.println("after try catch");
    }

    public static int func(){
        int[]array={1,2,3};
        try {
            System.out.println(array[3]);
            return 1;
        } catch(ArrayIndexOutOfBoundsException e){
            e.printStackTrace() ;
            System.out.println("捕获到了数组越界异常");
            return 3;
        }finally {
            return 2;//永远会被执行。

        }
    }
    public static void main3(String[] args) {
        /*int ret=func();
        System.out.println(ret);
*/
        Scanner scn=new Scanner(System.in);
        try{
            int n=scn.nextInt() ;
            System.out.println(10/n);
        }catch(ArithmeticException e){
            e.printStackTrace() ;
            System.out.println("捕获到了算术异常");
        }finally {
            scn.close() ;//关闭资源
        }
    }

    public static void main2(String[] args) {
        int[]array={1,2,3};
        try {
            System.out.println(array[3]);
            System.out.println("hahaha");//不会被执行
        } catch(NullPointerException e){
            e.printStackTrace() ;//查看出现异常代码的调用栈
            System.out.println("捕获到了空指针异常");
        }catch(ArrayIndexOutOfBoundsException e){
            e.printStackTrace() ;//查看出现异常代码的调用栈
            System.out.println("捕获到了数组越界异常");
        }finally {
            System.out.println("finally块的代码一定会执行！");
            //所以经常做一些善后工作，如：关闭资源。
        }
        System.out.println("hello");//使用try catch 捕获之后这个语句可以被打印。
    }
    public static void main1(String[] args) {
        int[]array={1,2,3};
        array=null;
        System.out.println(array[2]);//会出现空指针异常
        //System.out.println(array[3]);//会出现 数组下标越界异常
        //int a=10/0;//会出现 算术异常。
       //System.out.println(a);
    }
}
