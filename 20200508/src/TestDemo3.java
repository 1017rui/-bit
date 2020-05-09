import java.util.Scanner;

/**
 * @author 张瑞瑞
 * @date 2020/05/09 14:40
 */
public class TestDemo3 {
    //字符串的逆置
    public static String reverse (String str,int begin,int end){
        char[] array=str.toCharArray() ;//将字符串转化为字符数组
        while(begin<end){
            char ch=array[begin];
            array[begin]=array[end];
            array[end]=ch;
            begin++;
            end--;
        }
        /*String ret=new String(array);
        return ret;*/
        return String.copyValueOf(array) ;//将字符数组变为String类型
    }
    public static String func(String str,int size){
        str=reverse(str,0,size-1) ;
        str=reverse(str,size,str.length()-1 ) ;
        str=reverse(str,0,str.length()-1 ) ;
        return str;
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int size=scan.nextInt();
        String str=scan.next();
        String ret=func(str,size);
        System.out.println(ret);
    }
    public static void main1(String[]args){
        String str="abcdefg";
        String ret=reverse(str,0,str.length()-1);
        System.out.println(ret);
    }
}
