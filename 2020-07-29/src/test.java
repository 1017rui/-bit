import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author 张瑞瑞
 * @date 2020/08/03 10:23
 */
//public class test {
//    public static ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
//        ArrayList<Integer> list=new ArrayList<>();
//        if(input.length==0){
//            return list;
//        }
//        Arrays.sort(input);
//        for(int i=0;i<k;i++){
//            list.add(input[i]);
//
//        }
//        return list;
//    }
//    public static void main(String[] args) {
//        int[] arr={1,5,6,3,12,34,2,5,6,74,9};
//        ArrayList<Integer> list=GetLeastNumbers_Solution(arr,5);
//        System.out.println(list);
//    }
//}
import java.util.Scanner;
import java.util.Stack;

class Customer{
    public int b;//人数
    public int c;//预计消费金额
    public Customer(int b,int c){
        this.b=b;
        this.c=c;
    }
    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }
}
public class test{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        Stack<Integer> stack=new Stack<>();
        while(scan.hasNext()){
            int n=scan.nextInt();
            int m=scan.nextInt();
            int[] a=new int[n];//每个桌子可以容纳的最大人数
            Customer[] customer=new Customer[m];
            for(int i=0;i<n;i++){
                a[i]=scan.nextInt();
            }
            for(int i=0;i<m;i++){
                customer[i]=new Customer(scan.nextInt(),scan.nextInt());
            }
            for(int i=0;i<n;i++){

            }
        }
    }
}