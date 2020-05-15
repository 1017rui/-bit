import java.util.*;

/**
 * @author 张瑞瑞
 * @date 2020/05/14 21:53
 */
/*
class gupiao{
    int price;
    int count;

    public gupiao(int price, int count) {
        this.price = price;
        this.count = count;
    }

    @Override
    public String toString() {
        return "gupiao{" +
                "price=" + price +
                ", count=" + count +
                '}';
    }
}
public class StockSpanner {
    List<gupiao> list;
    public StockSpanner() {
    list=new ArrayList<>();
    }
    public int next(int price) {
        int count=1;
        for(int i=list.size()-1;i>=0;i--){
            if(price>=list.get(i).price){
                count+=list .get(i).count;
                i=i-(list.get(i).count-1);
            }
        }
        list .add(new gupiao(price, count) );
        return count;
    }

    @Override
    public String toString() {
        return "StockSpanner{" +
                "list=" + list +
                '}';
    }

    public static void main(String[] args) {
        StockSpanner sc=new StockSpanner() ;
        sc.next(100);
        sc.next(80);
        sc.next(60);
        sc.next(70);
        sc.next(60);
        sc.next(75);
        sc.next(85);
        System.out.println(sc);


    }
}
*/
public class StockSpanner{
    public  StockSpanner(){

    }
    Stack<Integer> stack=new Stack<>();
    Map<Integer,Integer> map=new HashMap<>() ;//存放股票的价格和股票跨度的键值对
    public int next(int price){
        int count=1;
        int tmp=0;
        while(!stack .empty() &&stack .peek()<=price){
          tmp=map.get(stack .peek());
          count+=tmp;
          stack.pop();
        }
        stack.push(price) ;
        map.put(price,count);
        return count;

    }

}