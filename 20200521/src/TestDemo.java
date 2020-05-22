import java.util.*;

/**
 * @author 张瑞瑞
 * @date 2020/05/21 18:25
 * 模拟实现一个堆。
 */
public class TestDemo {
    //有一堆石头，每块石头的重量都是正整数。
    //每一回合，从中选出两块 最重的 石头，然后将它们一起粉碎。假设石头的重量分别为 x 和 y，且 x <= y。那么粉碎的可能结果如下：
    //如果 x == y，那么两块石头都会被完全粉碎；
    //如果 x != y，那么重量为 x 的石头将会完全粉碎，而重量为 y 的石头新重量为 y-x。
    //最后，最多只会剩下一块石头。返回此石头的重量。如果没有石头剩下，就返回 0
    //输入：[2,7,4,1,8,1]
    //输出：1
    //先选出 7 和 8，得到 1，所以数组转换为 [2,4,1,1,1]，
    //再选出 2 和 4，得到 2，所以数组转换为 [2,1,1,1]，
    //接着是 2 和 1，得到 1，所以数组转换为 [1,1,1]，
    //最后选出 1 和 1，得到 0，最终数组转换为 [1]，这就是最后剩下那块石头的重量。
    public int lastStoneWeight(int[] stones) {
        //大根堆
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });
        for(int i=0;i<stones .length;i++){//将数组元素放入堆中
            priorityQueue .add(stones [i]);
        }
       while(priorityQueue .size()>1 ){
           int x=priorityQueue .poll() ;
           int y=priorityQueue .poll() ;
           if(x!=y){
               priorityQueue .add(Math.abs(x-y));
           }
       }
       if(!priorityQueue .isEmpty() ){
           return priorityQueue .peek() ;
       }
       return 0;
    }
    //给定两个以升序排列的整形数组 nums1 和 nums2, 以及一个整数 k。
//定义一对值 (u,v)，其中第一个元素来自 nums1，第二个元素来自 nums2。
//找到和最小的 k 对数字 (u1,v1), (u2,v2) ... (uk,vk)。
    public static List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        List<List<Integer>>ret=new ArrayList<>();
        if(nums1 .length ==0||nums2.length==0||k==0){
            return ret;
        }
        //创建小根堆
        PriorityQueue<List<Integer>> priorityQueue = new PriorityQueue<>(new Comparator<List<Integer>>() {
            @Override
            public int compare(List<Integer> o1, List<Integer> o2) {
                return (o1.get(0)+o1.get(1)) - (o2.get(0)+o2.get(1));
            }
        });
        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++){
                List<Integer> list=new ArrayList<>() ;
                list.add(nums1[i]);
                list.add(nums2[j]);
                priorityQueue .add(list);
            }
        }
        while(k!=0&&priorityQueue.size()!=0){
            List<Integer> list=priorityQueue .poll() ;
            ret.add(list);
            k--;
        }
        return ret;
    }


    public static void main(String[] args) {
        int[] nums1={1,7,11};
        int[] nums2={2,4,6};
        int k=3;
        List<List<Integer>> ret=kSmallestPairs(nums1,nums2,k);
        System.out.println(ret);

    }
    public static void main1(String[] args) {
       PriorityQueue <Integer> priorityQueue =new PriorityQueue<>() ;//底层是一个堆。
        TestHeap testHeap =new TestHeap() ;
        int[]array={27,15,19,18,28,34,65,49,25,37};
        testHeap.createHeap(array);
        testHeap.show();

        testHeap .push(80) ;
        testHeap.show();
        testHeap.pop();
        testHeap.show();
        System.out.println("从大到小排序：");
        testHeap.heapSort() ;
        testHeap .show() ;
    }
}
