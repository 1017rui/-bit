import static java.lang.Math.pow;

/**
 * @author 张瑞瑞
 * @date 2020/05/04 17:24
 * 链表
 */

    class Node {
        public int data;
        public Node next;

    public Node(int data) {
        this.data = data;
        this.next=null;
    }
}
public class MyLinkedList {
        public Node head;
        //头插法
    public void addFirst(int data){
        Node node =new Node(data);
        //如果链表为空
        if(this.head==null){
            this.head=node;
            return ;
        }
        node.next=this.head;
        this.head=node;
    }
    //尾插法
    public void addLast(int data){
        Node node=new Node(data);
        if(this.head==null){
            this.head=node;
            return ;
        }
        Node cur=this.head;
        while(cur.next!=null){
            cur=cur.next;
        }
        cur.next=node;
    }
    //给定一个链表，判断链表中是否有环。
    //为了表示给定链表中的环，我们使用整数 pos 来表示链表尾连接到链表中的位置（索引从 0 开始）。 如果 pos 是 -1，则在该链表中没有环。
    public boolean hasCycle() {
        Node fast=this.head;
        Node slow=this.head;
        while(fast!=null&&fast .next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow){
                return true;
            }
        }
        return false;
    }
    //实现一种算法，删除单向链表中间的某个节点（除了第一个和最后一个节点，不一定是中间节点），假定你只能访问该节点。

    public void deleteNode(Node node) {
      node.data=node.next.data;
      node.next=node.next.next;

    }
    //打印链表
    public void display(){
        Node cur=this.head;
        while(cur!=null){
            System.out.print(cur.data+" ");
            cur=cur.next;
        }
        System.out.println();
    }
    public void display1(Node node){
        Node cur=node;
        while(cur!=null){
            System.out.print(cur.data+" ");
            cur=cur.next;
        }
        System.out.println();
    }
    public int size(){
        int count=0;
        Node cur=this.head;
        while(cur!=null){
            count++;
            cur=cur.next;
        }
        return count;
    }
    //实现一种算法，找出单向链表中倒数第 k 个节点。返回该节点的值。
    public int kthToLast( int k) {
        //判断k的合法性
        if(k<0){
            throw new RuntimeException("k下标不合法！") ;
        }
        Node fast=this.head;
        Node slow=this.head;

        //让快指针先走k-1步
        while(k-1!=0){
            fast=fast.next;
            if(fast==null){
                return -1;
            }
            k--;
        }
        while(fast.next!=null){
            fast=fast.next;
            slow=slow.next;
        }
        return slow.data;

    }
    //给你一个单链表的引用结点 head。链表中每个结点的值不是 0 就是 1。已知此链表是一个整数数字的二进制表示形式。
    public int getDecimalValue() {
      Node cur=this.head;
      int sum=0;
      int i=0;
      while(cur!=null){
          i++;
         sum=sum+cur.data*(int)pow(2,(this.size()-i));
         cur=cur.next;
      }
      return sum;
    }
}
