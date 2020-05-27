import java.util.ArrayList;

/**
 * @author 张瑞瑞
 * @date 2020/05/26 19:33
 * 通配符
 */
/*
写一个通用的方法打印集合中所有的元素
通配符：也是一种泛型
通配符一般用于读入
泛型一般用于写入

通配符既有上界又有下界  上界  extends 下界  super
*/

class GenericList{
    public static <T>  void printList(ArrayList<T> list){
        for(T val: list){
            System.out.print(val +" ");
        }
        System.out.println();
    }

    public static void printList2(ArrayList<?> list){
        for(Object val: list){
            System.out.print(val +" ");
        }
        System.out.println();
    }
}

public class TestDemo4 {
    public static void main(String[] args) {
        ArrayList <Integer> list =new ArrayList<>() ;
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        GenericList .printList2(list) ;
    }
}
