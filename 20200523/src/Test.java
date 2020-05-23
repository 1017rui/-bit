import java.util.Arrays;
import java.util.PriorityQueue;

/**
 * @author 张瑞瑞
 * @date 2020/05/23 16:41
 * 优先级队列 底层是一个排序的二叉树（堆）
 */
public class Test {
    public static void main(String[] args) {
        TestHeap testHeap =new TestHeap();
        int[]array={27,15,19,18,28,34,65,49,25,37};
        testHeap.createHeap(array);
        testHeap.show();
        testHeap.push(88) ;
        testHeap.show();
        testHeap .pop() ;
        testHeap.show();
        System.out.println(testHeap.peek());
        testHeap .heapSort() ;
        testHeap .show() ;

    }
    public static void main1(String[] args) {
        PriorityQueue<Integer> priorityQueue=new PriorityQueue<>();//底层默认为小根堆
        priorityQueue .offer(12);
        priorityQueue .offer(23);
        priorityQueue .offer(56);
        priorityQueue .offer(18);
        priorityQueue .offer(20);
        priorityQueue .offer(25);
        System.out.println(priorityQueue );
        System.out.println(priorityQueue.poll());



    }
}
