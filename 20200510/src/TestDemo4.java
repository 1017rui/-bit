

/**
 * @author 张瑞瑞
 * @date 2020/05/10 20:47
 * 考试卷：
 * 输出不重复的字符
 * 输入：abcqwerbca
 * 输出：abcqwer
 */
import java.util.Scanner;
public class TestDemo4{

    public static String func(String str){

        StringBuffer sb=new StringBuffer() ;//用于字符串拼接
        for(int i=0;i<str.length() ;i++){
            char ch=str.charAt(i);
            String tmp=sb.toString() ;
            if(!tmp.contains(ch+"") ){//在存放结果的字符串中判断是否包含这个字符串
                 sb.append(ch);
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        while(scan.hasNext() ){
            String str=scan.nextLine() ;
            String ret=func(str) ;
            System.out.println(ret);
        }
    }
}
/*class Base{
    public String name;
    Base(){
        System.out.print("Base");
    }

}
public class TestDemo4 extends Base {
    public static void main(String[] args) {
     new TestDemo4() ;
     new Base();
    }
}*/
