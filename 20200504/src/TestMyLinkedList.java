/**
 * @author 张瑞瑞
 * @date 2020/05/04 17:30
 */
//测试类
public class TestMyLinkedList {
    //编写一个程序，找到两个单链表相交的起始节点。
    public static void xiangjiao(Node  headA,Node  headB){
        headA.next=headB.next.next;
    }
    public static  Node getIntersectionNode(Node  headA,Node  headB) {
  //先让较长的节点走差值步
       Node pl=headA;//先默认他较长
       Node ps=headB;
       int lenA=0;
       int lenB=0;
       while(pl!=null){
           lenA++;
           pl=pl.next;
       }
       while(ps!=null){
           lenB++;
           ps=ps.next;
       }
       pl=headA;
       ps=headB;
       int len=lenA-lenB;
       if(len<0){
           pl=headB;
           ps=headA;
           len=lenB-lenA;
       }
       for(int i=0;i<len;i++){
           pl=pl.next;
        }
       //此时pl,ps在同一起跑线
        while(pl!=ps&&pl!=null&&ps!=null){
            pl=pl.next;
            ps=ps.next;

        }
        if(pl==ps){
            return pl;
        }
        return null;


    }
    //将两个升序链表合并为一个新的升序链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的
    public  static Node mergeTwoLists(Node  l1, Node l2) {
        Node newHead=new Node(-1);//虚拟节点
        Node tmp=newHead;
        Node cur1=l1;
        Node cur2=l2;
        while(cur1!=null&&cur2!=null){
            if(cur1.data<cur2.data){
                tmp.next=cur1;
                tmp=tmp.next;
                cur1=cur1.next;
            }else{
                tmp.next=cur2;
                tmp=tmp.next;
                cur2=cur2.next;
            }
        }
        //说明有一个链表已经为空了
        if(cur1==null){
            tmp.next=cur2;
        }
        if(cur2==null){
            tmp.next=cur1;
        }
    return newHead .next;
    }
    public static void main(String[] args) {
        MyLinkedList  my1=new MyLinkedList() ;

        my1.addLast(1) ;
        //my1.addLast(0) ;
        //my1.addLast(0) ;
        //my1.addLast(0) ;
        my1.display() ;
        System.out.println(my1.getDecimalValue());
        /*my.addFirst(11) ;
        my.addFirst(12) ;
        my.addFirst(13) ;
        my.addFirst(14) ;*/
       /* my1.addLast(14) ;
        my1.addLast(20) ;
        my1.addLast(25) ;
        my1.addLast(52) ;*/
        //System.out.println(my1.size());
        //System.out.println(my.hasCycle());

      /*  my1.display() ;
       // System.out.println(my1.kthToLast(5));
        MyLinkedList  my2=new MyLinkedList() ;
        my2.addLast(6) ;
        my2.addLast(19) ;
        my2.addLast(29) ;
        my2.addLast(44) ;
        my2.display() ;
        xiangjiao(my1.head ,my2.head) ;
     Node tmp=getIntersectionNode(my1.head ,my2 .head) ;
        System.out.println(tmp.data);*/
     //Node tmp=mergeTwoLists(my1, my2);
     //my1.display1(tmp) ;
        //System.out.println(my1.size());

    }
}
