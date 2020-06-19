import java.util.Scanner;

/**
 * @author 张瑞瑞
 * @date 2020/06/17 22:30
 */


import java.util.Scanner;
import java.math.BigInteger;
public class Main{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        //由于是超长整数，所以使用字符串来读
        String addend=scan.next();
        String augend=scan.next();
        BigInteger bi1=new BigInteger(addend);
        BigInteger bi2=new BigInteger(augend);
        BigInteger sum=bi1.add(bi2);
        System.out.println(sum);
    }

    public static void main3(String[] args){
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        String c=scan.next();
        //获取行数  四舍五入取整
        int row=(n%2==1)?n/2+1:n/2;
        for(int i=0;i<row;i++){
            for(int j=0;j<n;j++){
                if(i!=0&&i!=row-1){
                    if(j!=0&&j!=n-1){
                        System.out.print(" ");
                    }else{
                        System.out.print(c);
                    }

                }else{
                    System.out.print(c);
                }
            }
            System.out.println();
        }
    }

    public static void main2(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        String c=scan.next();
    }
    public static void main1(String[] args) {
        char c='a';
        short s=3;
        float f=3;
        double d=9.6;
        double num=c*s+f+d;
        System.out.println(c*s+f+d);

    }
}
