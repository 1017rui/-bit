/**
 * @author 张瑞瑞
 * @date 2020/04/26 18:38
 */
//双向无头链表
class Node1{
    public int data;
    public Node1 prev;//前驱
    public Node1 next;//后继
    public Node1(int data){
        this.data=data;
    }
}
public class MyLinkedList {
    public Node1 head;//指向链表的头节点
    public Node1 tail;//指向链表的尾节点

    //头插法
    public void addFirst(int data){
        Node1 node =new Node1(data);
        //是否是第一次插入
        if(this.head==null){
        this.head=node;
        this.tail=node;
        return;
        }
        node.next=this.head;
        this.head.prev=node;
        this.head=node;
    }

    //尾插法
    public void addLast(int data){
        Node1 node =new Node1(data);
        //是否是第一次插入
        if(this.head==null){
            this.head=node;
            this.tail=node;
            return;
        }
       this.tail.next=node;
        node.prev=this.tail;
        this.tail=node;

    }
    private void checkIndex(int index){
        if(index<0||index>this.size()){
            throw new RuntimeException( "index不合法！");
        }
    }
    private Node1 searchIndex(int index){
        Node1 cur=this.head;
        while(index!=0){
            cur=cur.next;
            index--;
        }
        return cur;
    }
    // 任意位置插入,第一个数据节点为0号下标
    public void addIndex(int index,int data){
        this.checkIndex(index);
        if(index==0){
            this.addFirst(data);
            return;
        }
        if(index==this.size()){
            this.addLast(data);
            return;
        }
        Node1 cur=this.searchIndex(index);
        Node1 node=new Node1(data);
        node.next=cur;
        node.prev=cur.prev;
        cur.prev.next=node;
        cur.prev=node;
    }
    // 查找是否包含关键字key是否在单链表当中
    public boolean contains(int key){
        Node1 cur=this.head;
        while(cur!=null){
            if(cur.data==key){
                return true;
            }
            cur=cur.next;
        }
        return false;
    }

    // 删除第一次出现关键字为key的节点
    public int  remove(int key){
       /* if(this.head==null){
            System.out.println("双链表为空！");
            return -1;
        }*/
        Node1 cur=this.head;
        while(cur!=null){
            if(cur.data==key){
                int oldData=cur.data;
                if(cur==this.head){//如果删除的是头节点
                    this.head= this.head.next;
                    this.head.prev=null;
                }/*else if(cur==this.tail){//如果删除的是尾节点
                    this.tail=this.tail.prev;
                    this.tail.next=null;
                }*/ else {
                    cur.prev.next = cur.next;
                    if(cur.next!=null){
                        cur.next.prev = cur.prev;
                    }else {//删除的是尾节点
                        this.tail = cur.prev;
                    }
                }
                return  oldData;
            }else {
                cur = cur.next;
            }
        }
        return -1;//表示没有需要删除的元素
    }
    // 删除所有值为key的节点
    public void removeAllKey(int key){
        Node1 cur=this.head;
        while(cur!=null){
            if(cur.data==key){
                if(cur==this.head){//如果删除的是头节点
                    this.head= this.head.next;
                    if(this.head!=null) {
                        this.head.prev = null;
                    }
                } else {
                    cur.prev.next = cur.next;
                    if(cur.next!=null){
                        cur.next.prev = cur.prev;
                    }else {
                        this.tail = cur.prev;
                    }
                }

            }else {
                cur = cur.next;
            }
        }
    }

    // 得到单链表的长度
    public int size(){
        int count=0;
        Node1 cur=this.head;
        while(cur!=null){
            count++;
            cur=cur.next;
        }
        return count;
    }
     public void display(){
        Node1 cur=this.head;
        while(cur!=null){
            System.out.print(cur.data+" ");
            cur=cur.next;
        }
         System.out.println();
     }
     //清空双链表
     public void clear(){
    /* this.head=null;
     this.tail=null;*/
    //需要一个一个节点进行释放
        // Node1 cur=this.head;
         while(this.head!=null){
             Node1 cur=this.head.next;
             this.head.prev=null;
             this.head.next=null;
             this.head=cur;
         }
         this.tail=null;
     }
}
