import java.util.*;

/**
 * @author 张瑞瑞
 * @date 2020/05/16 9:30
 * 初识集合
 */
class Student{
    public String name;
    public String classes;
    public double score;

    public Student(String name, String classes, double score) {
        this.name = name;
        this.classes = classes;
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", classes='" + classes + '\'' +
                ", score=" + score +
                '}';
    }
}
public class TestDemo {
    public static String func(String str1,String str2){
       StringBuffer str=new StringBuffer();
        for(int i=0;i<str1.length() ;i++){
            char ch=str1.charAt(i);
            if(!str2.contains(ch+"") ){
                  str.append(ch);
            }
        }
        return str.toString() ;
    }
    public static List<Character > func1(String str1,String str2){
        List<Character > list=new ArrayList<>() ;
        for(int i=0;i<str1.length() ;i++){
            char ch=str1.charAt(i) ;
            if(!str2.contains(ch+"") ){
                list.add(ch);
            }
        }
        return list;
    }
    //杨辉三角
    public static List<List<Integer>> generate(int numRows){
        List<List<Integer>> ret=new ArrayList<>() ;
        if(numRows ==0){
            return ret;
        }
        List<Integer> oneRow=new ArrayList<>() ;
        ret.add(oneRow );
        ret.get(0).add(1);
        //拿到前一行的list
        //直接从第二行开始
        for(int i=1;i<numRows ;i++){
            List<Integer> curRow=new ArrayList<>() ;
            curRow .add(1);//当前行的第一个元素
            List<Integer> prevRow=ret.get(i-1);
            for(int j=1;j<i;j++){
              curRow .add(prevRow .get(j)+prevRow .get(j-1));
            }
            curRow .add(1);//当前行的最后一个元素
            ret.add(curRow);

        }
        return ret;
    }
    public static void main(String[] args) {
        String str1="welcome to bit";
        String str2="come";
        String str=func(str1,str2);
        System.out.println(str);
        System.out.println("=============================");
        List<Character > list=func1(str1,str2);
        for(char ch:list){
            System.out.print(ch);
        }
        System.out.println();
        List<List<Integer>>  ret=generate(4);
        System.out.println(ret );
    }
    public static void main5(String[] args) {
        List<Integer> list=new ArrayList<>() ;
        list.add(12);
        list.add(47);
        list.add(36);
        list.add(14);
        list.add(90);
        list.add(83);
        list.add(11);
        Collections .sort(list);
        System.out.println(list);

    }
    public static void main4(String[] args) {
        List<Student> list=new ArrayList<>() ;
        Student student1=new Student("迪丽热巴","五年级一班",85.8);
        Student student2=new Student("安崎","四年级一班",63.9);
        Student student3=new Student("小鬼","一年级一班",91.8);
        list.add(student1 );
        list.add(student2 );
        list.add(student3 );
        System.out.println(list);

    }
    //list接口
    public static void main3(String[] args) {
        List<String> list=new ArrayList<>() ;
        list.add("hello");//尾插一个元素
        list.add(1,"abc");
        System.out.println(list);
        List<String> list1=new ArrayList<>() ;
        list1.add("java");
        list1.add("bit");
        list.addAll(list1);//尾插list1当中所有的元素
        System.out.println(list);
       String ret=list.remove(0);//删除index位置的元素。
        System.out.println(ret);
       list.remove("bit") ;
        System.out.println(list);
        System.out.println("============get============");
        ret=list.get(0);//获得对应下标的元素
        System.out.println(ret);
        System.out.println("============set============");
        list.set(0,"Hello");//将指定下标的元素设置为"Hello"(只能设置已有位置，相当于更新。)
        //list.set(2,"pig");//error 数组越界
        System.out.println(list);
        System.out.println(list.contains("pig") );//判断指定对象是否在线性表当中
        list.add("adc");
        list.add(2,"java");
        System.out.println(list);
        System.out.println(list.indexOf("java"));//返回第一个对象所在下标
        System.out.println(list.lastIndexOf("java") );//返回最后一个对象所在下标
        System.out.println("==============subList=============");
        List<String> sub=list.subList(1,3);//截取部分list，注意左闭右开 [ )
        System.out.println(sub);
        sub.set(1,"love");
        System.out.println(list);
        //注意，如果使用subList()方法来截取list,得到sub，如果使用set修改sub
        //你会发现list也发生了变化

    }
    //Map接口
    public static void main2(String[] args) {
        Map<String,String> map=new HashMap<>();
        map.put("小辣椒","安崎");//将指定的<k,v>放入map中
        map.put("可爱鬼","王琳凯");
        map.put("女神","迪丽热巴");
        System.out.println(map);
        System.out.println(map.get("小辣椒"));//根据指定的k，查找对应的v
        System.out.println(map.getOrDefault("男神","胡歌") );//根据指定的k，查找对应的v，没有的话用默认的值代替
        System.out.println(map.containsKey("女神") );//判断是否包含key
        System.out.println(map.containsValue("陈立农") );//判断是否包含value
        System.out.println(map.containsValue("王琳凯") );//判断是否包含value
        System.out.println(map.isEmpty() );//判断map中是否为空
        System.out.println(map.size() );//返回键值对的数量
        System.out.println("=========================");
        Set<Map.Entry <String,String>> set=map.entrySet ();//将<k,v>打成一个包放在set集合中
        //System.out.println(set);
        for(Map.Entry <String,String> entry:set){
            System.out.println(entry .getKey()+" => "+entry .getValue()  );
        }
    }

    //Collection接口
    public static void main1(String[] args) {
        Collection<Integer> collection = new ArrayList<>();
        collection.add(1);//将元素放入集合当中
        collection.add(2);
        collection.add(3);
        System.out.println(collection.size());//返回集合的元素个数
        System.out.println(collection);
        System.out.println(collection.isEmpty());//判断集合是否为空
        collection.remove(2);//在集合中删除一个元素
        System.out.println(collection);
        //collection .clear();//删除集合中的所有元素
        //System.out.println(collection );
        Object[] objects = collection.toArray();//返回一个装有所有集合元素的数组
        System.out.println(Arrays.toString(objects));
    }
}

