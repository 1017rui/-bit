import java.util.ArrayList;
import java.util.List;

/**
 * @author 张瑞瑞
 * @date 2020/05/12 22:17
 */
//public class A<T> {
//  T value;
//
//  A(T value) {
//    this.value;
//  }
//
//  T get() {
//    return value;
//  }
//}
//请编写代码使用 A 这个 泛型类
 class A<T> {
     T value;

    public A(T value) {
        this.value = value;
    }

    public T get() {
        return value;
    }

    @Override
    public String toString() {
        return "A{" +
                "value=" + value +
                '}';
    }
}
public class Test {
    public static void main(String[] args) {
        MyArrayList my=new MyArrayList() ;
        my.add(0,1) ;
        my.add(1,2) ;
        my.add(2,3) ;
        my.add(3,4) ;
        my.add(4,5) ;
        my.add(5,6) ;
        my.add(6,7) ;
        my.add(7,8) ;
        my.add(8,9) ;
        my.add(9,10) ;
        my.add(10,190);
        my.display() ;

        //System.out.println(my.contains(10));
        //System.out.println(my.contains(23));
        //System.out.println(my.getPos(10) );
        //System.out.println(my.getPos(6) );
        //my.setPos(1,11) ;
my.remove(6) ;
        my.display() ;
    }
    public static void main2(String[] args) {
        MyLinkedList my=new MyLinkedList() ;
        my.addFirst(12) ;
        my.addFirst(13) ;
        my.addFirst(14) ;
        my.addLast(56) ;
        my.addLast(57) ;
        my.addLast(58) ;
       // System.out.println(my.contains(32));
        //System.out.println(my.contains(56));
       // System.out.println(my.size() );
        my.display() ;
       // my.clear() ;
        //System.out.println(my.size() );
        //my.addIndex(4,1) ;
       // my.remove(13) ;
       // my.removeAll(12) ;
        Node node=my.reverseList() ;
        my.display1(node) ;


    }
    public static void main1(String[] args) {
        A<Integer> list=new A(12);
        A<String> list1=new A("zhang");
        System.out.println(list.get());
        System.out.println(list1.get());
    }
}
