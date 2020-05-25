import java.util.Objects;

/**
 * @author 张瑞瑞
 * @date 2020/05/25 19:59
 */
class Card {
    public int rank; // 数值
    public String suit; // 花色
    public Card(int rank, String suit) {
        this.rank = rank;
        this.suit = suit;
    }

   /* @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Card card = (Card) o;
        return rank == card.rank &&
                Objects.equals(suit, card.suit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rank, suit);
    }*/
 @Override
    public boolean equals(Object obj) {
        if(this==obj){
            return true;
        }
        if(obj==null||!(obj instanceof Card)){
            return false;
        }
        Card tmp=(Card) obj;
        if(this.rank==tmp.rank&&this.suit.equals(tmp.suit ) ){
            //数值和花色都相同
            return true;
        }
        return false ;
       // return super.equals(obj);
    }
}
public class TestDemo {
    public static void main(String[] args) {
        Card card1=new Card(5,"♥") ;
        Card card2=new Card(5,"♥") ;
        System.out.println(card1 ==card2 );//比较的是对象的地址
        System.out.println(card1.equals(card2 ) );//不重写的时候比较的是地址。只有在类中重写了equals方法才能比较两个对象是否相同

    }
}
