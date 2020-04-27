/**
 * @author 张瑞瑞
 * @date 2020/04/26 11:20
 */
//用于测试
public class TestDemo {
    //输入两个链表，找出它们的第一个公共节点
    public static Node getIntersectionNode(Node headA,Node headB){
        Node pl=headA;//放较长的链表，先默认headA是较长的链表
        Node ps=headB;//放较短的链表
        int lenA=0;//求链表headA的长度
        int lenB=0;//求链表headB的长度
        while(pl!=null){
            lenA++;
            pl=pl.next;
        }
        while(ps!=null){
            lenB++;
            ps=ps.next;
        }
        int len=lenA-lenB;
        if(len<0){//说明链表headB较长
            pl=headB;
            ps=headA;
            len=lenB-lenA;
        }
        //让较长的链表走差值步
        for(int i=0;i<len;i++){
            pl=pl.next;
        }
        //现在两个链表在同一个起跑线
        while(pl!=ps&&pl!=null&&ps!=null){
            pl=pl.next;
            ps=ps.next;
        }
        if(pl==ps&&pl!=null&&ps!=null){
            return ps;
        }
        return null;
    }
    public  static void linkLinkedList(Node headA,Node headB){
        headA.next=headB.next.next;
    }

    //将两个有序链表合并为一个新的有序链表并返回。
    // 新链表是通过拼接给定的两个链表的所有节点组成
    public static Node mergeTwoList(Node headA,Node headB){
        Node newHead=new Node(-1);//虚拟节点
        Node tmp=newHead;
        while(headA!=null&&headB!=null){
            if(headA.data<headB.data){
                tmp.next=headA;
                tmp=tmp.next;
                headA =headA.next;
            }else{
                tmp.next=headB;
                tmp=tmp.next;
                headB =headB.next;
            }
        }
        if(headA==null){
            tmp.next=headB;
        }
        if(headB==null){
            tmp.next=headA;
        }
        return newHead .next;
    }

    public static void main(String[] args) {
        MySingleLinkedList my =new MySingleLinkedList();//创建一个单链表对象
       /* my.addFirst(11);
        my.addFirst(12);
        my.addFirst(13);
        my.addFirst(14);
        my.addFirst(15);*/
        my.addLast(1);
        my.addLast(2);
        my.addLast(4);
        //my.addLast(11);
        my.addLast(7);
        my.addLast(9);
        my.addLast(30);
        my.display();
        MySingleLinkedList  my1=new MySingleLinkedList() ;
        my1.addLast(2);
        my1.addLast(6);
        my1.addLast(8);
        my1.addLast(20);
        my1.addLast(21);
        my1.addLast(30);
        my1.display();
        Node ret=mergeTwoList(my.head,my1.head);
        my1.display1(ret) ;
       /* linkLinkedList(my.head,my1.head);
        Node ret= getIntersectionNode(my.head,my1.head);
        System.out.println(ret.data);*/
        //System.out.println(my.hasCycle() );
       // System.out.println(my.chkPalindrome());
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
