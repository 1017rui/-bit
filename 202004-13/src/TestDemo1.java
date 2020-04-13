import java.util.Arrays;

/**
 * @author 张瑞瑞
 * @date 2020/04/13 19:40
 */
public class TestDemo1 {
   /* public static String myToString2(int[]array){
        String ret="[";
        for (int i = 0; i < array.length; i++) {
            ret+=array[i];
            if(i!=array.length-1){
                ret+=",";
            }
        }
        ret+="]";
        return ret;
    }*/
    public static String myToString(int[]array){
        String tmp="[";
        for(int i=0;i<array.length;i++){
            tmp+=array[i];
            if(i!=array.length-1) {
                tmp += ",";
            }
        }
        tmp+="]";
        return tmp;
    }
    public static void myToString1(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
    }


    public static void main(String[] args) {
        int[]array={12,23,12,45,63,20};
        myToString(array);
        //Arrays.sort(array);//排序
       // System.out.println(Arrays.toString(array));
        System.out.println(myToString(array));
    }
    public static int[] func(int []array){
        int[]tmp=new int[array.length];
        for(int i=0;i<array.length;i++){
            tmp[i]=array[i]*2;
        }
        return tmp;
    }
    public static void main6(String[] args) {
        int[]array={1,2,3,4,5,6,7};
        int[]ret=  func(array);
        System.out.println(Arrays.toString(ret));
        //Arrays 操作数组的工具类。
    }
    public static void main5(String[] args) {
        int a=0;
        System.out.println(a);
        int [] array=null;//array引用的是一个空对象
        System.out.println(array);
    }
    public static void main4(String[] args) {
        int[] array={1,2,3,4,5,6,7,8,9,10};
        System.out.println(Arrays.toString(array));
    }
    public static void printArray(int[]arr){
        for(int x:arr){
            System.out.print(x+" ");
        }
    }
    public static void swap(int [] array){
        int tmp=array[0];
        array[0]=array[1];
        array[1]=tmp;
    }
    public static void main3(String[] args) {
        //数组进行参数传递
//        int[] array = {1, 2, 3, 4};
//        printArray(array);
        int []array2={10,20};
        swap(array2);
        printArray(array2);

    }
    public static void main2(String[] args) {
        int[] array = {1, 2, 3, 4};
        System.out.println(array[0]);
//        int len=array.length;
//        System.out.println(len);
      /*  for(int i=0;i<array.length;i++) {
            System.out.print(array[i]+" ");
        }
        for(int val:array){//单纯遍历
            System.out.print(val+" ");
        }
    }*/
    }
    //数组
    public static void main1(String[] args) {
       // int a=10;
        //int b=20;
       /* int [] array={1,2,3,4,5,6,7,8,9,10};//在java当中数组在堆中
        int [] array2=new int[]{11,22,33,44};
        int [] array3=new int[4];//不初始化默认数组中存放的是0
        array3[0]=1;
        array[1]=2;
        System.out.println(array);*/
    }
}
