import java.util.Arrays;

/**
 * @author 张瑞瑞
 * @date 2020/06/03 13:55
 */
public class TestSort {
    /*
    *插入排序
    * 时间复杂度：O(n^2) 最好情况O(n)
    * 空间复杂度：O(1)
    * 稳定性：稳定
     */
    public static void InsertSort(int[]array){
        int tmp=0;
       for(int i=1;i<array.length;i++){
           tmp=array[i];
           int j=0;
           for(j=i-1;j>=0;j--){
               if(tmp<array[j]) {
                    array[j+1]=array[j];
               }else{
                   break;
               }
           }
           array[j+1]=tmp;
       }

    }
    /*
    *选择排序  每次确定一个位置
    * 时间复杂度：O(n^2)(无论情况好坏)
    * 空间复杂度：O(1)
    * 稳定性：不稳定
     */
    public static void SelectSort(int[] array){
        for(int i=0;i<array.length-1 ;i++){
            for(int j=i+1;j<array.length;j++){
                if(array[i]>array[j]){
                    //交换
                    int tmp=array[i];
                    array[i]=array[j];
                    array[j]=tmp;
                }
            }
        }
    }
    /*
    *冒泡排序  没有优化
    * 时间复杂度：O(n^2)（无论好坏情况）
    * 空间复杂度：O(1)
    * 稳定性：稳定
     */
    public static void BubbleSort(int[] array){
        //每一趟确定一个位置 n个元素需要n-1趟
        for(int i=0;i<array.length-1;i++){
            for(int j=0;j<array.length-1-i;j++){
                if(array[j]>array[j+1]){
                    int tmp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=tmp;
                }
            }
        }
    }
    /*
    *优化之后的冒泡排序
    * 时间复杂度可以达到 O(n)
     */
    public static void BubbleSortBest(int[] array){
        //每一趟确定一个位置 n个元素需要n-1趟
        boolean flg=true;
        for(int i=0;i<array.length-1;i++){
            flg=true;
            for(int j=0;j<array.length-1-i;j++){
                if(array[j]>array[j+1]){
                    int tmp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=tmp;
                    flg=false;
                }
            }
            if(flg){
                break;
            }
        }
    }
    /*
    *快速排序：比堆排快但空间复杂度比堆排略高。
    * 将待排序序列化分成两部分
    * 时间复杂度：O(n*logn)（最好情况） O(n^2) （最坏情况）
    * 空间复杂度：最好情况:O(logn) 最坏情况:O（n）
    * 稳定性：不稳定
     */
    public static int partition (int[] array,int left,int right){
        int tmp=array[left];
        while(left<right ){
            while(left<right &&array[right]>=tmp){
                right--;
            }
            array[left]=array[right];
            while(left<right&&array[left]<=tmp){
                left++;
            }
            array[right]=array[left];
        }
        array[left]=tmp;
        return left;

    }
    public static void quick(int[] array,int left,int right){
        if(left>=right){
            return;
        }
        //找基准
        int par =partition(array,left,right);
                quick(array,left,par-1) ;
                quick(array,par+1,right);
    }
    public static void quickSort(int[]array){
        quick(array,0,array.length-1);
    }
    public static void main(String[] args) {
        int[]array={10,5,8,4,1,9};
        quickSort(array) ;
        System.out.println(Arrays.toString(array));
        System.out.println(Math.round(11.3));//11
        System.out.println(Math.round(11.5));//12
        System.out.println(Math.round(11.7));//12
        System.out.println(Math.round(-11.3));//-11
        System.out.println(Math.round(-11.5));//-11
        System.out.println(Math.round(-11.8));//-12
        String str="boob";
StringBuffer sb=new StringBuffer(str) ;

    }
}
