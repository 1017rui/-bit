import java.util.Arrays;

/**
 * @author 张瑞瑞
 * @date 2020/04/17 20:46
 */

    //在一个二维数组中（每个一维数组的长度相同），
// 每一行都按照从左到右递增的顺序排序，
// 每一列都按照从上到下递增的顺序排序。
// 请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
public class Testdemo {
    public static boolean find(int target, int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] == target) {
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[][] array = {{1, 2, 3, 4}, {2, 3, 4, 5}, {3, 4, 5, 6}};
        int t = 7;
        System.out.println(find(t, array));
    }
}
//把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。
//输入一个非递减排序的数组的一个旋转，输出旋转数组的最小元素。
//例如数组{3,4,5,1,2}为{1,2,3,4,5}的一个旋转，该数组的最小值为1。
//NOTE：给出的所有元素都大于0，若数组大小为0，请返回0。
/*public class Testdemo{
    public static  int minNumberInRotateArray1(int [] array) {
        for(int i=0;i<array.length-1;i++){
            if(array[i]>array[i+1]){
                return array[i+1];
            }
        }
        return array[0];


    }
    public static  int minNumberInRotateArray(int [] array) {
        Arrays.sort(array);
        return array[0];
    }

    public static void main(String[] args) {
        int[]array={3,4,5,1,2};
        int ret=minNumberInRotateArray(array);
        System.out.println(ret);
    }
}*/
//在一个长度为n的数组里的所有数字都在0到n-1的范围内。
// 数组中某些数字是重复的，但不知道有几个数字是重复的。
// 也不知道每个数字重复几次。请找出数组中任意一个重复的数字。
// 例如，如果输入长度为7的数组{2,3,1,0,2,5,3}，那么对应的输出是第一个重复的数字2。
/*
public class Testdemo {
    public static boolean duplicate1(int numbers[],int length,int [] duplication) {

        int count=0;
        int tmp=0;
        for(int i=0;i<length;i++){
            count=0;
            for(int j=0;j<length;j++){
                if(numbers[i]==numbers[j]){
                    count++;
                    tmp=i;
                }
            }
            if(count>1){
                duplication[0]=numbers[tmp];
                return true;
            }
        }
        return false;
    }

    public static boolean duplicate(int numbers[],int length,int [] duplication) {
        boolean[] k = new boolean[length];
        for (int i = 0; i < k.length; i++) {
            if (k[numbers[i]] == true) {
                duplication[0] = numbers[i];
                return true;
            }
            k[numbers[i]] = true;
        }
        return false;
    }
    public static void main(String[] args) {
        int[]array={2,3,1,0,2,5,3};
        int[]dup=new int[1];
        boolean ret=duplicate(array, array.length, dup);
        System.out.println(ret);
    }
}*/
