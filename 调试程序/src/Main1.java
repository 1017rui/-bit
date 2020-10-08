/**
 * @author 张瑞瑞
 * @date 2020/09/24 21:33
 */

import java.util.*;
public class Main1 {
    public static  int[] twoSum (int[] numbers, int target) {
        // write code here
        int[] arr=new int[2];
        if(numbers.length<=0){
            return arr;
        }
        for(int i=0;i<numbers.length-1;i++){
            for(int j=i+1;j<numbers.length;j++){
                if(numbers[i]+numbers[j]==target){
                    arr[0]=i+1;
                    arr[1]=j+1;
                    break;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr={0,4,3,0};
        int[] ret=twoSum(arr,0);
        System.out.println(Arrays.toString(ret));
    }
}