/**
 * @author 张瑞瑞
 * @date 2020/06/06 9:15
 */
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/*public class Main{
    public static void main(String[]args){

        Scanner scan=new Scanner(System.in);
        HashMap<Integer,Integer> map=new HashMap<>();
        Set<Integer> set=map.keySet() ;

        int nums1=scan.nextInt();
        int nums2=scan.nextInt();
        int nums3=scan.nextInt();
        int nums4=scan.nextInt();
    }
}*/
public class Main{
    public static int func(Integer[] arr,int n){
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            if(!map.containsKey(arr[i])){
                map.put(arr[i],1);
            }else{
                int ret=map.get(arr[i]);
                map.put(arr[i],ret+1);
                if(ret+1>=n/2){
                    return arr[i];
                }

            }
        }
        return -1;
    }

    /*public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int[]array=new int[100];
        int i=0;
        while(scan.hasNext()){
            array[i++]=scan.nextInt() ;
        }
        int ret=func(array,i);
        System.out.println(ret);
    }*/
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        while(scan.hasNext()){
            String s=scan.nextLine();
            String[] str=s.split(" ");
            Integer[] array=new Integer[str.length];
            for(int i=0;i<str.length;i++){
                array[i]=Integer.parseInt(str[i]);//可以解析一个字符串并返回整数
            }
            int ret=func(array,array.length);
            System.out.println(ret);
        }
    }
}