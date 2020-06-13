import java.sql.CallableStatement;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author 张瑞瑞
 * @date 2020/06/11 12:26
 */
public class Test {
    public static void main(String[] args) {
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(2,map.getOrDefault(2,1));

        Set<HashMap.Entry<Integer,Integer>> set=map.entrySet() ;
        for(HashMap.Entry<Integer,Integer> entry :set){
            System.out.println(entry .getKey() +":"+entry .getValue() );
        }
        System.out.println(100311%10);
        System.out.println(100311/10);
    }
    public static void main3(String[] args) {
        Thread t=new Thread() {
            public void run(){
                pong();
            }

        };
        t.run();
        System.out.println("ping");
    }
    static void pong(){
        System.out.println("pong");
    }
    public static void main2(String[] args) {
        HashMap map=new HashMap() ;
        map.put("name",null);
        map.put("name","jack");
        System.out.println(map.size());
    }
    public static void main1(String [] args){
        int count=new B().getValue();
        System.out.println(count);
    }
    static class A{
        protected int value;
        public A(int v) {
            setValue(v);
        }
        public void setValue(int value){
            this.value = value;
        }
        public int getValue(){
            try{
                value++;
                return value;
            } catch(Exception e){
                System.out.println(e.toString());
            } finally {
                this.setValue(value);
                System.out.println(value);
            }
            return value;
        }
    }
    static class B extends A{
        public B() {
            super(5);
            setValue(getValue() - 3);
        }
        public void setValue(int value){
            super.setValue(2 * value);
        }
    }
}
