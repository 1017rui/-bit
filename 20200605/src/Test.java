import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.DoubleToIntFunction;

/**
 * @author 张瑞瑞
 * @date 2020/06/05 14:52
 */
public class Test {
    public static void main(String[] args) {
        Stack <Integer> s=new Stack<>();
        s.push(1) ;
        Queue <Integer> q=new LinkedList<>();
        q.offer(1) ;
    }
    public static void main4(String[] args) {
        String s="";
        System.out.println("s="+s);
    }
    public static void main3(String[] args) {
        int x,y;
        x=5>>2;
        y=x>>>2;
        System.out.println(y);
    }
    public static void main2(String[] args) throws InterruptedException {
        Thread t=new Thread(new Runnable() {
            @Override
            public void run() {
                try{
                    Thread .sleep(2000);
                }catch(InterruptedException e){
                    throw new RuntimeException(e) ;
                }
                System.out.println("2");
            }
        });
        t.start() ;
        t.join();
        System.out.println("1");
    }
    public static void main1(String[] args) {
        StringBuffer a=new StringBuffer("A");
        StringBuffer b=new StringBuffer("B");
        operation(a,b) ;
        System.out.println(a+"."+b);

    }
    public static void operation(StringBuffer x,StringBuffer y){
        x.append(y) ;
        y=x;

    }
}
