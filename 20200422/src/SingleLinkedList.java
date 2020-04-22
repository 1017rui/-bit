/**
 * @author 张瑞瑞
 * @date 2020/04/22 20:10
 */
import java.util.ArrayList;
//输入一个链表，按链表从尾到头的顺序返回一个ArrayList。
 class ListNode {
    public int val;
    public ListNode next ;
    //创建一个构造方法用于初始化
    public  ListNode(int val) {
        this.val = val;
        this.next=null;
    }
}
class Node{
     public int[] elem;
     public int usedSize;
     public  static final int capacity=10;
     public Node(){
         this.elem=new int[capacity];
         this.usedSize=0;
     }
}
public class SingleLinkedList {
    public ListNode head;//自定义一个头结点
    //头插法    
    public void addFirst(int data){
        ListNode node=new ListNode(data);
        //如果是第一次插入元素
        if(this.head==null) {
            this.head = node;
            return;//注意 别忘了
        }
        node.next=this.head;
        this.head=node;


    }
    //尾插法
    public void addLast(int data){
        ListNode node=new ListNode(data);
        //如果是第一次插入元素
        if(this.head==null) {
            this.head = node;
            return;//注意 别忘了
        }
        ListNode cur=this.head;
        while(cur.next!=null){
            cur=cur.next;
        }
        cur.next=node;

    }
    //输入一个链表，按链表从尾到头的顺序返回一个ArrayList。

    /*public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
       int []array=new int[100];
       int i=0;
       ListNode list=this.head;//
        while (list != null) {
            while(i<100)
                array[i] = list.val;
                i++;
            }
            list = list.next;
        }

    }*/
}
