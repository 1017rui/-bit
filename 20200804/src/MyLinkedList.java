/**
 * @author 张瑞瑞
 * @date 2020/08/04 11:54
 */
//实现不带头节点的单向非循环链表
class Node{
    public int data;//数据域
    public Node next;//下一个节点的引用

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}
public class MyLinkedList {
    public Node head;//自定义一个头节点
    //头插法
    public void addFirst(int data){
        Node node=new Node(data);//创建一个结点
        //如果是第一次插入元素
        if(this.head==null){
            this.head=node;
            return;
        }
        node.next=this.head;
        this.head=node;
    }
    //尾插法
    public void addLast(int data){
        Node node =new Node(data);
        //如果是第一次插入元素
        if(this.head==null){
            this.head=node;
        }
        Node cur=this.head;//找最后一个结点
        while(cur.next!=null){
            cur=cur.next;
        }
        cur.next=node;
    }
    //判断下标是否合法
    private void checkIndex(int index){
        if(index<0||index>this.size()){
            throw new RuntimeException("下标不合法！");
        }
    }
    //找到要插入下标的前一个元素所指的结点
    private Node findNode(int index){
        checkIndex(index);
        Node cur=this.head;
        for(int i=0;i<index-1;i++){
            cur=cur.next;
        }
        return cur;
    }
    //在任意位置插入，第一个数据结点为0号下标
    public void addIndex(int index,int data){
        Node node =new Node(data);
        checkIndex(index);
        if(index==0){
            //相当于头插
            addFirst(data);
            return;
        }
        Node cur=findNode(index);//找到要插入位置的前一个元素指向的结点
        node.next=cur.next;
        cur.next=node;
    }
    public int size(){
        Node cur=this.head;
        int count=0;
        while(cur!=null){
            count++;
            cur=cur.next;
        }
        return count;
    }
    public void display(){
        Node cur=this.head;
        while (cur!=null){
            System.out.print(cur.data+" ");
            cur=cur.next;
        }
        System.out.println();
    }
    //查找是否包含关键字key
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
    //找到关键字为key节点的下标
    public int findIndex(int key){
        int count=0;
        Node cur=this.head;
        while ((cur!=null)){
            if(cur.data==key){
                return count;
            }else{
                count++;
                cur=cur.next;
            }
        }
        return -1;//表示没找到这个元素
    }
    //删除第一次出现关键字为key的结点
    public void remove(int key){
        int index=findIndex(key);//找到这个关键字对应的下标
        if(index==-1){
            throw new RuntimeException("没有需要删除的元素");
        }
        if(index==0){
            //要删除头节点
            this.head=this.head.next;
            return;
        }

        Node cur=findNode(index);
        cur.next=cur.next.next;
    }
    //删除所有值为key的结点
    public void removeAllKey(int key){
        Node prev=this.head;//前驱节点
        Node cur=prev.next;//代表要删除的结点
        while(cur!=null){
            if(cur.data==key){
                //删
                prev.next=cur.next;
                cur=cur.next;
            }else{
                //不是要删除的结点
                //更新前驱
                prev=cur;
                cur=cur.next;
            }
        }
        //最后判断头节点是否需要删除
        if(this.head.data==key){
            this.head=this.head.next;
        }
    }
    //java第十二次课。。反转单链表
}
