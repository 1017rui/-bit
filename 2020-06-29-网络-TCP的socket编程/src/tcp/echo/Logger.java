package tcp.echo;

/**
 * @author 张瑞瑞
 * @date 2020/06/29 19:20
 */
import java.util.Date;

/**
 * 把打印日志的代码封装一下
 */
public class Logger {
    public static void debug(String message) {
        System.out.printf("%s: DEBUG: %s%n", new Date(), message);
    }
}
