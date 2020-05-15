import java.util.LinkedList;
import java.util.Queue;

/**
 * @author 张瑞瑞
 * @date 2020/05/15 22:34
 */
public class RecentCounter {

    Queue<Integer> q = new LinkedList();
    public RecentCounter() {

    }
    public int ping(int t) {
        q.add(t);
        while (q.peek() < t - 3000)
            q.poll();
        return q.size();
    }

    public static void main(String[] args) {
        RecentCounter recentCounter =new RecentCounter() ;
       int ret1=recentCounter.ping(1);
        System.out.println(ret1);
        int ret2=recentCounter.ping(100);
        System.out.println(ret2);
        int ret3=recentCounter.ping(3001);
        System.out.println(ret3);
        int ret4=recentCounter.ping(3002);
        System.out.println(ret4);


    }

}
