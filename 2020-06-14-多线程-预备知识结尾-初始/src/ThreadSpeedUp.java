/**
 * @author 张瑞瑞
 * @date 2020/06/14 15:10
 * 演示并发可以提升速度
 * 演示多线程可以提升速度
 *
 * 计算从1加到n的耗时
 */
public class ThreadSpeedUp {
    private static final long C=10;
    private static final long N=10_0000_0000L;
    private static class Calc extends Thread {
        @Override
        public void run() {
            long r = 0;
            for (long i = 0; i < N; i++) {
                r += i;
            }
            System.out.println(r);
        }
    }
    private static void 并行方式计算() throws InterruptedException {
        long b=System .currentTimeMillis() ;

        //一共启动C个线程执行
        //需要再启动C-1个线程
        //每个线程，只需要计算1+……+N就可以
        Calc[] threads=new Calc[(int)C-1];
        for(int i=0;i<C-1;i++){
            threads [i]=new Calc();//构建线程信息
            threads[i].start() ;//启动运行
        }

        //主线程中，自己选一次1+……+N
        long r=0;
        for(long i=0;i<N;i++){
            r+=i;
        }
        System.out.println(r);
        //必须等待其他N-1个线程执行结束，才算真正执行结束
        for(int i=0;i<C-1;i++){
            threads [i].join() ;//等待其他人执行结束

        }
        long e=System .currentTimeMillis() ;
        System.out.printf("并行模式下，耗时：%.2f秒%n",(e-b)/1000.0);
    }

    private static void 串行方式计算(){
        long b=System .currentTimeMillis() ;
        for(long j=0;j<C;j++) {
            long r = 0;
            for (long i = 0; i < N; i++) {
                r += i;
            }
            System.out.println(r);
        }
        long e=System .currentTimeMillis() ;
        System.out.printf("串行模式下，耗时：%.2f秒%n",(e-b)/1000.0);
    }

    public static void main(String[] args) throws InterruptedException {
        // 预热，防止影响速度
        //JVM内部有JIT，执行过程会进行代码优化
        //Java程序是越跑越快，运行一段时间之后，才能达到理想值
        //为了避免开始启动阶段，影响测试效果，我们加一个预热
        for (int i = 0; i < 20; i++) {
            long r = 0;
            for (long j = 0; j < N; j++) {
                r += j;
            }
        }
        串行方式计算();
        并行方式计算();
    }

}
