/**
 * @author 张瑞瑞
 * @date 2020/04/21 18:44
 */
public class TestDemo2 {
    public static void main(String[] args) {
        MyDoubleLinkedList my=new MyDoubleLinkedList() ;
        my.addFirst(11) ;
        my.addFirst(12) ;
        my.addFirst(13) ;
        my.addFirst(14) ;
        my.addFirst(17);
        my.addFirst(17);
        my.addLast(77);
        my.addLast(78);
        my.addLast(17);
        my.addLast(17);
        my.addLast(79);
        my.addLast(80);

        my.display() ;
        /*System.out.println(my.contains(23));
        System.out.println(my.contains(13));*/
        //System.out.println(my.size());
       // my.clear() ;
       // my.display() ;
        /*my.addIndex(0,45);
        my.display() ;*/
        /*my.remove(80);
        my.display();*/
        my.removeAllKey(17) ;
        my.display() ;

    }
}
