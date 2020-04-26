/**
 * @author 张瑞瑞
 * @date 2020/04/26 11:20
 */
//用于测试
public class TestDemo {
    public static void main(String[] args) {
        MySingleLinkedList my =new MySingleLinkedList();//创建一个单链表对象
       /* my.addFirst(11);
        my.addFirst(12);
        my.addFirst(13);
        my.addFirst(14);
        my.addFirst(15);*/
        my.addLast(1);
        my.addLast(9);
        my.addLast(10);
        //my.addLast(11);
        my.addLast(11);
        my.addLast(9);
        my.addLast(1);
        my.display();
        System.out.println(my.chkPalindrome());
        //Node ret=my.deleteDuplication() ;
        //my.display1(ret) ;

       // Node ret=my.partition(17) ;
        //my.display1(ret);
       //Node ret= my.findKthToTail(7) ;
        //System.out.println(ret.data);
        //Node ret=my.middleNode() ;
        //System.out.println(ret.data);
      /* Node ret= my.reverseList();
        my.display1(ret) ;*/
        //my.addIndex(7,10) ;
        //my.remove(18);
       // my.removeAllKey(11);
        //my.display();

       /* my.clear() ;
        my.addFirst(77);
        my.addFirst(78);
        my.addFirst(79);
        my.addFirst(80);
        my.display();*/
       /* System.out.println(my.contains(11));
        System.out.println(my.contains(15));
        System.out.println(my.contains(20));
*/
        //System.out.println(my.size());


    }
}
