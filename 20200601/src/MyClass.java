/**
 * @author 张瑞瑞
 * @date 2020/06/02 7:42
 */
import java.lang.CharSequence;
public class MyClass {
    static int i;

    public static void main(String[] args) {
        System.out.println(i);
        System.out.println(Math.round(11.5));
        //正数 小数点后为0-4靠左取最靠近的整数（取小的）  小数点后为5-9靠右取最靠近的整数（取大的）
        System.out.println(Math.round(-11.5));
        //负数 小数点后为0-5靠右取最靠近的整数（取大的）  小数点后为6-9靠左取最靠近的整（取小的）
        System.out.println(100%3);
        System.out.println(100%3.0);
    }
}
