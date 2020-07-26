/**
 * @author 张瑞瑞
 * @date 2020/07/25 20:09
 */
import java.util.*;

public class MaxGap {
    public static int maxNum(int [] arr, int left,int right){
        if(left==right){
            return arr[left];
        }
        int max=0;
        for(int i=left;i<=right;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
    public static int findMaxGap(int[] A, int n) {
        // write code here
        int maxRet=0;
        for(int i=0;i<=n-2;i++){
            maxRet=Math.max(maxRet,Math.abs(maxNum(A,0,i)-maxNum(A,i+1,n-1)));
        }
        return maxRet;
    }

    public static void main(String[] args) {
        int[] arr={2,7,3,1,1};
        int n=5;
        int ret=findMaxGap(arr,n);
        System.out.println(ret);

    }
}