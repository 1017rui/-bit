import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * @author 张瑞瑞
 * @date 2020/05/11 22:47
 */
public class TestDemo2 {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("hello");//尾插一个元素
        list.add(0,"abc");//在指定的下标，插入一个元素
        System.out.println(list);
        List<String> list1=new ArrayList<>() ;
        list1.add("java");
        list1.add("bit");
        list.addAll(list1);//尾插list1中所有的元素
        System.out.println(list);
        String str=list.remove(0) ;//删除下标对应的元素
        list.remove("bit") ;//删除指定的对象
        System.out.println(list);
        System.out.println("==============get============");
        String str1=list.get(0);//获取下标位置对应的元素
        System.out.println(str1);
        System.out.println("==============set=============");
        list.set(1,"hahaha");//设置已有的位置，相当于更新
        System.out.println(list);
        System.out.println(list.contains("haha1"));//判断线性表中是否包含某个对象
        System.out.println(list.indexOf("hello"));//返回线性表中指定对象对应的下标
        list.add("hahaha");
        list.add("hello");
        System.out.println(list.lastIndexOf("hahaha"));//从后往前查找第一个对象对应的下标
        System.out.println(list);//[hello, hahaha, hahaha, hello]
        System.out.println("==========================");
         List <String> retList=list.subList(0, 2);//截取部分list 前闭后开
        System.out.println(retList );//[hello, hahaha]
        retList .set(1,"ruirui");
        System.out.println(retList );//[hello, ruirui]
        System.out.println(list);//[hello, ruirui, hahaha, hello]
        list.clear() ;//清空线性表
        System.out.println(list);
    }
    /*public static void main1(String[] args) {
        String str="dilireba";
        System.out.println(str.substring(0, 3));//左闭右开
    }*/
}
