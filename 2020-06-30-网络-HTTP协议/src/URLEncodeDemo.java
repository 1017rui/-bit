import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;

/**
 * @author 张瑞瑞
 * @date 2020/06/30 19:50
 */
public class URLEncodeDemo {
    //URL的编码和解码
    public static void main(String[] args) throws UnsupportedEncodingException {
        String encode= URLEncoder .encode("C++","utf-8");
        System.out.println(encode);

        String decode= URLDecoder .decode("C%2B%2B","utf-8") ;
        System.out.println(decode);
    }
}
