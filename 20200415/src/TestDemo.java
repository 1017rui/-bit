import java.util.Arrays;

/**
 * @author 张瑞瑞
 * @date 2020/04/15 16:14
 */
public class TestDemo {
    //Arrays包装类中的方法
    public static void main(String[] args) {
        int[]arr={12,21,11,34,43,42,16,65,54};
        Arrays.sort(arr);//升序
        System.out.println(Arrays.toString(arr));
      /* int[]array1=new int[10];
       int[]array2=new int[10];
       Arrays.fill(array1,8);
       Arrays.fill(array2,2,5,8);
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));*/
        //int [] arr={1,2,3,4,5,6,7,8,9};
        //int[]arr1={1,2,3,4,5,6,7,8,9};
       // System.out.println(Arrays.equals(arr,arr1));
        //int[]ret=Arrays.copyOfRange(arr,2,5);
        //System.out.println(Arrays.toString(ret));
        /*System.out.println(Arrays.binarySearch(arr,2,5,4));//3
        System.out.println(Arrays.binarySearch(arr,2,5,3));//2
        System.out.println(Arrays.binarySearch(arr,2,5,6));//-6 没找到
        //注意：[fromIndex,toIndex) 左闭右开*/
    }
    //给定一个整型数组, 将所有的偶数放在前半部分, 将所有的奇数放在数组后半部分
    public static void transform(int[] array){
        int left=0;
        int right=array.length-1;
        while(left<right){
            //在左边找一个奇数
            while(left<right&&array[left]%2==0){
                left++;
            }
            //跳出这个循环时找到了一个奇数
            //在右边找一个偶数
            while(left<right&&array[right]%2!=0){
                right--;
            }
            //跳出循环时找到了一个偶数
            //将左边找到的奇数和右边找到的偶数进行交换（保证题目要求，前面放偶数，后面放奇数）
            if(left<right){
                int tmp=array[left];
                array[left]=array[right];
                array[right]=tmp;
            }
        }
    }
    public static void main12(String[] args) {
        int [] array={1,2,3,4,5,6,7,8,9,10};
        transform(array);
        System.out.println(Arrays.toString(array));
    }
  //数组逆序
    public static void reverse(int[]array){
        int left=0;
        int right=array.length-1;
        while(left<right){
            int tmp=array[left];
            array[left]=array[right];
            array[right]=tmp;
            left++;
            right--;
        }
    }
    public static void main11(String[] args) {
        int[]array={1,2,3,4,5,6,7,8,9};
        reverse(array);
        System.out.println(Arrays.toString(array));
    }
    //冒泡排序
    public static void bubbleSort(int [] array){
        boolean flag=true;
        for(int i=0;i<array.length-1;i++){
            for(int j=0;j<array.length-1-i;j++){
                if(array[j]>array[j+1]){
                    int ret=array[j];
                    array[j]=array[j+1];
                    array[j+1]=ret;
                    flag=false;
                }
            }
            //每一堂完成之后 都去看看 是否有序
            //某一趟结束没有交换 说明已经有序
            if(flag==true){
                break;
            }
        }
    }
    public static void main10(String[] args) {
        int[]array={12,43,32,34,45,41};
        int[]array1={1,2,3,4,5};
        bubbleSort(array1);
        System.out.println(Arrays.toString(array1));
    }
    //给定一个整型数组, 判断是否该数组是有序的(升序)
    public static boolean isUp(int []array){
        for(int i=0;i<array.length-1;i++){
            if(array[i]>array[i+1]){
                return false;
            }
        }
        return true;
    }
    public static void main9(String[] args) {
        int[]array={1,2,3,10,4,5};
        int[]array1={1,2,3,4,5};
        System.out.println(isUp(array));
        System.out.println(isUp(array1));
    }
    static int count=0;
public static int binarySearch(int []array,int k){
    int left=0;
    int right=array.length-1;
    while(left<=right){
        count++;
      //  int mid=(left+right)/2;
        int mid=(left+right)>>1;//右移一位相当于除以2
        if(array[mid]<k){
            left=mid+1;
        }else if(array[mid]>k){
            right=mid-1;
        }else{
            return mid;//找到，返回下标
        }
    }
    return -1;//找不到
}
    public static void main8(String[] args) {
        int[] array={11,12,23,34,44,54};
        int[]array1=new int[100000];
        for(int i=0;i<array1.length;i++){
            array1[i]=i;
        }
        int k=45;
        //int ret=binarySearch(array,k);
        //int ret1=binarySearch(array1,99999);
        int ret2=Arrays.binarySearch(array,44);
        System.out.println("下标为："+ret2+"找的次数为："+count);
    }
    public static int max(int[]array){
        int max=array[0];
        for(int i=0;i<array.length;i++){
            if(array[i]>max){
                max=array[i];
            }
        }
        return max;
    }
    //找数组的最大值
    public static void main7(String[] args) {
        int[]array={11,2,34,43,23,45};
        int ret=max(array);
        System.out.println(ret);
    }
    //数组的拷贝有四种方式
    //for循环
    //Arrays.copyOf()
    //System.arraycopy()  速度最快
    //array.clone(),产生了这个对象的一个副本
    //这个方法是object的克隆方法  object是所有类的父类 祖先
    //从本质上来说，都是浅拷贝
    public static int[] copyArray(int [] array){
        int[]ret=new int[array.length];
        for(int i=0;i<array.length;i++){
            ret[i]=array[i];
        }
        return ret;
    }
    public static void main6(String[] args) {
        int[]array={1,2,3,4,5,6,7};
       // int[]ret=new int[array.length];
        int []ret=array.clone();
        System.out.println(Arrays.toString(ret));
       // System.arraycopy(array,0,ret,0,array.length);
        //System.out.println(Arrays.toString(ret));
        //int[] ret=copyArray(array);
//        int []ret1=Arrays.copyOf(array,array.length);
//        System.out.println(Arrays.toString(ret1));

    }
    public static int findElement(int [] array,int k){//顺序查找
        for(int i=0;i<array.length;i++){
            if(array[i]==k){
                return i;
            }
        }
        return -1;//代表没有这个元素，因为数组是没有-1下标的
    }
    public static void main5(String[] args) {
        //给定一个数组，在给定一个元素，找出该元素在数组中的位置
        int []array={1,2,3,4,5,6,7,8,9,10};
        int k=11;
        int ret=findElement(array,k);
        System.out.println("元素为"+k+"的下标为："+ret);
    }
    public static double avg(int[]arr){
        int sum=0;
        for(int x:arr){
            sum+=x;
        }
        return ((double)sum/arr.length);
    }
public static int[] copy(int []arr){
    int[]ret=new int[arr.length];
    for(int i=0;i<arr.length;i++){
        ret[i]=arr[i];
    }
    return ret;
}
    public static void main4(String[] args) {
        int[]arr={1,2,3,4,5,6};
        System.out.println(avg(arr));
        /*int[]newArr=Arrays.copyOf(arr,arr.length);
        int[]ret=copy(arr);
        //System.out.println("newArr:" + Arrays.toString(newArr));
        System.out.println("ret:" + Arrays.toString(ret));
        arr[0]=10;
        //修改原数组不会影响到新数组
        System.out.println("arr:" + Arrays.toString(arr));
        //System.out.println("newArr:" + Arrays.toString(newArr));
        System.out.println("ret:" + Arrays.toString(ret));*/
    }
    public static int[] transform1(int[]arr){
        int[]ret=new int[arr.length];//创建一个新的数组接受*2后的数组的元素
        for(int i=0;i<arr.length;i++){
            ret[i]=2*arr[i];
        }
        return ret;
    }
//    public static void transform(int []arr){
//        //在原本的数组上进行修改
//        for(int i=0;i<arr.length;i++){
//            arr[i]=2*arr[i];
//        }
//    }
    //模拟实现toString方法
    public static String toString(int []arr){
        String ret="[";
        for(int i=0;i<arr.length;i++){
            ret+=arr[i];
            if(i!=arr.length-1){
                ret+=", ";
            }
        }
        ret+="]";
        return ret;

    }
    public static void main3(String[] args) {
        int[]arr={1,2,3};
        //int[]ret=transform1(arr);
        //transform(arr);
       // printArray(arr);
        //printArray(ret);
        int[]array={1,2,3,4,5,6};
        String ret=toString(array);
        String newArr= Arrays.toString(array);
        System.out.println(ret);
        System.out.println(newArr);
    }
    public static void func1(int x){//修改形参x的值，不影响实参的num 的值
        x=10;
        System.out.println("x=" + x);
    }
    public static void func(int[]a){//引用传参
        a[0]=10;
        System.out.println("a[0]="+a[0]);
    }
    public static void main2(String[] args) {
       /*int num=0;
        func(num);
        System.out.println("num=" + num);*/
       int[] arr={1,2,3};
       func(arr);
        System.out.println("arr[0]"+arr[0]);
    }
    public static void printArray(int[]arr){
        for(int x:arr){//foreach循环
            System.out.print(x);
        }
        System.out.println();
    }
    public static void main1(String[] args) {
        int [] arr={1,2,3};
        printArray(arr);
        for(int x:arr){//foreach循环
            System.out.println(x+" ");
        }
    }
}
