import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * @author 张瑞瑞
 * @date 2020/05/25 22:43
 */
//比较器
class MyComparator implements Comparator <Integer>{

    @Override
    public int compare(Integer o1, Integer o2) {
        return o2-o1;
    }
}
public class TopK {
    public static Integer[] topK(int[]array,int k){
        MyComparator myComparator =new MyComparator() ;
       // PriorityQueue <Integer> maxHeap=new PriorityQueue<>(myComparator ) ;

        PriorityQueue <Integer> maxHeap=new PriorityQueue<>(new Comparator<Integer>() {
           //匿名内部类
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        }) ;

        for(int i=0;i<array.length ;i++){
            if(maxHeap .size()<k){
                //在堆中放大小为k的
                maxHeap .offer(array[i]);
            }else{
                Integer val=maxHeap .peek();//拿到堆顶元素
                if(val!=null&&val>array[i]){
                    maxHeap .poll();
                    maxHeap .offer(array[i]) ;
                }
            }
        }
        Integer[] ret=new Integer[k];
        for(int i=0;i<k;i++){
            ret[i]=maxHeap .poll();
        }
        return ret;
    }
    public static void main(String[] args) {
        int[]array={12,1,5,9,2,4};
        Integer[] ret=topK(array,4);
        System.out.println(Arrays.toString(ret));
    }
}
