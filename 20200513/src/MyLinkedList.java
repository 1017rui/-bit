/**
 * @author 张瑞瑞
 * @date 2020/05/13 23:07
 */
//设计链表的实现。您可以选择使用单链表或双链表。单链表中的节点应该具有两个属性：val 和 next。val 是当前节点的值，next 是指向下一个节点的指针/引用。
// 如果要使用双向链表，则还需要一个属性 prev 以指示链表中的上一个节点。假设链表中的所有节点都是 0-index 的。
//在链表类中实现这些功能：



class Node{
    public int val;
    public Node next;
    public Node prev;

    public Node(int val) {
        this.val = val;
    }
}
public class MyLinkedList {
   public Node head;
    /** Initialize your data structure here. */
    public MyLinkedList() {

    }
    //求链表的长度
    private int size(){
        int count=0;
        Node cur=this.head;
        while(cur!=null){
            count++;
            cur=cur.next;
        }
        return count;
    }
//找到这个下标对应的节点
    private Node findIndexNode(int index){
        Node cur=this.head;
        while(index!=0){
            cur=cur.next;
            index--;
        }
        return cur;
    }
//get(index)：获取链表中第 index 个节点的值。如果索引无效，则返回-1。
    /** Get the value of the index-th node in the linked list. If the index is invalid, return -1. */
    public int get(int index) {
   //判断下标是否合法
        if(index<0||index>=this.size() ){
            return -1;
        }
        //找到这个下标对应的节点
      Node cur=this.findIndexNode(index) ;
        return cur.val;
    }
//addAtHead(val)：在链表的第一个元素之前添加一个值为 val 的节点。插入后，新节点将成为链表的第一个节点。  头插法
    /** Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list. */
    public void addAtHead(int val) {
        Node node=new Node(val);
        //如果是第一次插入
        if(this.head==null){
            this.head=node;
            return;
        }
        node.next=this.head;
        this.head.prev=node;
        this.head=node;
    }
//addAtTail(val)：将值为 val 的节点追加到链表的最后一个元素。 尾插法
    /** Append a node of value val to the last element of the linked list. */
    public void addAtTail(int val) {
        Node node=new Node(val);
        //如果是第一次插入
        if(this.head==null){
            this.head=node;
            return;
        }
        //先找到链表的最后一个节点
        Node cur=this.head;
        while(cur.next!=null){
            cur=cur.next;
        }
        cur.next=node;
        node.prev=cur;
    }

//addAtIndex(index,val)：在链表中的第 index 个节点之前添加值为 val  的节点。如果 index 等于链表的长度，则该节点将附加到链表的末尾。
// 如果 index 大于链表长度，则不会插入节点。如果index小于0，则在头部插入节点。
    /** Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted. */
    public void addAtIndex(int index, int val) {
        if(index>this.size() ){
            System.out.println("不会插入节点！");
            return;
        }
        if(index==this.size()){
            this.addAtTail(val) ;
            return;
        }
        if(index<=0){
            this.addAtHead(val) ;
            return;
        }
        //找到这个下标对应的节点
        Node cur=this.findIndexNode(index) ;
        Node node =new Node(val);//要插入的节点
        node.next=cur;
        node.prev=cur.prev;
        cur.prev.next=node;
        cur.prev=node;
    }
//deleteAtIndex(index)：如果索引 index 有效，则删除链表中的第 index 个节点。
    /** Delete the index-th node in the linked list, if the index is valid. */
    public void deleteAtIndex(int index) {
        if(index<0||index==this.size()){
            System.out.println("下标位置不合法！");
            return;
        }
        if(index==0){
            //要删除头节点
            this.head=this.head.next;
            this.head.prev=null;
            return;
        }

        //找到这个下标对应的节点
        Node cur=this.findIndexNode(index) ;
        if(index==this.size()-1){
            //如果要删除的是尾节点
            cur.prev.next=null;
            return;
        }
        cur.prev.next=cur.next;
        cur.next.prev=cur.prev;
    }
    public void display(){
        Node cur=this.head;
        while(cur!=null){
            System.out.print(cur.val+" ");
            cur=cur.next;
        }
        System.out.println();
    }

}

