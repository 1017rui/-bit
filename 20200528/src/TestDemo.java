import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;

/**
 * @author 张瑞瑞
 * @date 2020/05/28 19:27
 */
public class TestDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String expected = scanner.nextLine();//7_This_is_a_test
        String actual = scanner.nextLine();//_hs_s_a_es

        //1、把实际的字符转换为大写存放到集合当中
        HashSet<Character> setActual = new HashSet<>();
        for (char s : actual.toUpperCase().toCharArray()) {
            setActual.add(s);
        }
        HashSet<Character> setExpected = new HashSet<>();
        for (char ex : expected.toUpperCase().toCharArray()) {
            if(!setActual .contains(ex) &&!setExpected .contains(ex) ){
                System.out.print(ex);
                setExpected .add(ex);
            }
        }
    }
}
