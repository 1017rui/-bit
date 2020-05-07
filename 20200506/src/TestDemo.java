import java.lang.reflect.Field;
import java.util.Arrays;

/**
 * @author 张瑞瑞
 * @date 2020/05/06 18:41
 */
public class TestDemo {
    public static void main(String[]args) throws NoSuchFieldException, IllegalAccessException {
        //利用反射  --自省的过程。
        String str="Hello";
        Class cl=String.class;
        Field field=cl.getDeclaredField("value");
        field.setAccessible(true) ;//相当于打开了权限
        char[] val=(char[])field.get(str);
        val[0]='g';
        System.out.println(str);
    }
    public static void main10(String[] args) {
       String str="Hello";
       str="h"+str.substring(1);
        System.out.println(str);

    }
    public static void main9(String[] args) {
        String str="hello";//会产生大量的临时变量
        str=str+"world";
        str+="!!!";
        System.out.println(str);
        //拼接字符串：StringBuffer
    }
    public static void main8(String[]args){
        String str1="hello";
        String str2=new String("hello").intern();
        System.out.println(str1==str2);//true
        }
    public static void main7(String[] args) {
        String str1 ="hello";
        System.out.println("hello".equals(str1));//√ 一般写成这种形式比较好
        System.out.println(str1.equals("hello"));//×
        String str2 = new String("hello");
       // System.out.println(null.equals(str1));//error
        System.out.println(str2.equals(null));//
        System.out.println(str2.equals(str1) );
    }
    public static void main6(String[] args) {
        String str1 = "hello";
        String str2 = new String("hello");
        System.out.println(str1 == str2);//比较的是引用
        System.out.println(str1.equals(str2) );//比较的是字符串的内容
        String str3 = "hello";
        System.out.println(str1 == str3);
        System.out.println(str1.equals(str3) );//比较的是字符串的内容

    }
    public static void func(String str,char[]array){
        str="abcdef";
        array[0]='g';
    }
    public static void main5(String[] args) {
        String str1="hello";
        char[]val={'a'};
        System.out.println(str1);
        System.out.println(Arrays.toString(val));
        func(str1,val);
        System.out.println(str1);
        System.out.println(Arrays.toString(val));

    }
    public static void main4(String[] args) {
        String str1 = "hello";
        String str2 = str1;

        System.out.println(str1);
        System.out.println(str2);
        str1 = "abc";

        System.out.println(str1);
        System.out.println(str2);
    }
        public static void main3 (String[]args){
            String str1 = "hello";
            String str2 = "hel" + "lo";//常量特点：编译时期已经被处理成“hello”了
        /*final int a=10;
        int c=a+30;*/
            System.out.println(str1 == str2);//true
            String str3 = new String("hel") + "lo";
            System.out.println(str3 == str1);//false
        }
        public static void main2 (String[]args){
            String str1 = "hello";
            String str2 = new String("hello");
            System.out.println(str1 == str2);//false 实质比较的是地址（两边都是引用类型）
            String str3 = "hello";
            System.out.println(str1 == str3);//true
        }
        public static void main1 (String[]args){
            //定义字符串的三种方式
            String str = "hello";
            System.out.println(str);
            String str2 = new String("abcdef");//和上面的定义方式一样。
            System.out.println(str2);
            char[] val = {'a', 'b', 'c', 'd', 'e', 'f'};
            System.out.println(Arrays.toString(val));
        }
    }

