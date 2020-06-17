/**
 * @author 张瑞瑞
 * @date 2020/06/17 12:43
 */
public class YieldDemo {
    static class A extends Thread{
        @Override
        public void run() {
            while(true){
                System.out.println("A");
            }
        }
    }

    static class B extends Thread{
        @Override
        public void run() {
            while(true){
                System.out.println("B");
                Thread.yield() ;//主动放弃cpu
            }
        }
    }

    public static void main(String[] args) {
        A a=new A();
        B b=new B();
        a.start() ;
        b.start() ;
    }
}
