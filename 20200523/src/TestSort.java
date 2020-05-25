import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

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
    /*
    *快速排序
    * 时间复杂度：（O(n*logn)最好情况  ） 最坏情况: 升序或逆序 O（n^2）
    * 空间复杂度：最好情况:O(log2n) 最坏情况:O（n）
    * 稳定性：不稳定
     */
    //找基准
    public static int partition(int[] array,int low,int high) {
       int tmp=array[low];
        while(low<high){

           while(low<high&&array[high]>=tmp){
               high--;
           }
           array[low] = array[high];

           while(low<high&&array[low]<=tmp){
                low++;
           }
           array[high] = array[low];
       }
        array[low]=tmp;
       return low;

    }
    public static void swap(int[] array,int a,int b){
        int tmp=array[a];
        array[a]=array[b];
        array[b]=tmp;
    }
    //三数取中法
    public static void three_num_mid(int[] array,int left,int right) {
        //array[mid] <= array[left] <= array[high]
        int mid=(right+left)/2;
        if(array[mid]>array[left]){
            swap(array,mid ,left);
        }
        if(array[left]>array[right]){
            swap(array,left ,right);
        }
        if(array[mid]>array[right]){
            swap(array,mid ,right);
        }
    }
    public static void Insert_Sort(int[] array,int start,int end){
        for(int i=start+1;i<=end;i++){
            int tmp=array[i];
            int j=0;
            for( j=i-1;j>=start;j--){
                if(array[j]>tmp){
                    array[j+1]=array[j];
                }else{
                    break;
                }
            }
            array[j+1]=tmp;
        }

    }
    public static void quick(int[] array,int left,int right) {
        if(left >= right) {
            return;
        }
        //进行优化
//如果数组元素个数在某个范围之内，可以进行直接插入排序。
        if(right-left+1<=100){
            Insert_Sort(array,left,right) ;
            return;
        }
        //三数取中法：
        //用于优化已经有序的数组。
        three_num_mid(array,left,right) ;

        int par=partition(array,left,right);
        quick( array,left, par-1);
        quick( array,par+1, right);

    }
    public static void quickSort(int[] array) {
        quick(array,0,array.length-1);
    }
    //非递归实现直接排序
    public static void quickSort1(int[] array) {
        Stack<Integer> stack = new Stack<>();

        int left = 0;
        int right = array.length-1;
        int par = partition(array,left,right);

        if(par > left+1 ) {
            stack.push(left);
            stack.push(par-1);
        }
        if(par < right-1) {
            stack.push(par+1);
            stack.push(right);
        }

        while(!stack.empty() ){
            right=stack.pop();
            left=stack.pop();
            par = partition(array,left,right);

            if(par > left+1 ) {
                stack.push(left);
                stack.push(par-1);
            }
            if(par < right-1) {
                stack.push(par+1);
                stack.push(right);
            }
        }
    }
    /*
     *归并排序：
     *时间复杂度：O(n*logn) 快速排序仍然是最快的
     * 空间复杂度：O（n）
     * 稳定性：稳定的排序
     */
    public static void merge (int[]array,int low,int mid,int high){
        int s1=low;
        int s2=mid+1;
        int len=high-low+1;
        int[] ret=new int[len];
        int i=0;//用来表示ret数组的下标
        while(s1<=mid&&s2<=high){
            if(array[s1]<=array[s2]){
                ret[i++]=array[s1++];
            }else{
                ret[i++]=array[s2++];
            }

        }
        while(s1<=mid){
            ret[i++]=array[s1++];

        }
        while(s2<=high){
            ret[i++]=array[s2++];
        }
        //将临时数组中的元素拷贝到原来的数组当中。
        for(int j=0;j<ret.length;j++){
            array[j+low]=ret[j];
        }
    }
    public static void mergeSortInternal (int[]array,int low,int high){
        if(low>=high){//相遇了
            return;
        }
        int mid=(low+high)/2;//拿到中间位置
        //分解
        mergeSortInternal(array,low,mid);
        mergeSortInternal(array,mid+1,high);
        //合并
        merge(array,low,mid,high);


    }
    public static void mergeSort(int[]array){
        mergeSortInternal(array,0,array.length-1);
    }
    /*
    *归并排序  非递归实现
     */
    public static void mergeNor(int[]array,int gap){
        int [] ret=new int[array.length];
        int k=0;//ret的下标
        int s1=0;
        int e1=s1+gap-1;
        int s2=e1+1;
        int e2=s2+gap-1<array.length?s2+gap-1:array.length-1;
       //1.肯定有两个归并段
        while(s2<array.length){
            //2.对应的s1位置和s2位置进行比较
            while(s1<=e1&&s2<=e2){
                if(array[s1]<array[s2]){
                    ret[k++]=array[s1++];
                }else{
                    ret[k++]=array[s2++];
                }
            }
            //3.第二步在比较的过程当中，肯定有一个先走完
            //4.判断是谁没走完，把剩下的数据拷贝到结果数组当中
            while(s1<=e1){
                ret[k++]=array[s1++];
            }
            while(s2<=e2){
                ret[k++]=array[s2++];
            }
            //5.确定新的s1,e1,s2,e2
            s1=e2+1;//e2始终没动
            e1=s1+gap-1;
            s2=e1+1;
            e2=s2+gap-1<array.length?s2+gap-1:array.length-1;
        }

        //6.需要判断是否有另外的归并段
        while(s1<=array.length-1){
            ret[k++]=array[s1++];
        }
        //7.将ret数组中的内容拷贝到array数组当中
        for(int i=0;i<ret.length;i++){
            array[i]=ret[i];
        }
    }

    public static void mergeSort1(int[]array){
       for(int gap=1;gap<array.length;gap*=2){
           mergeNor(array,gap);
       }
    }
    public static void main(String[] args) {
        Queue<Integer> queue=new LinkedList<>() ;
        queue.poll() ;
        int[] array={10,5,8,4,1,9};
        InsertSort(array);
        System.out.println(Arrays.toString(array));
        int []array1={12,5,9,34,6,8,33,56,89,0,7,4,22,55,77};
        mergeSort(array1) ;
        System.out.println(Arrays.toString(array1));
    }
}
