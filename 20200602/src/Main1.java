/**
 * @author 张瑞瑞
 * @date 2020/06/03 21:12
 */
import java.util.Scanner;
public class Main1{
    public static String func(String str1,String str2){
        StringBuffer sb=new StringBuffer();
        for(char ch:str1.toCharArray()){
            if(!str2.contains(ch+"") ){
                sb.append(ch);
            }
        }
        return sb.toString();
    }
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        String str1=scan.nextLine();
        String str2=scan.nextLine();
        String ret=func(str1,str2);
        System.out.println(ret);
    }
}