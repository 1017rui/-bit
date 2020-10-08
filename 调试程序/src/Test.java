/**
 * @author 张瑞瑞
 * @date 2020/09/24 22:31
 */
public class Test {

    public static int a = 1;

    public static void main(String[] args) {

        int a = 10;

        a++; Test.a++;

        Test t=new Test();

        System.out.println("a=" + a + " t.a=" + t.a);

    }

}