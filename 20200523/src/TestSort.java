import java.util.Arrays;

/**
 * @author 张瑞瑞
 * @date 2020/05/23 17:37
 */
public class TestSort {
    /*
    *插入排序:
    * 时间复杂度：最坏情况下O（n^2）最好情况下O（n)
    * 越有序越快，效率越高
    *空间复杂度：O（1）
    *稳定性：稳定
     */
    public static void InsertSort(int[] array){
        for(int i=1;i<array.length;i++){
            int tmp=array[i];
            int j=0;
            for( j=i-1;j>=0;j--){
                if(array[j]>tmp){
                    array[j+1]=array[j];
                }else{
                    break;
                }
            }
            array[j+1]=tmp;
        }

    }
    /*
    *希尔排序：
    * 基本思想：采用分组的思想进行直接插入排序，待数组趋于有序的时候，在对整个数组进行一次直接插入排序
    *时间复杂度：O(1.3)-O(1.5)
    *空间复杂度：O（1）
    * 稳定性：不稳定（有跳跃式的交换）
     */
    public static void shell(int[]array,int gap){
        for(int i=gap;i<array.length;i++){
            int tmp=array[i];
            int j=0;
            for( j=i-gap;j>=0;j=j-gap){
                if(array[j]>tmp){
                    array[j+gap]=array[j];
                }else{
                    break;
                }
            }
            array[j+gap]=tmp;
        }
    }
    public static void shellSort(int[]array){
            int[] drr={5,3,2,1};
            for(int i=0;i<drr.length;i++){
                shell(array,drr[i]);
            }
        }
        /*
        *选择排序：
        * 每次确定一个元素的位置
        * 时间复杂度：O（n^2）(无论情况好坏)
        * 空间复杂度：O（1）
        * 稳定性：不稳定
         */
        public static void selectSort(int[]array){
            for(int i=0;i<array.length-1;i++){
                for(int j=i+1;j<array.length;j++){
                    if(array[i]>array[j]) {
                        int tmp = array[i];
                        array[i] = array[j];
                        array[j]=tmp;
                    }
                }
            }
        }
        /*
        *堆排序：
        * 堆排序的时间复杂度 O(n)*O(log2n)+O(n)==O(n*log2n)（其中O(log2n)表示一次向下调整的时间复杂度,在循环中调整所以是O(n)*O(log2n)，O(n)表示建堆的时间复杂度，）
        * 时间复杂度：O(n*log2n)（无论情况好坏）
        * 空间复杂度：O（1）
        * 稳定性：不稳定
         */
    public static void heapSort(int[]array){
        createHeap(array);
        int end=array.length-1;
       while(end>0){
           int tmp=array[0];
           array[0]=array[end];
           array[end]=tmp;
           adjustDown(array,0,end);
           end--;
       }
    }
        //建堆
    public static void adjustDown (int[]array,int root,int len){
        int parent=root;
        int child=2*parent+1;
        while(child<len){
            if(child+1<len&&array[child+1]>array[child]){
                child++;
            }
            if(array[child]>array[parent ]){
                int tmp=array[child];
                array[child]=array[parent ];
                array[parent]=tmp;
                parent =child;
                child=2*parent +1;
            }else{
                break;
            }
        }
    }
    public static void createHeap(int[]array){
        //调整为大根堆
        for(int i=(array.length-1-1)/2;i>=0;i--){
            adjustDown(array,i,array.length);
        }

    }
    /*
    *冒泡排序：
    * 在无序区间，通过相邻数的比较，将最大的数冒泡到无序区间的最后，持续这个过程，
    * 每趟确定一个位置
    * 时间复杂度：O（n^2）(无论情况好坏)  但是优化之后的代码时间复杂度可以达到O（n）
    * 空间复杂度：O(1)
    * 稳定性：稳定的
     */
    public static void bubbleSort(int[]array){
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
    //优化
    public static void bubbleSort1(int[]array){
        boolean flg=false;
        for(int i=0;i<array.length-1;i++){
            flg=false;
            for(int j=0;j<array.length-1-i;j++){
                if(array[j]>array[j+1]){
                    int tmp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=tmp;
                    flg=true;
                }
            }
            if(flg==false){
                break;
            }
        }
    }
    public static void main(String[] args) {
        int[] array={10,5,8,4,1,9};
        InsertSort(array);
        System.out.println(Arrays.toString(array));
        int []array1={12,5,9,34,6,8,33,56,89,0,7,4,22,55,77};
        bubbleSort(array1) ;
        System.out.println(Arrays.toString(array1));

    }
}
