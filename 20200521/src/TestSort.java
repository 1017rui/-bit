import java.util.Arrays;

/**
 * @author 张瑞瑞
 * @date 2020/05/22 18:58
 */
public class TestSort {
   /* 插入排序：
    *时间复杂度： 最坏情况 O（n^2）最好情况 O(n)
    *重要的一句话：越有序越快
    *空间复杂度：（额外的空间）：O（1）
    *稳定性：稳定的排序
    * 如果说一个排序是稳定的排序，那么他就可以变成不稳定的排序
    * 但是如果一个排序本身就是不稳定的排序，是不可能把它变成稳定的排序
    *
    * 如果是稳定的排序，在比较的过程中就没有跳跃式的交换。
    */
    public static void InsertSort(int[] array){
        int tmp=0;
        for(int i=1;i<array.length;i++){
            tmp=array[i];
            int j=0;
            for( j=i-1;j>=0 ;j--){
                if(array[j]>tmp){
                    array[j+1]=array[j];
                } else{
                    //array[j+1]=tmp;
                    break;
                }
            }
            array [j+1]=tmp;
        }

    }
    /* 希尔排序：
    分组时保证分的组为素数，并且保证最后一次为1
     *时间复杂度：  O（n^1.3）- O(n^1.5)
     *
     *空间复杂度：（额外的空间）：O（1）
     *稳定性：不稳定的排序
     *
     */
        public static void shell(int[] array,int gap) {

            int tmp=0;
            for(int i=gap;i<array.length;i++){
                tmp=array[i];
                int j=0;
                for( j=i-gap;j>=0 ;j=j-gap){
                    if(array[j]>tmp){
                        array[j+gap]=array[j];
                    } else{
                        //array[j+1]=tmp;
                        break;
                    }
                }
                array [j+gap]=tmp;
            }

        }

        public static  void  shellSort(int[] array) {

            int[] drr = {5,3,1};
            for (int i = 0; i < drr.length; i++) {
                shell(array,drr[i]);
            }

        }
    /* 选择排序：
    *时间复杂度：  O（n^2）（无论情况好坏）
    *空间复杂度：（额外的空间）：O（1）
    *稳定性：不稳定的排序（有跳跃式交换）
    *
    */
        public static void selectSort(int[] array){
            for(int i=0;i<array .length-1;i++){
               for(int j = i+1;j<array.length;j++) {
                    if (array[i] > array[j]) {
                        int tmp = array[i];
                        array[i] = array[j];
                        array[j] = tmp;
                    }
                }
            }
        }
        /*
        *堆排序：
        * 时间复杂度：O（n*logn）无论有序无序都是
        * 空间复杂度：O（1）
        * 稳定性：不稳定的排序（存在跳跃式的交换）
         */
        public static void adjustDown(int[]array,int root,int len){
            int parent=root;
            int child=2*parent +1;
            while(child<len){
                if(child+1<len&&array[child]<array[child+1]){
                    child++;
                }
                if(array [child]>array[parent]){
                    int tmp=array[child];
                    array[child]=array[parent];
                    array[parent]=tmp;
                    parent=child;
                    child=2*parent+1;
                }else{
                    break;
                }
            }
        }
        //创建一个堆
    public static void creatHeap(int[] array){
            for(int i=(array.length-1-1)/2;i>=0;i--){
                adjustDown(array,i,array.length);
            }
    }

    public static void heapSort(int[] array){
            creatHeap(array);
        int end=array.length-1;
        while(end>0) {
            int tmp = array[0];
            array[0] = array[end];
            array[end] = tmp;
            adjustDown(array, 0, end);
            end--;

        }
    }
    /*
    *冒泡排序：
    * 时间复杂度：O（n^2）(无论好坏情况，但是经过优化后可以达到O（n）)
    *空间复杂度：O（1）
    *稳定性：稳定的排序
     */
    public static void bubbleSort(int[] array){
        //每趟确定一个位置
        for (int i=0;i<array.length-1;i++){
            for(int j=0;j<array.length-1-i;j++){
            if(array[j]>array[j+1]){
                int tmp=array[j];
                array[j]=array[j+1];
                array[j+1]=tmp;
            }
            }
        }
    }
    //优化后
    public static void bubbleSort1(int[] array){
        //每趟确定一个位置
        boolean flag=false;
        for (int i=0;i<array.length-1;i++){
            flag=false ;
            for(int j=0;j<array.length-1-i;j++){
                if(array[j]>array[j+1]){
                    int tmp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=tmp;
                    flag=true;
                }
                if(flag==false){
                    //说明此时数组已经有序
                    break;
                }
            }
        }
    }
    public static void main(String[] args) {
        /* int [] array={10,5,8,4,1,9};
        System.out.println(Arrays.toString(array));
        InsertSort(array) ;
        System.out.println(Arrays.toString(array));*/
        int []array1={12,5,9,34,6,8,33,56,89,0,7,4,22,55,77};
        System.out.println(Arrays.toString(array1));
        heapSort(array1) ;
        System.out.println(Arrays.toString(array1));
    }
}
