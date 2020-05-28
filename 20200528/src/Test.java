import javafx.print.Collation;

import java.util.*;

/**
 * @author 张瑞瑞
 * @date 2020/05/28 12:23
 */
public class Test {
    public int numJewelsInStones(String J, String S) {
        char[] array1=J.toCharArray() ;
        char[] array2=S.toCharArray() ;
        Set<Character > set=new HashSet<>();
       for(char ch:array1){
           set.add(ch) ;
       }
       int count=0;
       for(int i=0;i<array2.length ;i++){
           if(set.contains(array2 [i]) ){
              count++;
           }
       }
       return count;
    }
    public static int heightChecker(int[] heights) {
        int[]array=Arrays.copyOf(heights ,heights .length) ;
        Arrays .sort(array) ;
        int count=0;
        for(int i=0;i<array.length ;i++){
                if(array [i]!=heights [i]){
                    count++;
                }
        }
    return count;
    }
    public static int numOfSubarrays(int[] arr, int k, int threshold) {
        if(arr.length==0){
            return 0;
        }
        int sum=0;
        for(int i=0;i<=arr.length-k;i++){
            int j=0;
            int count=0;
            while(j!=k){
                count +=arr[i+j];
                j++;
            }
            if(count>=k*threshold){
                sum++;
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        int[] arr={2,2,2,2,5,5,5,8};
        int k=3;
        int threshold=4;
        int num=numOfSubarrays(arr,k,threshold ) ;
        System.out.println(num);
        int[]arr1={1,2,3,4,5};
        int re=heightChecker(arr1);
        System.out.println(re);
       /* MyArrayList <Integer> my1=new MyArrayList<>() ;
        my1.add(1);
        my1.add(2);
        my1.add(3);
        my1.add(4);
        my1.display() ;
*/
    }
}
