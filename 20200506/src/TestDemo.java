/**
 * @author 张瑞瑞
 * @date 2020/05/06 18:41
 */
public class TestDemo {
    public static void main(String[] args) {
        String str1="hello";
        String str2="hel"+"lo";
        /*final int a=10;
        int c=a+30;*/
        System.out.println(str1==str2);//true
        String str3=new String("hel")+"lo";
        System.out.println(str3==str1);//false
    }
    public static void main2(String[] args) {
        String str1="hello";
        String str2=new String("hello");
        System.out.println(str1==str2);//false
        String str3="hello";
        System.out.println(str1==str3);//true
    }
    public static void main1(String[] args) {
        String str="abc";
        System.out.println(str);
    }
}
