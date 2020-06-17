/**
 * @author 张瑞瑞
 * @date 2020/06/15 18:46
 */
public class PrintThreadFields {
    static class SubThread extends Thread{
        SubThread (){
            super("张瑞瑞");
        }

        //1.定义一个类
        //2.覆写该类的run方法
        @Override
        public void run() {
            printFields();
            try {
                Thread.sleep(100*1000) ;
            } catch (InterruptedException e) {

            }
        }
    }

    //哪个线程调用该方法就打印那个线程的属性
    private static void printFields() {
        Thread t=Thread .currentThread() ;//返回当前线程的引用
        long id=t.getId() ;//线程的id
        System.out.println("线程的id"+id+":"+t.getId() );
        System.out.println("线程的名字"+id+":"+t.getName() );
        System.out.println("线程的优先级"+id+":"+t.getPriority() );
        System.out.println("线程的状态"+id+":"+t.getState() );

        System.out.println("线程是否存活"+id+":"+t.isAlive() );
        System.out.println("线程是否是后台线程"+id+":"+t.isDaemon() );
    }
    public static void main(String[] args) throws InterruptedException {
        Thread thread1=new SubThread() ;//3.构造该类的对象
        thread1.start();//4.调用对象的start()方法  就是把线程加入就绪队列，等待调度
        Thread thread2=new SubThread() ;
        thread2.start();

        //打印主线程的属性信息
        printFields() ;
        Thread.sleep(100*1000) ;


    }
}
