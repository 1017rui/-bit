/**
 * @author 张瑞瑞
 * @date 2020/04/21 14:06
 */
//用于测试MySingleLinkedList类
public class TestDemo1 {
    public static void main(String[] args) {
        MySingleLinkedList my=new MySingleLinkedList() ;
        my.addFirst(11);
        my.addFirst(12);
        my.addFirst(13);
        my.addFirst(14);
       // my.display() ;
        my.addLast(77);
        my.addLast(78);
        my.addLast(79);
       // my.addLast(80);
        my.display() ;
       /* //System.out.println(my.size());
        my.addIndex(8,90);
        my.display() ;
        my.addIndex(0,100);
        my.display() ;
        my.addIndex(5,123);
        my.display() ;
        System.out.println(my.contains(100));
        System.out.println(my.contains(90));
        System.out.println(my.contains(23));*/
        /*System.out.println(my.findIndex(80));
        System.out.println(my.findIndex(100));
        System.out.println(my.findIndex(77));*/
       /* my.remove(80);
        my.display() ;*/
       // System.out.println(my.findCount(78));
       // my.remove(11);
       // my.removeAllKey(11);
        //my.display() ;
       /* my.removeAllKey1(11) ;
        my.display();
*/
      /*Node ret= my.reverseList();
      my.display1(ret) ;
*/
        //System.out.println(my.middleNode().data);
        Node ret=my.FindKthToTail(7);
        System.out.println(ret.data);
    }


}
