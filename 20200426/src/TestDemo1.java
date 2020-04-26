/**
 * @author 张瑞瑞
 * @date 2020/04/26 18:44
 */
public class TestDemo1 {
    public static void main(String[] args) {
    MyLinkedList my=new MyLinkedList() ;
        /*my.addFirst(1) ;
        my.addFirst(2) ;
        my.addFirst(3) ;
        my.addFirst(4) ;
        my.addFirst(5) ;*/
        my.addLast(1);
        my.addLast(2);
        my.addLast(3);
        my.addLast(4);
        my.addLast(5);
       // my.addIndex(4,15);
        my.remove(5) ;
        my.display() ;

    }
}
