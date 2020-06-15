/**
 * @author 张瑞瑞
 * @date 2020/06/15 22:56
 */
import java .util.Scanner;
//找规律得知：
// 每个n对应的连续奇数和的第一个奇数等于n-1对应的连续奇数和的最后一个奇数+2
public class Main1{
    public static String func(int n){
        StringBuffer sb=new StringBuffer() ;
        if(n==1){
            System.out.println(1);
        }
        //先拿到上一个的最后一个奇数
        int odd=(int)Math.pow((n-1),2)+(n-2);
        for(int i=0;i<n;i++){
            odd +=2;
            if(i!=n-1){
                sb.append(odd) ;
                sb.append('+') ;
            }else{
                sb.append(odd) ;
            }
        }
        return sb.toString() ;
    }
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        System.out.println(func(n));
    }
}