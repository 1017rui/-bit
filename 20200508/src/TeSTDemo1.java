import java.util.Scanner;

/**
 * @author 张瑞瑞
 * @date 2020/05/08 18:32
 */
public class TeSTDemo1 {
    //字符串逆置
    public static String reverse(String str,int begin,int end){
        char[] ch=str.toCharArray() ;//将字符串转化为字符数组
        while(begin<end){
            char tmp=ch[begin];
            ch[begin]=ch[end];
            ch[end]=tmp;
            begin ++;
            end--;

        }
       /* String ret=new String(ch);
        return ret;*/
        return String.copyValueOf(ch) ;//将数组转化成字符串。
    }
    public static String func(String str,int n){
        str=reverse(str,0,n-1) ;
        str =reverse(str,n,str.length()-1);
        str= reverse(str,0,str.length()-1) ;
       return str;
    }
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        String str=scanner.next();
       String ret= func(str,n);
        System.out.println(ret);
       /* String str="abcdefg";
        String ret=reverse(str,0,str.length()-1);
        System.out.println(ret);*/
    }
    public static String func(String str) {
        String[] string = str.split(" ");
        String ret="";
        for(String s:string){
          ret+=s;
        }
        return ret;
    }
    public static void main1(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        //这里不能用next，next遇到空格结束
        String ret = func(str);
        System.out.println(ret);
    }

}
    /*public static void main1(String[] args) {
        String str = "java-split#bit";
        String[] strings = str.split(" |-|#");
        for(String s:strings){
            System.out.println(s);
        }
    }
}
*/