import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @author 张瑞瑞
 * @date 2020/05/16 12:50
 * 扑克牌
 * 买牌
 * 洗牌
 * 发牌
 */
class Card{
    public int rank;//；牌面值
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
       //return rank+"=>"+suit;
       return String.format("[%s,%d]",suit,rank) ;
    }
}
public class CardDemo {
    public static final String[] SUITS={"♥","♠","♦","♣"};
    //1.买牌 52
    public static List<Card> buyDeck(){
        List<Card> deck=new ArrayList<>();
        for(int i=0;i<4;i++){//控制花色
            for(int j=1;j<=13;j++){//控制牌面
                Card card=new Card(j,SUITS[i]);//构造一张牌
                deck.add(card);
            }
        }
        return deck;
    }
    private static void swap(List<Card> deck, int index,int i){
        Card tmp=deck.get(index);
        deck.set(index,deck.get(i) );
        deck.set(i,tmp);
    }
    //2.洗牌
    public static void shuffle(List<Card> deck){
        for(int i=deck.size()-1;i>0;i--){
            Random random=new Random();
            int index=random .nextInt(i);//在[0,i)之间随机生成一个数字
            swap(deck,index,i);//将下标为index,i对应的牌进行交换
        }
    }

    public static void main(String[] args) {
        System.out.println("买牌：");
        List<Card> deck=buyDeck() ;
        System.out.println(deck);
        System.out.println("洗牌：");
        shuffle(deck);
        System.out.println(deck);
        //三个人每人揭牌五张  轮流
        List<List<Card>> hand=new ArrayList<>();//类似二维数组

        List<Card> hands1=new ArrayList<>() ;
        List<Card> hands2=new ArrayList<>() ;
        List<Card> hands3=new ArrayList<>() ;
        hand.add(hands1);
        hand.add(hands2);
        hand.add(hands3);
        for(int i=0;i<5;i++){
            for(int j=0;j<3;j++){
                Card card=deck.remove(0); //每次揭牌之后，这张牌就会被删除，就会有新的0号下标
                hand.get(j).add(card);

            }
        }
        System.out.println("揭牌：");
        System.out.println("1.============");
        System.out.println(hands1);
        System.out.println("2.============");
        System.out.println(hands2);
        System.out.println("3.============");
        System.out.println(hands3);
        System.out.println("剩余的牌：");
        System.out.println(deck);
    }
}
