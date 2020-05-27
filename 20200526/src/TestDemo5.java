import java.util.*;

/**
 * @author 张瑞瑞
 * @date 2020/05/26 19:57
 */
public class TestDemo5 {
    /*
    *3.将十万个数据，统计重复的数字且统计出现了多少次
     */
    public int singleNumber(int[] nums) {
        HashSet <Integer> set=new HashSet<>() ;
        for(Integer val:set){
            if(!set.contains(val) ){
                set.add(val);
            }else{
                set.remove(val) ;
            }
        }
        return set.iterator().next() ;//打印set中的元素
    }
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < 10_0000; i++) {
            list.add(random.nextInt(6000));
        }
        HashMap <Integer,Integer> map=new HashMap<>() ;
        //key 关键字重复的数字
        //value 重复的数字出现的个数
        for(Integer key:list){
            if(map.get(key)==null){
                map.put(key,1);

            }else{
                Integer val=map.get(key);
                map.put(key,val+1);
            }
        }
        for(Map.Entry <Integer,Integer> entry :map.entrySet() ){
            System.out.println(entry .getKey() +" 这个数组出现了"+entry .getValue() +" 次！");
        }
    }
    /*
    *2.大数据的去重元素
     */
    public static void main4(String[] args) {
        Random random = new Random();
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < 10_0000; i++) {
            list.add(random.nextInt(6000));
        }
        HashSet <Integer> set=new HashSet<>() ;
        for(Integer val:list){
            //set特性 不存放重复的元素
            set.add(val);
        }

    }
    /**
     * 1、找出10W个数据当中，第一个重复的元素。
     * @param args
     */
    public static void main3(String[] args) {
        Random random = new Random();
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < 10_0000; i++) {
            list.add(random.nextInt(6000));
        }
        HashSet <Integer> set=new HashSet<>() ;
        for(Integer val:list){
            if(set.contains(val) ){
                System.out.println("找到了"+val);
                break;
            }else{
                set.add(val);
            }
        }

    }

    public static void main2(String[] args) {
        Set<Integer> set=new HashSet<>();
        //存放不重复的元素
        set.add(51);
        set.add(21);
        set.add(51);
        set.add(10);
        System.out.println(set);
        Iterator <Integer> it=set.iterator() ;//迭代器
        while(it.hasNext() ){
            System.out.println(it.next() );
            //打印it的下一个，并且it向后走一步
        }
    }
    public static void main1(String[] args) {
        Map<Integer,String> map=new HashMap<>() ;
        map.put(1,"caocao");
        map.put(2,"zhangfei");
        map.put(3,"guanyu");
        for(Map.Entry <Integer ,String> entry :map.entrySet() ){
            System.out.println(entry .getKey() +" "+entry .getValue() );
        }
        //System.out.println(map);

    }
}
