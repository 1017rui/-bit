/**
 * @author 张瑞瑞
 * @date 2020/09/02 20:12
 */
import jdk.nashorn.internal.runtime.regexp.joni.constants.OPCode;

import java.util.*;

import static java.lang.Integer.MAX_VALUE;
import static java.lang.Integer.MIN_VALUE;

class KW{
    public int key;
    public int value;

    public KW(int key,int value){
        this.key=key;
        this.value=value;
    }
        public int getKey() {
            return key;
        }
        public int getValue() {
            return value;
        }
}
public class Solution {
    /**
     * lru design
     * @param operators int整型二维数组 the ops
     * @param k int整型 the k
     * @return int整型一维数组
     */

    public static int[] LRU (int[][] operators, int k) {
        // write code here
        HashMap<Integer,Integer> map=new HashMap<>();//哈希表
        Queue<KW> queue=new LinkedList<>();//队列
        ArrayList<Integer> arraylist=new ArrayList<>();//列表

        for(int i=0;i<operators.length;i++){
            if(operators[i][0]==1){
                //set
                if(queue.size()==k){
                    //队列已满 需要删除最不常用的
                    KW kwtmp1=queue.poll();
                    map.remove(kwtmp1.key,kwtmp1.value);
                }
                KW kw=new KW(operators[i][1],operators[i][2]);
                queue.offer(kw);//正常入队
                map.put(operators[i][1],operators[i][2]);
            }else if(operators[i][0]==2){
                //get
                int ret=(map.get(operators[i][1])==null)?-1:map.get(operators[i][1]);
                arraylist.add(ret);
                KW kwtmp2=queue.poll();
                queue.offer(kwtmp2);
            }
        }
        int[] arr=new int[arraylist.size()];
        int i=0;
        for(int n:arraylist){
            arr[i++]=n;
        }
        return arr;
    }

    public static void main(String[] args) {
       /* int[][] operators={{1,1,1},{1,2,2},{1,3,2},{2,1},{1,4,4},{2,2}};
        int k=3;
        int[] arr=LRU(operators,k);
        System.out.println(Arrays.toString(arr));*/
        System.out.println(reverse(1000000003));
    }
    public static int reverse(int x) {
        int res = 0;
        while (x!=0) {
            res = res*10 + x%10;
            x /= 10;
        }
        return (res > Integer.MAX_VALUE || res < Integer.MIN_VALUE) ? 0 :  res;
    }
}