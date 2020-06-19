/**
 * @author 张瑞瑞
 * @date 2020/06/19 17:09
 * 演示保证可见性的问题
 */
public class VolatilePromiseVisibleDemo {
    //run这个变量是不是共享的？
    //不加volatile ，子线程可能看不到run值的修改
    //加volatile ，子线程一定可以看到run值的修改
    private static volatile boolean run=true;
    static class Runner extends Thread {
        @Override
        public void run() {
            //run编程false才会退出
            //因为内存可见性的问题，子线程看不到run的值被修改了。
            while(run){
            }
            System.out.println("Runner退出了");
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Runner runner=new Runner() ;
        runner .start();
        Thread.sleep(2000);//主线程放弃cpu2秒，保证后面的代码执行时 子线程已经运行起来了
        System.out.println("2秒钟已到");
        run=false ;
        // 正确的情况下，主线程就到这里就退出了
        // 随后，因为 run == false，所以，子线程也回退出
        // 进而 JVM 运行结束
    }
}
