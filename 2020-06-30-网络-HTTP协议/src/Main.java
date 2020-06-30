/**
 * @author 张瑞瑞
 * @date 2020/06/30 22:42
 */
import java.util.Scanner;

public class Main{
    public static long func10(String str){
        String[] strings=str.split("[.]") ;
        long result=0;
        result +=Long.parseLong(strings[0])<<24;
        result +=Long.parseLong(strings[1])<<16;
        result +=Long.parseLong(strings[2])<<8;
        result +=Long.parseLong(strings[3]);
        return result;
    }
    public static String func(Long n){
        StringBuffer sb=new StringBuffer() ;//用于字符串的拼接
        sb.append(n>>24) ;
        sb.append(".");
        sb.append(String.valueOf((n&0x00FFFFFF)>>16) ) ;
        sb.append(".");
        sb.append(String.valueOf((n&0x0000FFFF)>>8) ) ;
        sb.append(".");
        sb.append(String.valueOf((n&0x000000FF)));
        return sb.toString() ;
    }
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        while(scan.hasNext()){
            String str=scan.next();
            Long n=scan.nextLong();
            Long ret1=func10(str);
            String ret2=func(n);
            //System.out.println(func10(str));
            //System.out.println(func(n));
            System.out.println(ret1);
            System.out.println(ret2);
        }
    }
}