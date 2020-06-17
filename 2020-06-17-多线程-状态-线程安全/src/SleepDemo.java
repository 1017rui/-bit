import java.util.concurrent.TimeUnit;

/**
 * @author 张瑞瑞
 * @date 2020/06/17 11:04
 */
public class SleepDemo {
    public static void main(String[] args) {
        System.out.println(1);
        try {
            Thread.sleep(1);//毫秒
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(2);
        try {
            TimeUnit.SECONDS .sleep(1);//秒
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(3);
        try {
            TimeUnit.MINUTES .sleep(1);//分钟
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(4);
    }
}
