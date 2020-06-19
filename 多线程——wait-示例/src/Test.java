import java.util.Scanner;

/**
 * @author 张瑞瑞
 * @date 2020/06/19 23:24
 */
public class Test {

    public static double count(String s){
        if(s.length()==0){
            return 0;
        }
        int count=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='C'||s.charAt(i)=='G'){
                count++;
            }
        }
        return count*1.0/s.length();
    }
        public static String func(String str,int n){

            String ret="";

            for(int i=0;i<=str.length()-n;i++){
                String tmp=str.substring(i,i+n);
                ret=(count(ret)>=count(tmp))?ret:tmp;
            }
            return ret;
        }
        public static void main(String[] args){
            Scanner scan=new Scanner(System.in);
            String str=scan.next();
            int n=scan.nextInt();
            String ret=func(str,n);
            System.out.println(ret);
        }

    public static void main2(String[] args) {
        String str="zhangruirui";
        String ret=str.substring(0, 5);
        ret.contains("GC") ;
        System.out.println();
    }
    public static void main1(String[] args) {
        Integer o1=59;
        int o2=59;
        Integer o3=Integer.valueOf(59) ;
        Integer o4=new Integer(59);
        System.out.println(o3==o4);
        System.out.println(o1==o3);
        System.out.println(o2==o4);
        System.out.println(o1==o2);
    }
}
