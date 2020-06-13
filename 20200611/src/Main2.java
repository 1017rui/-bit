import java.util.Scanner;

/**
 * @author 张瑞瑞
 * @date 2020/06/13 11:05
 */
public class Main2 {
    public static void main(String[] args) {
        byte b1=1,b2=2,b3,b6;
        final byte b4=4,b5=6;
        b6=b4+b5;
       // b3=(b1+b2);
       // System.out.println(b3+b6);
    }
    public static void main3(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        StringBuffer str = new StringBuffer();
        while (n != 0) {//1516000
            int ret = n % 10;
            str.append(String.valueOf(ret));
            n = n / 10;
        }
        System.out.println(str);
    }
    public static void main2(String[] args) {
        Scanner scan=new Scanner(System.in);
       while(scan.hasNext() ){
           int n=scan.nextInt();
           int count=0;
           for(int i=0;i<n;i++){
               n/=5;
               count+=n;
           }
           System.out.println(count);
       }
    }
    public static void add(Byte b){
        b=b++;
    }
    public static void test(){
        Byte a=127;
        Byte b=127;
        add(++a);
        System.out.println(a+" ");
        add(b);
        System.out.println(b+" ");
    }
    public static void main1(String[] args) {
        test();
    }
}
