/**
 * @author 张瑞瑞
 * @date 2020/06/08 22:31
 */
import java.util.*;

public class Main1{
    public static void main(String[] args) {
        try{
            int i=100/0;
            System.out.print(i);
        }catch(Exception e){
            System.out.print(1);
            throw new RuntimeException() ;
        }finally {
            System.out.print(2);
        }
        System.out.print(3);
    }
    public static void main4(String[] args) {
        byte b1=1,b2=2,b3,b6;
        final byte b4=4,b5=6;
        b6=b4+b5;
       // b3=(b1+b2);//带()将byte转换为int型了
        //System.out.println(b3+b6);
    }
    public static void main3(String[] args) {
        int array[] =new int[10];
        System.out.println(array[10]);
    }
    public int add(int a,int b){
        try{
            return a+b;
        }catch(Exception e){
            System.out.println("catch语句块");
        }finally {
            System.out.println("finally语句块");
        }
        return 0;
    }
    public static void main2(String[] args) {
        Main1 test=new Main1();
        System.out.println("和是："+test .add(9,34));
    }
    public static int func(int n){
        List<Integer> list=new ArrayList<>();

        for(int i=0;i<n;i++){
            list.add(i);
        }
        int i=0;
        while(list.size()>1){
            i=(i+2)%list.size() ;
           list.remove(i) ;
        }
        return list.get(0) ;//此时list当中只剩余一个元素返回即可。

    }
    public static void main1(String[] args){
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int nums=func(n);
        System.out.println(nums);
    }
}
