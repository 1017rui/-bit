import java.util.Arrays;

/**
 * @author 张瑞瑞
 * @date 2020/04/22 19:58
 */
//给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
//你可以假设每种输入只会对应一个答案。但是，数组中同一个元素不能使用两遍。
//给定 nums = [2, 7, 11, 15], target = 9
//因为 nums[0] + nums[1] = 2 + 7 = 9
//所以返回 [0, 1]

/*public class Test {
    public static int[] twoSum(int[] nums, int target) {
        int[]sum=new int[2];
      for(int i=0;i<nums.length;i++) {
          for (int j = nums.length-1; j >i; j--) {
              if (nums[i] + nums[j] == target) {
                  sum[0] = i;
                  sum[1] = j;
              }
          }
      }
        return sum;
    }
    public static void main(String[] args) {
       int[] nums={2,5,7,11};
       int target=12;
       int[]sum=twoSum(nums,target);
        System.out.println(Arrays.toString(sum));

    }
}*/
/*//给定两个大小为 m 和 n 的有序数组 nums1 和 nums2。
//请你找出这两个有序数组的中位数，并且要求算法的时间复杂度为 O(log(m + n))。
//你可以假设 nums1 和 nums2 不会同时为空。
//示例 1:
//nums1 = [1, 3]
//nums2 = [2]
//则中位数是 2.0
//示例 2:
//nums1 = [1, 2]
//nums2 = [3, 4]
//则中位数是 (2 + 3)/2 = 2.5
public class Test {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double center = 0;
        int[] num = new int[nums1.length + nums2.length];
        int i = 0;
        while (i < num.length){
            for (int j = 0; j < nums1.length; j++) {
                num[i] = nums1[j];
                i++;
            }
        for (int g = 0; g < nums2.length; g++) {
            num[i] = nums2[g];
            i++;
        }
    }
        Arrays.sort(num);
        if(num.length%2!=0){
            center=num[num.length/2];
        }else{
            center=(num[num.length/2]+num[(num.length/2)-1])/2.0;
        }
        return center;
    }
    public static void main(String[] args) {

        int[] nums1 ={1,3,5,8};
        int[] nums2 ={2,4,6,7};
        System.out.println(findMedianSortedArrays(nums1, nums2));
    }
}*/
/*//给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
//
//示例:
//
//输入: [0,1,0,3,12]
//输出: [1,3,12,0,0]
public class Test{
    //自己写的
    *//*public static void moveZeroes1(int[] nums) {
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                for(int j=i;j<nums.length;j++){
                    if(nums[j]!=0){
                        int ret=nums[j];
                        for(int g=j-1;g>=i;g--){
                            nums[g+1] =nums[g];
                        }
                        nums[i]=ret;
                        i++;
                    }
                }
            }
        }
    }*//*
    //大佬的
    public static void moveZeroes (int [] nums){
        int index=0;//把数组中不是零的数存放到下标为它的数组中，并且index++，
        // 所有非零的数放完之后，index 中的值 刚好是所有非零数的个数

        //先操作非零数，， 因为零反正是放在后面的，记住非零数的个数，剩下的自然是为零的数，之后往后补零就行了。
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[index]=nums[i];
                index++;
            }
        }
        //index=3
        //然后把从这个位置开始到数组最后位置中的元素都置为零
        for(int i=index;i<nums.length;i++){
            nums[i]=0;
        }
    }
    public static void main(String[] args) {
       // int []nums={1,0,9,0,4,3,0,5,7,0,6};//[1, 9, 4, 3, 5, 7, 6, 0, 0, 0, 0]
        int[]nums={0,1,0,3,12};
        moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }
}*/
//给定一个非空数组，返回此数组中第三大的数。如果不存在，则返回数组中最大的数。要求算法时间复杂度必须是O(n)。
//输入: [3, 2, 1]
//输出: 1
//输入: [1, 2]
//输出: 2
//解释: 第三大的数不存在, 所以返回最大的数 2 .
//输入: [2, 2, 3, 1]
//输出: 1
//解释: 注意，要求返回第三大的数，是指第三大且唯一出现的数。
//存在两个值为2的数，它们都排第二。
/*
public  class Test {
        public  static int thirdMax(int[] nums) {
            for(int i=0;i<nums.length;i++){
                //?
            }
            return 1;
        }
        public static void main(String[] args) {
            int[] arr1 = {3,2,1};
            int[] arr2 = {1,2};
            int[] arr3 = {2,2,3,1};
            System.out.println(thirdMax(arr1));
            System.out.println(thirdMax(arr2));
            System.out.println(thirdMax(arr3));

        }
}
*/
