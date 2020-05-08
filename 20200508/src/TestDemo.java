import java.util.Arrays;

/**
 * @author 张瑞瑞
 * @date 2020/05/08 12:33
 */
public class TestDemo {
    //给你两个有序整数数组 nums1 和 nums2，请你将 nums2 合并到 nums1 中，使 nums1 成为一个有序数组。
    //初始化 nums1 和 nums2 的元素数量分别为 m 和 n 。
    //你可以假设 nums1 有足够的空间（空间大小大于或等于 m + n）来保存 nums2 中的元素。
    //nums1 = [1,2,3,0,0,0], m = 3   6
    //nums2 = [2,5,6],       n = 3   3
    //输出: [1,2,2,3,5,6]
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        System.arraycopy(nums2, 0, nums1, m, n);//将指定源数组中的数组从指定位置复制到目标数组的指定位置。
        Arrays.sort(nums1);//?

}
    public static void main(String[]args){
        int[]nums1={0,2,3,0,0,0};
        int[]nums2={2,5,6};
        int m=nums1.length;
        int n=nums2.length;
        merge(nums1,m,nums2,n) ;
        System.out.println(Arrays.toString(nums1));

    }
    //将数组分成和相等的三部分
   /*
    形式上，如果可以找出索引 i+1 < j 且满足 
    (A[0] + A[1] + ... + A[i] ==
    A[i+1] + A[i+2] + ... + A[j-1] ==
     A[j] + A[j-1] + ... + A[A.length - 1])
      就可以将数组三等分。
输入：[0,2,1,-6,6,-7,9,1,2,0,1]
    输出：true
    解释：0 + 2 + 1 = -6 + 6 - 7 + 9 + 1 = 2 + 0 + 1
    示例 2：

    输入：[0,2,1,-6,6,7,9,-1,2,0,1]
    输出：false
*/
    public static boolean canThreePartsEqualSum(int[] A) {
        if(A.length<3){
            return false;
        }
        int sum = 0;//整个数组的和
        for (int i = 0; i < A.length; i++) {
            sum = sum + A[i];
        }
        if (sum % 3 == 0){
        //可能可以分成三份
                int div=sum/3;
                int linshi=0;
                int linshi2=0;
                for (int i = 0; i < A.length; i++) {
                       linshi =linshi + A[i];
                       if ( linshi==div){//可以拿到第一份
                           for(int j=i+1;j<A.length;j++){
                               linshi2 =linshi2 + A[j];
                               if(linshi2==div){//可以拿到第二份
                                   if(j==A.length-1){
                                       return false;
                                   }
                                   return true;
                               }
                           }
                       }
                }
        }
        return false;
}

    public static void main2(String[] args) {
        int[]array={-1,1,-1,1};
        System.out.println(canThreePartsEqualSum(array));

    }
    //反转字符串
    //编写一个函数，其作用是将输入的字符串反转过来。输入字符串以字符数组 char[] 的形式给出。
    //不要给另外的数组分配额外的空间，你必须原地修改输入数组、使用 O(1) 的额外空间解决这一问题。
    //你可以假设数组中的所有字符都是 ASCII 码表中的可打印字符。

    //输入：["h","e","l","l","o"]
    //输出：["o","l","l","e","h"]
    public static void reverseString(char[] s) {
        int left=0;
        int right=s.length-1;
        while(left<right){
            char tmp=s[left];
            s[left]=s[right];
            s[right]=tmp;
            left++;
            right--;
        }
    }
    public static void main1(String[] args) {
        char[] array={'a','b','c','d','e'};
        reverseString(array) ;
        System.out.println(Arrays.toString(array));
    }
}
