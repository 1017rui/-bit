import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @author 张瑞瑞
 * @date 2020/05/12 15:05
 * 扑克牌练习让
 */
class Card{
    public int rank;//牌面值
    public String suit;//花色

    public Card(int rank, String suit) {
        this.rank = rank;
        this.suit = suit;
    }

    @Override
    public String toString() {
       /* return "Card{" +
                "rank=" + rank +
                ", suit='" + suit + '\'' +
                '}';*/
       return String.format("[%s %d]",suit,rank) ;
    }
}
public class CardDemo {
    public static final String[] SUITS={"♥","♠","♦","♣"};
    //1.买牌 52
    public static List<Card>  buyDeck(){
        List<Card> deck=new ArrayList<>();
        for(int i=0;i<4;i++){
            for(int j=1;j<=13;j++){
                /*int rank=i;//牌面值为i  1-13
                String suit=SUITS[j];//花色为SUITS数组的某一个*/
                Card card=new Card(j,SUITS[i]);
                deck.add(card);
            }
        }
        return deck;
    }
    private static void swap(List<Card> deck,int index,int i){
        Card tmp=deck.get(index);//获得下标index对应的元素。
        deck.set(index,deck.get(i));//将下标为index位置的元素设置为i下标对应的元素
        deck.set(i,tmp);
    }
    //2.洗牌
    public static void shuffle(List<Card> deck){
        for(int i=deck.size()-1;i>0;i--){
            Random random=new Random();
            int index=random .nextInt(i) ;//在[0,i)中随机拿到一个下标
            swap(deck,index,i);
        }
    }

    public static void main(String[] args) {
        List<Card> deck=buyDeck() ;
        System.out.println(deck);
        System.out.println("洗牌");
        shuffle(deck);
        System.out.println(deck);
        //3.揭牌  三个人每人揭牌五张(轮流揭牌)
        List<List <Card>> hand=new ArrayList<>() ;

        List<Card> hands1=new ArrayList<>() ;
        List<Card> hands2=new ArrayList<>() ;
        List<Card> hands3=new ArrayList<>() ;

        hand.add(hands1);
        hand.add(hands2);
        hand.add(hands3);
        for(int i=0;i<5;i++){
            for(int j=0;j<3;j++){
                Card card=deck.remove(0) ;
                List<Card> list=hand.get(j);
                list.add(card);
            }
        }
        System.out.println("第一个人的牌：");
        System.out.println(hands1);
        System.out.println("第二个人的牌：");
        System.out.println(hands2);
        System.out.println("第三个人的牌：");
        System.out.println(hands3);
        System.out.println("剩余的的牌：");
        System.out.println(deck);
    }



}
