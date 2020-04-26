/**
 * @author 张瑞瑞
 * @date 2020/04/21 14:06
 */
//用于测试MySingleLinkedList类

public class TestDemo1 {
    //将两个链表相交
    public static  void creatCut(Node headA,Node headB){
        headA.next=headB.next.next;
    }
    //输入两个链表，找出他们的公共节点
    public static Node getIntersectionNode(Node headA,Node headB){
        //1.求长度，走差值步
        int lenA=0;//链表headA的长度
        int lenB=0;//链表headB的长度
        Node pl=headA;//  放较长的链表 先默认headA是较长的链表
        Node ps=headB;//  放较短的链表
        while(pl!=null){//求链表headA的长度
            lenA++;
            pl=pl.next;
        }
        while(ps!=null){//求链表headB的长度
            lenB++;
            ps=ps.next;
        }
        int len=lenA-lenB;//长度的差值
        if(len<0){//说明headB是较长的链表
            pl=headB;
            ps=headA;
            len=lenB-lenA;
        }
        //pl一定指向是长链表
        for(int i=0;i<len;i++){//走差值步
            pl=pl.next;
        }
     //2.ps,pl一定在同一个起跑线上
        while(ps!=pl&&pl!=null&&ps!=null){
            ps=ps.next;
            pl=pl.next;
        }
        if(ps==pl&&pl!=null&&ps!=null){//找到了
            return pl;
        }
        return null;
    }
    // 将两个有序链表合并为一个新的有序链表并返回。
    public  static Node mergeTwoLists(Node headA, Node headB) {
        Node newHead=new Node(-1);//虚拟节点
        Node tmp=newHead ;
        while(headA!=null&&headB!=null){
            if(headA.data<headB.data){
                tmp.next=headA;
                tmp=tmp.next;
                headA=headA.next;
            }else{
                tmp.next=headB;
                tmp=tmp.next;
                headB=headB.next;
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
        MySingleLinkedList my=new MySingleLinkedList() ;
        my.addLast(1);
        my.addLast(3);
        my.addLast(7);
        my.addLast(9);
        my.addLast(14);
        my.addLast(28);
        my.addLast(44);
       // my.addLast(80);
        my.display() ;
        //MySingleLinkedList my1=new MySingleLinkedList() ;
       /* my1.addLast(2);
        my1.addLast(4);
        my1.addLast(8);
        my1.addLast(12);
        my1.addLast(17);
        my1.addLast(20);
        my1.addLast(25);
        my1.display() ;
        creatCut(my.head,my1.head);
        Node ret=getIntersectionNode(my.head,my1.head);
        System.out.println(ret.data);*/
      //mergeTwoLists(my.head,my1.head);
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

      Node ret= my.reverseList();
      my.display1(ret) ;

        //System.out.println(my.middleNode().data);
      Node ret=my.FindKthToTail(7);
       System.out.println(ret.data);

        */
       my.reverseList1();
        my.display();
        //my.display1(ret) ;
        //my.display1(ret) ;
        //Node ret=my.FindKthToTail1(7);
       // System.out.println(ret.data);
        //Node ret=my.partition(14);
       // my.display1(ret);

        //Node ret1=my.deleteDuplication() ;
        //my.display1(ret1) ;
    }
}