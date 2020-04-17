import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

/**
 * @author 张瑞瑞
 * @date 2020/04/16 10:29
 */
public class TestDemo {
    public static void main(String[] args) {
        int[] array = {1,4,3,1,6,4};
        ////数组中的所有数进行异或结果放在ret
        int ret = 0;
        for (int i = 0; i < array.length; i++) {
            ret = ret ^ array[i];
        }
        //从右往左找ret第一个为1的位，放在tmp中
        int tmp = 0;
        for (int i = 0; i < 32; i++) {
            if (((ret >> i) & 1) == 1) {
                tmp = i;
                break;
            }
        }
        //根据tmp将数组分为两组，分别进行异或
        int tmp1 = 0;
        int tmp2 = 0;
        for (int i = 0; i < array.length; i++) {
            if (((array[i] >> tmp)&1) == 1) {
                tmp1 = tmp1 ^ array[i];
            } else if (((array[i] >> tmp)&1) == 0) {
                tmp2 = tmp2 ^ array[i];
            }
        }
        System.out.println(tmp1);//3
        System.out.println(tmp2);//6
    }

}
    /*public static void main4(String[] args) {
        //找出一个数组当中只出现一次的数字（位运算符）
        int[]arr={1,2,1,3,3,4,5,5,4};
        int ret=0;
        for(int i=0;i<arr.length;i++){
            ret=ret^arr[i];
        }
        System.out.println(ret);
    }
    public static void main3(String[] args) {
        int[][]array=new int[2][];
        array[0]=new int[]{1,2,3};
        array[1]=new int[]{4,5};
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array[i].length;j++){
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main2(String[] args) {
        //二维数组的打印方式
        int[][]array={{1,2,3},{4,5,6}};
        for(int[]tmp:array){
            for(int x:tmp){
                System.out.print(x+" ");
            }
            System.out.println();
        }
        *//*for(int i=0;i<array.length;i++){
            for(int j=0;j<array[i].length;j++){
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }*//*
        //System.out.println( Arrays.toString(array));
        //System.out.println(Arrays.deepToString(array));
    }
    public static void main1(String[] args) {
        //二维数组定义
        int[][]array={{1,2,3},{4,5,6}};
        int[][]array2=new int[][]{{1,2,3},{4,5,6}};
        int[][]array3=new int[2][3];
    }
}*/
//给定一个整型数组, 实现冒泡排序(升序排序)*
/*public class TestDemo {
    public static void bubbleSort(int[]array){
        for(int i=0;i<array.length-1;i++){
            boolean flag=true;
            for(int j=0;j<array.length-1-i;j++){
                if(array[j]>array[j+1]){
                    int tmp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=tmp;
                     flag =false;
                }
            }
            if(flag==true){
                break;
            }
        }
    }
    public static void main(String[] args) {
        int[]array={23,45,32,16,78,54,11};
        bubbleSort(array);
        System.out.println(Arrays.toString(array));
    }
}*/
//给定一个整型数组, 判定数组是否有序（递增）
/*public class TestDemo{
    public static boolean judgeArrayOrder(int[]array){
        for(int i=0;i<array.length-1;i++){
            if(array[i]>array[i+1]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int []array1={1,2,3,4,5,6,7,8,9,10};
        int []array2={10,8,6,4,2,1,3,5,7,9};
        System.out.println(judgeArrayOrder(array1));
        System.out.println(judgeArrayOrder(array2));

    }
}*/
//给定一个有序整型数组, 实现二分查找
/*public class TestDemo{
    public static int binarySearch(int[]array,int k){
        int left=0;
        int right=array.length-1;
        while(left<=right){
            int mid=(left+right)>>1;
            if(array[mid]<k){
                left=mid+1;
            }else if(array[mid]>k){
                right=mid-1;
            }else{
                return mid;//找到了，返回下标
            }
        }
        return -1;//找不到
    }
    public static void main(String[] args) {
        int []array={12,23,34,45,56,67,78};
        int k=34;
        System.out.println("下标为："+binarySearch(array, k));
    }
}*/
//实现一个方法 copyOf, 对一个整型数组进行拷贝, 得到一个新的数组.
/*public class TestDemo{
    public static int[]copyOf(int[]array){
        int[]ret=new int[array.length];
        for(int i=0;i<array.length;i++){
            ret[i]=array[i];
        }
        return ret;
    }
    public static void main(String[] args) {
        int[]array={11,22,33,44,55,66};
        int[]ret=copyOf(array);
        System.out.println(Arrays.toString(ret));
    }
}*/
//实现一个方法 toString, 把一个整型数组转换成字符串.
// 例如数组 {1, 2, 3} , 返回的字符串为 "[1, 2, 3]", 注意 逗号 的位置和数量
/*
public class TestDemo{
    public static String toString(int[]array){
        String ret="[";
        for(int i=0;i<array.length;i++){
            ret+=array[i];
            if(i!=array.length-1){
                ret+=", ";
            }
        }
        ret+="]";
        return ret;
    }
    public static void main(String[] args) {
        int[]array={1,2,3};
        System.out.println(toString(array));
    }
}*/
