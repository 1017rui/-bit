import java.util.Scanner;
import java.util.concurrent.TimeUnit;

/**
 * @author 张瑞瑞
 * @date 2020/06/17 11:49
 */
public class ThreadStateTransfer {
    static class SubThread extends Thread{
        @Override
        public void run() {//run方法执行结束就变成终止状态了
            /*Scanner scan=new Scanner(System .in);
            scan.nextLine();//阻塞在这里，输入任何内容，该方法返回
            System.out.println("子线程即将退出");*/
            /*try {
                TimeUnit .SECONDS .sleep(5) ;
            } catch (InterruptedException e) {
                e.printStackTrace();
            }*/
            try{
                for(int i=0;i<50;i++){
                    TimeUnit.MICROSECONDS.sleep(100);
                }
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }//什么时候子线程走到这了就终止了。
    }
    public static void main(String[] args) throws InterruptedException {
        Thread p=new SubThread() ;
        //SubThread q=new SubThread() ;
        System.out.println(p.getState() );
        p.start() ;
        System.out.println(p.getState() );
        while(p.isAlive() ){
            System.out.println(p.getState() );//看到的是RUNNABLE还是TIMED_WAITING
                                              //理论上是能看到RUNNABLE
                                              //但实际运行中，基本看不到RUNNABLE
            TimeUnit .SECONDS .sleep(1) ;
        }
        System.out.println(p.getState() );
    }
}
