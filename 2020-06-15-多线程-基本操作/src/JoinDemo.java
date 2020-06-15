/**
 * @author 张瑞瑞
 * @date 2020/06/15 21:12
 */
public class JoinDemo {
    static class B extends Thread {
        @Override
        public void run() {
            long r = 0;
            for (long i = 0; i < 100_0000_0000L; i++) {
                r += i;
            }
            System.out.println("B 停止运行");
        }
    }
    public static void main(String[] args) throws InterruptedException {
        B b=new B();
        b.start();
        System.out.println("我不走了，什么时候b停止，我才继续");
        b.join();
        System.out.println("B结束了，我就继续");
    }
}
