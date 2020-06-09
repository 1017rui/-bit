import java.util.Arrays;
import java.util.Scanner;

/**
 * @author 张瑞瑞
 * @date 2020/06/08 21:42
 */
class P{
    String name="No name";
    public P(String nm){
        name=nm;
    }
}
class E extends P{
    String emID="0000";
    public E(String id){
        super(id);
        emID =id;
    }
}
public class Test {
    public static void func(String str){
        int left=0;
        int right=str.length()-1;
        char[] array= str.toCharArray() ;
        while(left<right){
            char tmp=array[left];
            array[left]=array[right];
            array[right]=tmp;
            left++;
            right--;
        }

       for(char ch:array){
           System.out.print(ch);
       }
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String str=scan.nextLine();
        func(str);
}
    public static int fac(int n){
        int ret=1;
        for(int i=1;i<=n;i++){
            ret*=i;
        }
        return ret;
    }
    public static int func(int f){
        if(f%10!=0){
            return 0;
        }
        int count=0;
        while(f%10==0){
            count++;
            f=f/10;
        }
        return count;
    }
    public static void main6(String[] args) {
        Scanner scan=new Scanner(System.in);
        while(scan.hasNext()){
            int num=scan.nextInt();
            int factor=fac(num);
            int count=func(factor);
            System.out.println(count);
        }

    }
    public static void main5(String[] args) {
        int i=0;
        Integer j=new Integer(0);
        System.out.println(i==j);
        System.out.println(j.equals(i) );
    }
    public static void main4(String[] args) {
        String x="fmn";
        x.toUpperCase() ;
        String y=x.replace('f','F') ;
        y=y+"wxy";
        System.out.println(y);

    }
    private static void testMethod(){
        System.out.println("testMethod");
    }
    public static void main3(String[] args) {
        ((Test)null).testMethod();
    }
    public static void main2(String[] args) {
        int[]array={1,2,3,4,5};
        int i=0;
        for (int s:array) {
            System.out.println(array[i++]);
        }
    }
    static int cnt=6;
    static{
        cnt+=9;
    }
    public static void main1(String[] args) {
       /* double x=3.0;
        int y=5;
        x/=--y;
        System.out.println(x);*/
        System.out.println(cnt);
    }
    static {
        cnt/=3;
    };
}
