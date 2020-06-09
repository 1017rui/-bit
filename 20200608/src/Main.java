/**
 * @author 张瑞瑞
 * @date 2020/06/08 22:13
 */
import java.util.Arrays;
import java.util.Scanner;
public class Main{
    private static void func(Integer[] array, int k) {
        Arrays.sort(array);
        for(int i=0;i<k;i++){
            System.out.print(array[i]+" ");
        }
    }
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        String str=scan.nextLine();
        String[] strings=str.split(" ");//使用空格分隔字符串
        Integer[] array=new Integer[strings.length-1];
        for(int i=0;i<array.length;i++){
            array[i]=Integer.parseInt(strings[i]);
        }
        int k=Integer.parseInt(strings[strings.length-1]) ;
        func(array,k);
       /* int[]array=new int[100];
        int i=0;
        while(scan.hasNext()){
            array[i++]=scan.nextInt();
        }
        int k=scan.nextInt();*/
    }


}