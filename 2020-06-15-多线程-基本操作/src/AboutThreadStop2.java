import java.util.Scanner;

/**
 * @author 张瑞瑞
 * @date 2020/06/15 20:20
 *
 *
 *
 * 如何不使用Thread中的设计方式通知线程停止
 */
public class AboutThreadStop2 {

    //定义了一个类变量 线程之间可以共享
    //B线程可以通过观察该变量，知道是否有人让他停止
    private static volatile boolean isInterrupted=false;
    static class B extends Thread{
        B(){
            super("B");
        }
        @Override
        public void run() {

            while (true) {
                 try {
                System.out.println("挖煤");
                Thread.sleep(3000);

                System.out.println("是否有人让我停止运行："+isInterrupted );
                 } catch (InterruptedException e) {
                System.out.println("有人让我停止运行，但因为我正在sleep,所以我收到了这个异常");
                }
            }
        }
    }

    public static void main(String[] args) {
        B b=new B();
        b.start() ;

        Scanner scanner=new Scanner(System.in);
        scanner.nextLine();
        System.out.println("准备通知停止");
        isInterrupted =true;
        System.out.println("已经通知停止");

    }

}
