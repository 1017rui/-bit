import java.util.*;

/**
 * @author 张瑞瑞
 * @date 2020/05/27 13:20
 */
public class TestDemo {
    public String name="abc";
    public int i=0;
    public static List<String> topKFrequent(String[] words, int k) {
        //key 代表 单词
        //value 代表该单词出现的次数
        HashMap <String,Integer> hashMap =new HashMap<>() ;
        for(String str:words ){
            if(hashMap .containsKey(str)){
                Integer value=hashMap .get(str);
                hashMap .put(str,value+1) ;
            }else{
                hashMap .put(str,1) ;
            }
        }
        //找大的，建小堆
       //PriorityQueue <String> priorityQueue =new PriorityQueue<>();
/*
        PriorityQueue <String> priorityQueue =new PriorityQueue<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return hashMap .get(o1).equals(hashMap .get(o2))?o2.compareTo(o1):hashMap .get(o1)-hashMap .get(o2);

            }
        });*/
        PriorityQueue<String> priorityQueue = new PriorityQueue<String>(
                (w1, w2) -> hashMap .get(w1).equals(hashMap .get(w2)) ?
                        w2.compareTo(w1) : hashMap .get(w1) - hashMap .get(w2) );



        //里面只存 k个字符串 存放当前出现频率最大的k个字符串
        //keySet()  存放key值的不重复集合
         for(String str:hashMap.keySet() ){
              priorityQueue .offer(str);
              if(priorityQueue .size() >k){
                  priorityQueue .poll() ;//让最小的出堆
              }
         }
        //放入栈中，利用其先进后出的特性放入list当中
         Stack<String> stack=new Stack<>() ;
         while(!priorityQueue .isEmpty() ){
             stack .push(priorityQueue .poll() ) ;
         }
        /* for(String str:priorityQueue ){
             stack .push(str) ;
         }*/
         List<String> list=new ArrayList<>() ;
         while(!stack.isEmpty() ){
             list.add(stack .pop() );
         }
         /*
        List<String> ans = new ArrayList();
        while (!priorityQueue  .isEmpty()) ans.add(priorityQueue .poll());
        Collections.reverse(ans);
        return ans;*/

         return list;
    }
    public static int compareVersion(String version1, String version2) {
        String[] s1=version1 .split("\\.") ;//根据.分割字符串，传到字符串数组中
        String[] s2=version2 .split("\\.") ;
        for(int i=0;i<Math.max(s1.length ,s2.length);i++){
            int v1=s1.length>i?Integer.valueOf(s1[i]):0;
            int v2=s2.length>i?Integer.valueOf(s2[i]):0;
            if(v1<v2){
                return -1;
            }else if(v1>v2){
                return 1;
            }
        }
        return 0;

    }
    public static void main(String[] args) {
        /*TestDemo test=new TestDemo();
        TestDemo testB=new TestDemo();
        System.out.println(test.equals(testB)+","+test.name.equals(testB.name));
    */
        /*String str1="7.5.2.4";
        String str2="7.5.3";
        int i=compareVersion(str1,str2) ;
        System.out.println(i);*/
        String[] strings={"i", "love", "leetcode", "i", "love", "coding"};

        int k=2;
        List<String> list=topKFrequent(strings,k) ;
        System.out.println(list);

    }
    public static int singleNumber(int[]nums){
        HashSet <Integer> hashSet=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            int ret=nums[i];
            if(hashSet .contains(ret) ){
                hashSet .remove(ret) ;
            }else{
                hashSet .add(ret);
            }
        }
        //利用迭代器打印集合当中的元素
        Iterator <Integer> it=hashSet .iterator() ;
        return it.next() ;
    }

    public static void main6(String[] args) {
        int[] array={1,1,2,3,4,3,4};
        System.out.println(singleNumber(array));
        int i=0;
        Integer j = new Integer(0);
        System.out.println(i==j);
        System.out.println(j.equals(i));

    }
    public static void main5(String[] args) {
        //3.将十万个数据，统计重复数，及其出现的次数。
        Random random=new Random();
        ArrayList <Integer> list=new ArrayList<>() ;
        //首先创建十万个数据
        for(int i=0;i<10_0000;i++){
            list.add(random.nextInt(6000));
        }
        HashMap<Integer,Integer> map=new HashMap<>();
        //key 关键字重复的数字
        //value 重复的数字出现的次数
        for(Integer key:list){
            if(map.containsKey(key) ){
                Integer value=map.get(key);
                map.put(key,value+1);
            }else{
                map.put(key,1);
            }
        }
        for(Map.Entry<Integer,Integer>  entry :map.entrySet() ){
            System.out.println(entry .getKey() +" 出现了"+entry .getValue()+"次！" );
        }
    }
    public static void main4(String[] args) {
        //2.list当中有十万个数据，把重复的数组全部都去重。
        Random random=new Random();
        ArrayList <Integer> list=new ArrayList<>() ;
        //首先创建十万个数据
        for(int i=0;i<10_0000;i++){
            list.add(random.nextInt(6000));
        }
        HashSet<Integer> set=new HashSet<>();//set中存放不重复的元素
        for(Integer val:list){
            set.add(val);
        }
        System.out.println();
    }
    public static void main3(String[] args) {
       // 1.list当中存放十万个数据，找出第一个重复的数据。
        Random random=new Random();
        ArrayList <Integer> list=new ArrayList<>() ;
        //首先创建十万个数据
        for(int i=0;i<10_0000;i++){
            list.add(random.nextInt(6000));
        }
        HashSet<Integer> set=new HashSet<>();
        for(Integer val:list){//遍历list
            if(set.contains(val) ){
                //说明set中已经存在val了
                System.out.println("找到了第一个重复的数字，它的值为："+val);
                break;
            }else{
                //否则添加到set当中
                set.add(val);
            }
        }
    }
    public static void main2(String[] args) {
        Set<Integer> set=new HashSet<>();//set中存储的元素是不重复的元素。
        set.add(10);
        set.add(2);
        set.add(3);
        set.add(10);
        System.out.println(set);
        System.out.println(set.contains(10));//判断某个元素是否在集合中。
        set.remove(10) ;
        System.out.println(set);
        Iterator<Integer> it=set. iterator();//迭代器
        while(it.hasNext() ){//作用： 遍历集合当中的元素
            System.out.print(it.next()+" ");
            //打印it的下一个，并且it往后走一步
        }


    }
    public static void main1(String[] args) {
        Map<String,String> map=new HashMap<>() ;
        map.put("王琳凯","我的小宝贝");
        map.put("安琦","我的小辣椒");
        map.put("热巴","我的小棉袄");
        map.put("王琳凯","我的宝贝");

        System.out.println(map);
        //map.remove("王琳凯") ;
        //System.out.println(map);
        System.out.println(map.get("安琦"));
        Set<Map.Entry <String,String>> set=map.entrySet() ;
        for(Map.Entry <String,String> entry :set){
            System.out.println(entry.getKey() +" "+entry .getValue() );
        }

    }
}
