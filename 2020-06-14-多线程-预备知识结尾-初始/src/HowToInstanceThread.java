/**
 * @author 张瑞瑞
 * @date 2020/06/15 13:21
 */
public class HowToInstanceThread {
    static class A extends Thread{
        @Override
        public void run() {
            System.out.println("我是A线程");
        }
    }
    static class B implements Runnable {
        @Override
        public void run() {
            System.out.println("我是B类");
        }
    }

    public static void main(String[] args) {
        Thread thread;
        {
            //1.直接new A类的对象，本身就是 一个Thread对象
            A a = new A();
            thread = a;

            thread.start();
        }
        {
            //2.new B 类的对象，是一个Runnable,作为任务传递的线程对象
            B b = new B();
            //thread=b; error
            thread =new Thread(b) ;

            thread.start();
        }
         {
            // 3. new A 类的对象，但把该对象，当作 Runnable 使用
            // 因为 Thread 本来就实现了 Runnable
            A a = new A();
            thread = new Thread(a);

            thread.start();
        }
    }

}
