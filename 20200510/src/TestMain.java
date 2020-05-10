import java.util.*;

/**
 * @author 张瑞瑞
 * @date 2020/05/10 11:12
 */
public class TestMain {
    public static void main(String[] args) {
        Integer a=100;
        Integer b=100;
        System.out.println(a==b);
    }
    //Map接口
    public static void main2(String[] args) {
        Map <String ,String> map=new Hashtable<>() ;
        map.put("女神","迪丽热巴");
        map.put("辣女神","安崎");
        map.put("男神","小鬼王琳凯");
        System.out.println(map);
        String value=map.get("男神");
        System.out.println(value);
        String value1=map.getOrDefault("女神经","瓜皮") ;//找不到置为默认值
        System.out.println(value1);
        System.out.println(map.containsKey("女神") );
        System.out.println(map.containsValue("安崎") );
        System.out.println(map.containsValue("女神") );
        Set<Map.Entry <String,String>>  set= map.entrySet() ;
        for(Map.Entry <String,String> entry:set){
            System.out.println( entry .getKey() +"=>"+ entry .getValue());
        }
    }
    //Collection接口
    public static void main1(String[]args){
        Collection<String> collection =new ArrayList<>() ;//<>泛型
        collection .add("i");//在集合中放入元素
        collection .add("love");
        collection .add("you");
        System.out.println(collection );
        System.out.println(collection .isEmpty() );//判断集合是否为空
        System.out.println(collection .size() );//计算集合元素的长度
        Object [] array=collection .toArray() ;//返回一个装有所有集合的元素数组数组
        System.out.println(Arrays.toString(array));
        /*collection .remove("i");//删除集合中的元素
        System.out.println(collection );
        System.out.println(collection .size() );*/

/*
        collection .clear();//将集合置空
        System.out.println(collection);
        System.out.println(collection .isEmpty() );*/
    }
}
