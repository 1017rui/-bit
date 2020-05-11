import java.util.Scanner;

/**
 * @author 张瑞瑞
 * @date 2020/05/11 13:27
 */
class MyException extends Exception  {
    public MyException() {
        super();
    }
    public MyException(String message) {
        super(message);
    }
}
class YouException extends RuntimeException {
    public YouException() {
        super();
    }
    public YouException(String message) {
        super(message);
    }
}
public class TestDemo{
    public static void func1(int a) throws MyException {
        if(a==10){
            throw new MyException("a==10");
        }
    }
    public static void func2(String str) throws YouException {
        if(str.equals("ruizi") ){
            throw new YouException("str==ruizi") ;
        }
    }
    public static void main(String[] args)  {
        int a=10;
        try {
            func1(a);
        } catch (MyException e) {
            e.printStackTrace();
        }
        String str="ruizi";
         func2(str) ;
    }
}
/*
public class TestDemo {

    private static void testMethod(){

        System.out.println("testMethod");

    }

    public static void main(String[] args) {

        ((TestDemo)null).testMethod();

    }

}
*/
