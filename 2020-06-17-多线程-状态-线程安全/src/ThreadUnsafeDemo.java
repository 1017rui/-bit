/**
 * @author 张瑞瑞
 * @date 2020/06/17 12:54
 * 启动两个线程，同时操作一个变量v=0
 * 一个线程对该变量执行N次v++
 * 另一个线程对该变量执行N次v--
 * 问： 当两个线程都执行结束 v 的值是多少？
 *
 * 期望值：0
 * 实际值：随机值（当N较小的时候，出现随机值的情况较少，N较大时，出现情况较多）
 *
 * 线程不安全的情况：
 */
public class ThreadUnsafeDemo {
    private static final int N=10_0000_0000;
    private static int v=0;
    static class Add extends Thread{
        @Override
        public void run() {
            for(int i=0;i<N;i++){
                v++;
            }
        }
    }

    static class Sub extends Thread{
        @Override
        public void run() {
            for(int i=0;i<N;i++){
                v--;
            }
        }
    }
    public static void main(String[] args) throws InterruptedException {
        Add a=new Add();
        Sub s=new Sub();
        a.start() ;
        s.start() ;

        a.join() ;
        s.join() ;
        System.out.println(v);
    }

}
