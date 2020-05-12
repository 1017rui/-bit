/**
 * @author 张瑞瑞
 * @date 2020/05/12 23:05
 * 链表
 */
class Node {
    public int data;//链表的数据域
    public Node next;//指向链表的下一个索引

    public Node(int data) {
        this.data = data;
    }
}
public class MyLinkedList {
    public Node head;//头节点
    //头插一个节点
    public  void addFirst(int data){
        Node node =new Node(data);
        if(this.head==null){
            //说明此时链表为空
            this.head=node;
            return;
        }
       node.next=this.head;
        this.head=node;
    }
    //尾插一个节点
    public void addLast(int data){
        Node node=new Node(data);
        if(this.head==null){
            //说明此时链表为空
            this.head=node;
            return;
        }
        Node cur=this.head;
       while(cur.next!=null){
           cur=cur.next;
       }
       cur.next=node;
    }
    //找要要插入位置的前一个节点  封装在一个函数中
    private Node findBeforeNode(int index){
        Node cur=this.head;
        while(index-1!=0){
            cur=cur.next;
            index--;
        }
        return cur;

    }
    //任意位置插入一个节点
    public void addIndex(int index,int data){
        //判断下标是否合法
        if(index<0||index>this.size()){
            throw new RuntimeException("下标位置不合法！") ;
        }
        if(index==0){
            this.addFirst(data);
            return;
        }
        if(index==this.size()){
            this.addLast(data);
            return;
        }
        Node node=new Node(data);//要插入的节点
        //需要找要要插入位置的前一个节点
        Node cur=this.findBeforeNode(index);
        node.next=cur.next;
        cur.next=node;

    }
    //查找关键字key是否包含在单链表中
    public boolean contains(int key){
        Node cur=this.head;
        while(cur!=null){
            if(cur.data==key){
                return true;
            }
            cur=cur.next;
        }
        return false;
    }
    //找到key对应节点的前驱  封装到一个函数中
    private Node findPrevNode(int key){
        Node prev=this.head;
        while(prev.next!=null){
            if(prev.next.data==key){
                return prev;
            }
            prev=prev.next;
        }
        return null;
    }
    //删除第一次出现关键字为key的节点
    public void remove(int key){
        //如果要删的是头节点
        if(this.head.data==key){
            this.head=this.head.next;
            return;
        }
   //需要找到key对应节点的前驱
       Node cur= this.findPrevNode(key) ;
        if(cur==null){
            System.out.println("该链表中没有你要删除的节点！");
            return;
        }
        
    }
    //删除所有值为key的节点
    public void removeAll(int key){

    }
    //求单链表的长度
    public int size(){
        int count=0;
        Node cur=this.head;
        while(cur!=null){
            count++;
            cur=cur.next;
        }
        return count;
    }
    //将单链表清空
    public void clear(){
        this.head=null;
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


}
