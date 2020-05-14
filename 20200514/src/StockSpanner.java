import java.util.ArrayList;
import java.util.List;

/**
 * @author 张瑞瑞
 * @date 2020/05/14 21:53
 */
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
