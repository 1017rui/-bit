/**
 * @author 张瑞瑞
 * @date 2020/06/18 20:57
 * 加锁实现线程安全
 * 可以加synchronized (Sub.class) {
 * }
 * synchronized (FixUnsafe.class) {
 * }
 * 不可以在方法中加锁
 * 不可以加
 *synchronized (Thread.currentThread()) {
 *  }
 *  因为Thread.currentThread()指向的当前线程对象  加的不是同一把锁
 *
 *
 *  核心：
 *  1.都加锁
 *  2.同一个对象
 */
public class FixUnsafe {
    private static final long N = 1_0000_0000L;
    private static long v = 0;

    static class Add extends Thread {
        @Override
        //不能再方法中加synchronized  及时加了这个指向的是Add,底下的指向的是Sub
        //指向的不是同一把锁，还是线程不安全的
        public void run() {

                for (long i = 0; i < N; i++) {
                    synchronized (Sub.class) {
                        v++;
                    }
                }

        }
    }

    static class Sub extends Thread {
        @Override
        public void run() {

                for (long i = 0; i < N; i++) {
                    synchronized (Sub.class) {
                        v--;
                    }
                }

        }
    }

    public static void main(String[] args) throws InterruptedException {
        Add a = new Add();
        Sub s = new Sub();

            a.start();
            s.start();
        // 为什么这里需要 join？
        a.join();
        s.join();

        System.out.println(v);
    }
}
