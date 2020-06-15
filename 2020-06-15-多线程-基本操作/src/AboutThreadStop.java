import java.util.Scanner;

/**
 * @author 张瑞瑞
 * @date 2020/06/15 19:56
 */
public class AboutThreadStop {
    static class B extends Thread{
        B(){
            super("B");
        }
        @Override
        public void run() {
            Thread t=Thread .currentThread() ;
            while (true) {
               try {
                    System.out.println("我正在挖煤");
                    Thread.sleep(1000);
                    //boolean interrupted =Thread .interrupted() ;
                    boolean interrupted = t.isInterrupted();
                    System.out.println("是否有人让我停止运行："+interrupted);
                    if(interrupted ){
                        break;//break,return 都可以
                    }
                } catch (InterruptedException e) {
                    System.out.println("有人让我停止运行，但因为我正在sleep,所以我收到了这个异常");
                    return;//break,return 都可以
               }
            }
        }
    }

    public static void main(String[] args) {
        B b=new B();
        b.start() ;

        Scanner scanner=new Scanner(System.in);
        scanner.nextLine();
        System.out.println("准备通知B线程停止");
        b.interrupt() ;
        System.out.println("已经通知B线程停止");


    }
}
