/**
 * @author 张瑞瑞
 * @date 2020/04/23 11:00
 */
//给你 n 个非负整数 a1，a2，...，an，每个数代表坐标中的一个点 (i, ai) 。在坐标内画 n 条垂直线，垂直线 i 的两个端点分别为 (i, ai) 和 (i, 0)。
// 找出其中的两条线，使得它们与 x 轴共同构成的容器可以容纳最多的水。

//说明：你不能倾斜容器，且 n 的值至少为 2。
//输入：[1,8,6,2,5,4,8,3,7]
//输出：49

/*public class Test {
    public static int max(int a,int b){
        return (a>b)?a:b;
    }
    public static int min(int a,int b){
        return (a<b)?a:b;
    }
        public static int maxArea(int[] height) {
            if(height.length<=1){
                return 0;
            }
            int left=0;//左边放一个指针
            int right=height.length-1;//右边放一个指针
            int maxarea=0;//放最大面积，初始值为零。

            while(left<right){
                //min(height[left],height[right])*(right-left)求的是left-right之间的面积
                //maxarea中始终放最大的面积。
                maxarea=max(maxarea,(min(height[left],height[right])*(right-left)));

                //每次让高度低的那端的指针往前或往后移动。
               if(height[left]<height[right]){
                   left++;
               }else{
                   right--;
               }
            }

        return maxarea;
    }
    public static void main(String[] args) {
        int[]arr1={1,8,6,2,5,4,8,3,7};
        int[]arr={2,3,4,8,6,8,9,9,5};
        int maxarea=maxArea(arr);
        System.out.println(maxarea);
    }
}*/
//给定一个排序数组，你需要在 原地 删除重复出现的元素，使得每个元素只出现一次，返回移除后数组的新长度。
//不要使用额外的数组空间，你必须在 原地 修改输入数组 并在使用 O(1) 额外空间的条件下完成。
//给定数组 nums = [1,1,2],
//函数应该返回新的长度 2, 并且原数组 nums 的前两个元素被修改为 1, 2。
//你不需要考虑数组中超出新长度后面的元素。
//给定 nums = [0,0,1,1,1,2,2,3,3,4],
//函数应该返回新的长度 5, 并且原数组 nums 的前五个元素被修改为 0, 1, 2, 3, 4。
//你不需要考虑数组中超出新长度后面的元素。
/*public class Test{
    public  static int removeDuplicates1(int[] nums) {//自己写的
        int len=nums.length;//初始值
        int i=0;
        while(i<len){
            for(int j=i+1;j<len;j++){
                if(nums[i]==nums[j]){
                    for(int g=j;g<len-1;g++){
                        nums[g]=nums[g+1];
                    }
                    len--;
                    j=i;

                }
            }
            i++;
        }
        return len;
    }
    public static int removeDuplicates(int[] nums) {//大佬写的
        // 使用双指针
        if(nums==null || nums.length == 1){
            return nums.length;
        }
        int i = 0,j =1;
        while(j<nums.length){
            if(nums[i]==nums[j]){
                j++;
            }else{
                i++;
                nums[i]=nums[j];
                j++;
            }
        }
        return i+1;
    }
    public static void print(int a){
        System.out.print(a+" ");
    }
    public static void main(String[] args) {
    int[]nums={0,0,1,1,1,2,2,3,3,4};
    //int[]nums={1,1,2};
    int len=removeDuplicates(nums);
        System.out.println(len);
        for (int i = 0; i < len; i++) {
            print(nums[i]);
        }
    }
}*/
//给你一个数组 nums 和一个值 val，你需要 原地 移除所有数值等于 val 的元素，并返回移除后数组的新长度。
//不要使用额外的数组空间，你必须仅使用 O(1) 额外空间并 原地 修改输入数组。
//元素的顺序可以改变。你不需要考虑数组中超出新长度后面的元素。
//给定 nums = [3,2,2,3], val = 3,
//函数应该返回新的长度 2, 并且 nums 中的前两个元素均为 2。
//给定 nums = [0,1,2,2,3,0,4,2], val = 2,
//函数应该返回新的长度 5, 并且 nums 中的前五个元素为 0, 1, 3, 0, 4。
public class Test{

    /*int left=0;
    int right=nums.length-1;
    int flag=0;
    if(left==right){
        if(nums[left]==val){
            return 0;
        }else{
            return 1;
        }
    }
    while(left<right){
        if(nums[left]!=val){
            left++;
        }else{
            while(right-left>0)
                if(nums[right]==val){
                    right--;
                }else{
                    flag=1;
                    nums[left]=nums[right];
                    right--;
                    break;
                }
        }
    }
    if(flag==0){
        return left;
    }
    return left+1;*/
    public static  int removeElement(int[] nums, int val) {
        int j=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val){
                nums[j]=nums[i];
                j++;
            }
        }
        return j;
    }
    public static void main(String[] args) {
        int[]nums={0,1,2,2,3,0,4,2};
        int val=2;
        int len=removeElement(nums,val);
        System.out.println(len);
        for (int i = 0; i < len; i++) {
            System.out.print(nums[i]+" ");
        }
    }
}