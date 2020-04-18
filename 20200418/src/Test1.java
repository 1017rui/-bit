import java.util.Arrays;

/**
 * @author 张瑞瑞
 * @date 2020/04/18 18:02
 *
 * */

//请实现一个函数，将一个字符串中的每个空格替换成“%20”。
// 例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。
/*public class Test1 {
    public static String replaceSpace(StringBuffer str) {
        return str.toString().replaceAll(" " , "%20");//用给定的替换替换与给定的 regular expression匹配的此字符串的每个子字符串。
    }
    public static void main(String[] args) {
        String str ="We Are Happy";
        String ret=replaceSpace(str);
        System.out.println(ret);
    }
}*/
//要求输入一个整数n，请你输出斐波那契数列的第n项（从0开始，第0项为0）。
//n<=39
/*
public  class Test1{
    public static int Fibonacci(int n) {
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        return Fibonacci(n-1) +Fibonacci(n-2) ;
    }
    public static void main(String[] args) {
        int n=5;
        System.out.println(Fibonacci(n));
    }
}*/
//一只青蛙一次可以跳上1级台阶，也可以跳上2级。求该青蛙跳上一个n级的台阶总共有多少种跳法（先后次序不同算不同的结果）。
   // 一只青蛙一次可以跳上1级台阶，也可以跳上2级……它也可以跳上n级。求该青蛙跳上一个n级的台阶总共有多少种跳法。
    //import java.util.*;
/*public class Test1{
    public  static int JumpFloor(int target) {
        if(target==1){
            return 1;
        }if(target==2){
            return 2;
        }
        return JumpFloor(target-1) +JumpFloor(target-2);
    }
    public static int JumpFloorII(int target){
        return (int)Math.pow(2,(target-1));
    }
    public static void main(String[] args) {
        int t=1;
        System.out.println(JumpFloorII(t));
    }
}*/
//我们可以用2*1的小矩形横着或者竖着去覆盖更大的矩形。请问用n个2*1的小矩形无重叠地覆盖一个2*n的大矩形，总共有多少种方法？
//
//比如n=3时，2*3的矩形块有3种覆盖方法：
/*public class Test1 {
    public static  int RectCover(int target) {
       *//* if(target  <= 1){
            return 1;
        }
        if(target==1){
            return 1;
        }
        else if(target==2){
            return 2;
        }
        else {
            return RectCover(target - 1) + RectCover(target - 2);
        }*//*
       if(target<=0){
           return 0;
       }else if(target==1||target==2){
           return target;
       }else{
           return RectCover(target-1)+RectCover(target-2);
       }
    }

    public static void main(String[] args) {
        int n=5;
        System.out.println(RectCover(n));
    }
}*/
//        输入一个整数，输出该数二进制表示中1的个数。其中负数用补码表示。
/*public class Test1{
    public static int NumberOf1(int n){
        int count =0;
       while(n!=0){
           n=n&(n-1);
           count++;
       }
       return count;
    }
    public static void main(String[] args) {
        int n=-1;
        System.out.println(NumberOf1(n));
    }
}*/
//输入一个整数数组，实现一个函数来调整该数组中数字的顺序，使得所有的奇数位于数组的前半部分，所有的偶数位于数组的后半部分
public class Test1{
    public static  void reOrderArray(int [] array){
        int left=0;
        int right=array.length-1;
        while(left<right){
            while(left<right&&array[left]%2!=0){
                left++;
            }
            while(left<right&&array[right]%2==0){
                right--;
            }
            if(left<right){
                int tmp=array[left];
                array[left]=array[right];
                array[right]=tmp;
            }
        }

    }
    //输入一个整数数组，实现一个函数来调整该数组中数字的顺序，使得所有的奇数位于数组的前半部分，所有的偶数位于数组的后半部分，并保证奇数和奇数，偶数和偶数之间的相对位置不变。
    public  static void reOrderArray2(int [] array) {
        if(array==null||array.length==0)
            return;
        int i = 0,j;
        while(i<array.length){
                while(i<array.length&&array[i]%2!=0) {
                    i++;
                }//跳出循环找到一个偶数。
                j = i+1;
                while(j<array.length&&array[j]%2==0) {
                    j++;
                }//跳出循环找到一个奇数。
                if(j<array.length){//将[i,...,j-1]的元素整体后移一位，
                    int tmp = array[j];
                    for (int j2 = j-1; j2 >=i; j2--) {
                        array[j2+1] = array[j2];
                    }
                    array[i] = tmp;//最后将找到的奇数放入i位置，然后i++。
                    i++;
                }else{// 查找失敗
                    break;
                }
        }
    }
    public static void main(String[] args) {
       int []arr={1,2,3,4,5,6,7,8,9,10};
       reOrderArray2(arr);
        System.out.println(Arrays.toString(arr));
    }
}