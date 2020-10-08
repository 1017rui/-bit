/**
 * @author 张瑞瑞
 * @date 2020/06/30 10:51
 */
/*
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        while(scan.hasNext()){
            int candidates=scan.nextInt();//候选人人数
            String[] ch1=new String[candidates];
            for(int i=0;i<candidates;i++){
                ch1[i]=scan.next();
            }
            int voters=scan.nextInt();//投票人人数
            String[] ch2=new String[voters];
            for(int i=0;i<voters;i++){
                ch2[i]=scan.next();
            }
            int sum=0;
            for(int i=0;i<candidates;i++){
                int count=0;
                for(int j=0;j<voters;j++){
                    if(ch1[i].equals(ch2[j]) ){
                        count++;
                    }
                }
                sum+=count;
                System.out.println(ch1[i]+" : "+count);
            }
            if(sum<=voters){
                System.out.println("Invalid"+" : "+(voters-sum));
            }
        }
    }
}
*/
/*import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);

        while(scan.hasNext()){
            int n=scan.nextInt();//学生
            int m=scan.nextInt();//操作
            int[] scores=new int[n];//n个学生初始成绩
            for(int i=0;i<n;i++){
                scores[i]=scan.nextInt();
            }
            for(int i=0;i<m;i++){
                String c=scan.next();
                int a=scan.nextInt();
                int b=scan.nextInt();
                if(c.equals("Q")){
                    int left=Math.min(a,b);
                    int right=Math.max(a,b);
                    //询问操作 找id在[a,b]之间的最高成绩
                    //id从[a,b]   实际上下标从[a-1，b)
                    int maxScore=0;
                    for(int j=left-1;j<right;j++){
                        if(scores[j]>maxScore){
                            maxScore=scores[j];
                        }
                    }
                    System.out.println(maxScore);

                }else if(c.equals("U")){
                    //更新操作，要求把ID为a的学生的成绩更改为b。
                    scores[a-1]=b;
                }
            }
        }
    }
}*/
/*import java.util.Arrays;
import java.util.Scanner;

public class Main{
    //数组的排序
    public static int[] sort(int[] arr){
       //选择排序
       for(int i=0;i<arr.length-1;i++){
           for(int j=i+1;j<arr.length;j++){
               if(arr[i]>arr[j]){
                       //交换
                   int tmp=arr[i];
                   arr[i]=arr[j];
                   arr[j]=tmp;
               }
           }
       }
       return arr;
    }

    public static boolean func(int n,int[] arr){
        
        return true;
    }
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        while(scan.hasNext()){
            int n=scan.nextInt();//数组的长度
            int[] arr=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=scan.nextInt();
            }//整个数组输入完毕
            //找到那块可以反转的区域。
            int[] arr1=sort(arr);
            System.out.println(Arrays.toString(arr1));
            System.out.println(func(n,arr));
        }
    }
}
 */
import java.util.*;


public class Main {
    /**
     *
     * @param arr int整型一维数组 the array
     * @return int整型
     */
    public static int maxLength (int[] arr) {
        // write code here

        //定义一个hashmap，key为第i位数字，value为i
        Map<Integer,Integer> map=new LinkedHashMap<>();
        int maxSize=0;
        int i=0;
        while(i<arr.length){
            //发生hash冲突说明前面已经有相同的数了，那个将i移动到前面那个数的位置
            if(map.containsKey(arr[i])){
                maxSize=map.size()<maxSize?maxSize:map.size();
                i=map.get(arr[i]);
                map.clear();
            }else{
                map.put(arr[i],i);
            }
            i++;
        }
        maxSize=map.size()<maxSize?maxSize:map.size();
        return maxSize;
    }

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int[] arr={1,2,3,4,5,5};
        int[] arr2={2,2,3,4,4};
        int max=maxLength(arr);
        System.out.println(max);
        int max2=maxLength(arr2);
        System.out.println(max2);

    }
}