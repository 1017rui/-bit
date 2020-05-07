import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/**
 * @author 张瑞瑞
 * @date 2020/05/07 19:49
 */
public class TestDemo1 {
    public static void main(String[] args) {

        String str1 = "    aba   bcdedcd  ";
        String ret = str1.trim();//去掉左右空格的
        System.out.println(ret);//aba   bcdedcd
    }
    public static void main6(String[] args) {
        String str1="abcabcabcd";
        //截取字符串
        String ret=str1.substring(1);//从指定位置截取到结尾
        System.out.println(ret);//bcabcabcd
        String ret1=str1.substring(1,4);//截取位置[1,4)之间的字符
        System.out.println(ret1);//bca
    }
    public static void main5(String[] args) {
        String str1="abcabcabcd";
        //替换字符串
        String ret=str1.replaceFirst("ab","pp") ;
        System.out.println(ret);//ppcabcabcd
    }
    public static void main4(String[] args) {
        String str1="abcde";
        String str2="abcdef";
        System.out.println(str1.equals(str2) );//false
        System.out.println(str1.equalsIgnoreCase(str2) );//true
        System.out.println(str1.compareTo( str2));
        System.out.println("张".compareTo( "李"));

        //str1>str2  正数
        //str1<str2  负数
        //str1=str2  0
    }
    public static void main3(String[] args) throws UnsupportedEncodingException {
        byte[]bytes={97,98,99,100};
        String str=new String(bytes);//将字节数组转变为字符串
        System.out.println(str);//abcd
        String str1=new String(bytes,0,2);
        System.out.println(str1);//ab
        String str2="abcdef";
       byte[]bytes1=str2.getBytes();//将字符串以字节数组的形式打印
        System.out.println(Arrays.toString(bytes1));//[97, 98, 99, 100, 101, 102]
       // str2.getBytes(1,2,bytes,4);
        byte[]bytes2=str2.getBytes("utf-8") ;
        System.out.println(Arrays.toString(bytes2));
    }
    //给定一个字符串，判断其是否都是由数字组成
    public static boolean func(String str){
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
           if(ch <'0'||ch>'9') {
               return false;
           }
        }
        return true;
    }
    public static void main2(String[] args) {
        String str="123a456";
        boolean flg=func(str);
        System.out.println(flg);
    }
    public static void main1(String[] args) {
        char[]val={'a','b','c','d','e'};
        String str=new String(val);
        System.out.println(str);//abcdef
        String str1=new String(val,1,3);
        System.out.println(str1);//bcd
        String str2="Hello";
        char ch=str2.charAt(0) ;//H
        System.out.println(ch);
        char[] val2=str2.toCharArray() ;//将字符串转化为数组
        System.out.println(Arrays.toString(val2) );//[H, e, l, l, o]
    }
}
