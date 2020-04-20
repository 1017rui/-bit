/**
 * @author 张瑞瑞
 * @date 2020/04/20 18:43
 */
public class TestdDemo1 {
    public static void main(String[] args) {
        MyLinkedList my = new MyLinkedList();
        my.addFirst(11) ;
        my.addFirst(11) ;
        my.addFirst(13) ;
        my.addFirst(14) ;
       // my.display();
       my.addLast(77);
        my.addLast(78);
        my.addLast(79);
        my.addLast(80);
        my.display();
        /*System.out.println(my.contains(80));
        System.out.println(my.size());*/
      /*  my.addIndex(8,10);
        my.display() ;
        my.clear();
        my.display() ;
        my.addFirst(11) ;
        my.addFirst(12) ;
        my.addFirst(13) ;
        my.addFirst(14) ;
        my.display();*/
      //my.remove(14);
     // my.display() ;
       // System.out.println(my.findIndex(14));
        /*my.remove(11);
        my.display() ;*/
       // System.out.println(my.keyCount(14));
        my.removeAllKey(11);
        my.display() ;
    }
}