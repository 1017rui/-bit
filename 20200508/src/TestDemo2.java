import java.io.UnsupportedEncodingException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author 张瑞瑞
 * @date 2020/05/08 20:34
 */
public class TestDemo2 {
    public static void main(String[] args) {
        //字符串连接
        String str1="hello";
        String str2="java";
        String ret=str1.concat(str2) ;
        System.out.println(ret);
        //字符串判空
        String str3=null;
        String str4="";
        String str5="zhang";
        //System.out.println(str3.isEmpty() );//空指针异常
        //isEmpty()针对的是空串，而null时空对象。
        System.out.println(str4.isEmpty() );
        System.out.println(str5.isEmpty() );

    }
    public static void main18(String[]args){
        String str2="zhangjiaxing";
        System.out.println(str2.toUpperCase() );//转大写
        String str3="JAVA IS VERY GOOD LANAGE";
        System.out.println(str3.toLowerCase() );//转小写
        //去掉左右空格
        String str1="  i have a pen   ";
        System.out.println(str1.trim() );
        //字符串截取
        String str="hello world";
        System.out.println(str.substring(1) );
        System.out.println(str.substring(6,10) );
    }
    public static String func1(String str){
        String[] strings=str.split(" ");
        String ret="";
        for(String s:strings){
            ret+=s;
        }
    return ret;
    }
    public static void main17(String[]args){
        Scanner scan=new Scanner(System.in);
        while(scan.hasNext() ){
            String str=scan.nextLine();
            String ret=func1(str);
            System.out.println(ret);
        }


    }
    public static void main16(String[] args) {
        //分割多次
        String str="name=zhangsan&age=18";
        String[] strings1=str.split("&") ;
        for(String s1:strings1){
            String[] strings2=s1.split("=") ;
            for(String s2:strings2){
                System.out.println(s2);
            }
        }
    }
    public static void main15(String[] args) {
        String str="Java30-split#bit";
        String [] strings=str.split(" |-|#") ;
        for(String s:strings){
            System.out.println(s);
        }
    }
    public static void main14(String[] args) {
        String str="196.168.1.1";
        String[] strings=str.split("\\.") ;
        for(String s:strings){
            System.out.println(s);
        }
    }
    public static void main13(String[] args) {
        //字符串的拆分
        String str="hello bit hello java";
        String[] strings=str.split(" ") ;
       for(String s:strings){
           System.out.println(s);
       }
    }
    public static void main12(String[] args) {
        //字符串的替换
        String str="hello bit bit java bit";
       // str=str.replaceAll("bit","java") ;
        System.out.println(str);

        String str1=str.replaceFirst("bit","java"); ;
        System.out.println(str1);
    }
    public static void main11(String[] args) {
        //字符串的查找
        String str="abcabdabcbcdabc";
      //  System.out.println(str.contains("bcd") );
      //  System.out.println(str.contains("abcd") );
       /* System.out.println(str.indexOf("bcd"));
        System.out.println(str.indexOf("bcd",9));
        System.out.println(str.indexOf("bcd",10));*/
        /*System.out.println(str.indexOf("abc"));//从头开始查找
        System.out.println(str.lastIndexOf("abc"));//从后开始查找
        System.out.println(str.lastIndexOf("abc",11));
*/
        System.out.println(str.startsWith("abc",3) );
        System.out.println(str.endsWith("abc") );


    }
    public static void main10(String[] args) {
        String str1="abc";
        String str2="aba";
        int ret=str2.compareTo(str1) ;
        System.out.println(ret);
        System.out.println(str1.compareTo("c") );
    }
    public static void main9(String[] args) {
        //实现字符串与字符数组的转换处理
        String str="hello world";
        char[] ch=str.toCharArray() ;
        System.out.println(Arrays.toString(ch) );
    }
    public static boolean func(String str){
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch<'0'||ch>'9' ){
                return false;
            }
        }
        return true;
    }
    public static void main8(String[] args) {
        //给定一个字符串判断其是否全部由数字组成
        String str="123456";
        System.out.println(func(str));
        String str1="12d456f";
        System.out.println(func(str1));
    }
    public static void main7(String[] args) throws NoSuchFieldException, IllegalAccessException {
        //修改字符串
        /*String str="Hello";
        str="h"+str.substring(1,3) ;//[) hel
        System.out.println(str);*/
        //利用反射 会破坏封装
        String str="hello";
        Class cl=String.class;//拿到String类的class对象
        Field field=cl.getDeclaredField("value") ;
        field.setAccessible(true) ;//相当于打开了权限
        char[] val=(char[])field .get(str);
        val[0]='g';
        System.out.println(str);//gello

    }
    public static void main6(String[] args) {
        String str2="Hello";
        String str1=new String("Hello").intern() ;//手动入池

        System.out.println(str1==str2);
    }
    public static void main5(String[] args) {
        //使用equal方法的注意事项
        String str1="java";
        String str2="Java";
        String str3="zhangsan";
        System.out.println(str1.equals(str2) );// false注意大小写的比较
        System.out.println(str1.equalsIgnoreCase(str2) );//true 不注意大小写的
        String str4=null;
        String str5="java";
        //System.out.println(str4.equals(str5) );//会发生空指针异常
        System.out.println(str5.equals(str4));//false
        //说明 点号前面的字符串不能为null
        System.out.println("hello".equals(str1) );//√写成这种形势较好。
        System.out.println(str1.equals("hello") );//×
    }
    public static void main4(String[] args) {
        //字符串的比较
        String str1="Hello";
        String str2="Hello";
        System.out.println(str1.equals(str2));
        //System.out.println(str1==str2);
        String str3=new String("Hello");
        //System.out.println(str1==str3);
        System.out.println(str1.equals(str3) );
        //==进行比较比较的不是字符串的内容而是引用
        //equal比较的字符串的内容
    }
    public static void main3(String[] args) throws UnsupportedEncodingException {
        byte[]bytes={97,98,99,100};
        String str=new String(bytes);
        System.out.println(str);
        String str1=new String(bytes,1,2);
        System.out.println(str1);
        String str2="abcdefg";
        byte[] byte1=str2.getBytes() ;
        System.out.println(Arrays.toString(byte1) );//[97, 98, 99, 100, 101, 102, 103]
        byte[] byte3=str2.getBytes("utf-8");
        System.out.println(Arrays.toString(byte3));
    }
    public static void main2(String[] args) {
        char[]value={'a','b','c','d','e'};
        String str1=new String(value);//将字符数组的内容变为字符串
        System.out.println(str1);
        String str2=new String(value,0,3);
        System.out.println(str2);
        char ch=str1.charAt(1);
        System.out.println(ch);
        String str3="zhangruirui";
        char[] array1=str3.toCharArray() ;//将字符串变为字符数组
        System.out.println(Arrays.toString(array1));//[z, h, a, n, g, r, u, i, r, u, i]

    }


    public static void main1(String[]args){
        //创建字符串的三种方式：
        String str1="abcd";
        System.out.println(str1);
        String str2=new String("hello world");//和第一种创建方式类似
        System.out.println(str2);
        char[] array = {'b','i','t','!'};
        String str3=new String(array);
        System.out.println(str3);
    }
}
