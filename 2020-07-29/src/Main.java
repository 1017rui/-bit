/**
 * @author 张瑞瑞
 * @date 2020/07/29 9:30
 */
//编程题再练习
/*
import java.util.Scanner;
public class Main {
    //判断一个字符串是否为回文字符串
    public static boolean isPalindrome(String str){
        return new StringBuffer(str).reverse().toString().equals(str);
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        while(scan.hasNext()){
            String A=scan.next();
            String B=scan.next();
            //将B插入A产生一个新的字符串  判断是否为回文串
            StringBuffer sb=new StringBuffer();
            int count=0;
            for(int i=0;i<=A.length();i++){
                sb.append(A);
                sb.insert(i,B);
                if(isPalindrome(sb.toString())){
                    count++;
                }
                sb=new StringBuffer();
            }
            System.out.println(count);
        }
    }
}
*/
//排序算法
import java.util.Arrays;
import java.util.Stack;

public class Main {
    /*
    直接插入排序：
    时间复杂度：最坏情况：O（n^2）最好情况：O（n）
    越有序越快
    空间复杂度：O（1）
    稳定性：稳定的排序
     */
    public static void insertSort(int[] arr) {
        int tmp = 0;
        for (int i = 1; i < arr.length; i++) {
            tmp = arr[i];
            int j = 0;
            for (j = i - 1; j >= 0; j--) {
                if (arr[j] > tmp) {
                    arr[j + 1] = arr[j];
                } else {
                    break;
                }
            }
            arr[j + 1] = tmp;
        }
    }

    /*
    选择排序：
    时间复杂度：O（n^2）无论情况好坏
    空间复杂度：O（1）
    稳定性：不稳定的排序
     */
    //每趟选出一个最小的元素放在最前面  每次确定一个位置的元素
    public static void selectSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    //交换
                    int tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
    }
    /*
    堆排序：
    时间复杂度：O（n*logn）无论有序无序都是
    空间复杂度：O（1）
    稳定性：不稳定的排序
     */
    //排升序建大堆，排降序建小堆

    //向下调整
    public static void adjustDown(int[] arr, int root, int len) {
        int parent = root;//父亲结点
        int child = 2 * parent + 1;//左孩子
        while (child < len) {
            //判断是否有右孩子
            if (child + 1 < len && arr[child] < arr[child + 1]) {
                //始终保持child下标存放的值是最大的孩子
                child++;
            }
            if (arr[child] > arr[parent]) {
                //交换
                int tmp = arr[child];
                arr[child] = arr[parent];
                arr[parent] = tmp;
                parent=child;
                child=2*parent+1;
            } else {
                break;
            }
        }
    }
    //创建一个堆（这里建大堆）
    public static void createHeap(int[] arr){
        //根节点为n
        // 父亲节点为（n-1）/2
        for(int i=(arr.length-1-1)/2;i>=0;i--){
            //进行调整
            adjustDown(arr,i,arr.length);
        }
    }
    //进行堆排
    public static void heapSort(int[] arr){
        createHeap(arr);
        int end=arr.length-1;
        while(end>0){
            int tmp=arr[0];
            arr[0]=arr[end];
            arr[end]=tmp;
            adjustDown(arr,0,end);
            end--;
        }
    }

    /*
    冒泡排序：
    时间复杂度：O（n^2）无论情况好坏  但是经过优化可以达到O（n）
    空间复杂度：O（1）
    稳定性：稳定的排序
     */
    //n个元素进行n-1趟排序，每次排序确定一个位置
    //每次找到一个最大的元素放在最后面
    public static void bubbleSort(int[] arr){
        for(int i=0;i<arr.length-1;i++){//控制趟数
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int tmp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=tmp;
                }
            }
        }
    }
    /*
    快速排序：时间复杂度比堆排序快，但空间复杂度略高
    时间复杂度：最好情况：（O(n*logn) ） 最坏情况: 升序或逆序 O（n^2）
    空间复杂度：最好情况: O(logn) 最坏情况: O（n）
    稳定性：不稳定的排序
     */
    //原理：将两个待排序序列化成两部分
    //递归法实现：
    private static int partition(int[] arr, int left, int right) {
        int tmp=arr[left];
        while(left<right){
            while(left<right&&arr[right]>=tmp){
                right--;
            }
            arr[left]=arr[right];

            while(left<right&&arr[left]<=tmp){
                left++;
            }
            arr[right]=arr[left];
        }
        arr[left]=tmp;//这个位置的元素已经固定了
        return left;
    }
    public static void quick(int[] arr,int left,int right){
        if(left>=right){
            return;
        }
        //找基准
        int par=partition(arr,left,right);
        quick(arr,left,par-1);
        quick(arr,par+1,right);
    }
    public static void quickSort(int[] arr){
        quick(arr,0,arr.length-1);
    }
    //非递归实现：看不懂
    public static void quickSort1(int[] array) {
        //用于存放数组的下标
        Stack<Integer> stack = new Stack<>();

        int left = 0;
        int right = array.length-1;
        int par = partition(array,left,right);


        if(par > left+1 ) {//说明左边有两个数据以上
            //将左边的数对放进去
            stack.push(left);
            stack.push(par-1);
        }
        if(par < right-1) {//说明右边有两个数据以上
            //将右边的书堆放进去
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
        //排完了
    }
    public static void main(String[] args) {
        int[] arr={12,34,5,17,21,87,49,3,8};
        //insertSort(arr);
        //selectSort(arr);
        //heapSort(arr);
        //bubbleSort(arr);
        quickSort1(arr);
        System.out.println(Arrays.toString(arr));

    }
}