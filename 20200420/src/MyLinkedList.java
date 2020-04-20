/**
 * @author 张瑞瑞
 * @date 2020/04/20 19:12
 */

//实现不带头节点的单向非循环链表
class Node{
    public int data; //数据域
    public Node next;//存放下一个节点的引用

    //构造方法
    public Node(int data ){
        this.data=data;
        this.next=null;
    }
}


public class MyLinkedList {

    public Node head;//头节点，随时可以发生改变

    //单链表插入的时候，要先绑后面。

    //头插法
    public void addFirst(int data){

        Node node=new Node(data);//创造了一个新节点

        if(this.head==null){
            //第一次插入节点
            this.head=node;
            return;
        }
        node.next=this.head;
        this.head=node;
    }

     //尾插法  
     public void addLast(int data){
        Node node =new Node(data);
         if(this.head==null){
             //第一次插入节点
             this.head=node;
             return;
         }
         Node cur=this.head;
         while(cur.next!=null){
             cur=cur.next;
         }
         cur.next=node;//node是局部变量，不能用this访问。

     }

    //先找到index位置的前一个节点地址
    private Node searchIndex(int index){
    if(index<0||index>this.size()){
        throw new RuntimeException("index位置不合法") ;
    }
    Node cur=this.head;//index-1
    while(index-1!=0){
      cur=cur.next;
      index--;
    }
    return cur;
    }

     //任意位置插入,第一个数据节点为0号下标  
     public void addIndex(int index,int data) {
         Node node=new Node(data);
       //1，走index-1步
         if (index == 0) {//头插
            this.addFirst(data) ;
            return;
         }
         if (index == this.size()) {//尾插
            this.addLast(data) ;
            return;
         }
         //先找到index位置的前一个节点地址
         Node cur =searchIndex(index);
        //先绑后面
         node.next=cur.next;
         cur.next=node;

     }

     //查找是否包含关键字key是否在单链表当中  
     public boolean contains(int key){
        Node cur = this.head;
        while(cur != null){
            if(cur.data == key){
                return true;
            }
            cur = cur.next;
        }
        return false;
     }

     //找key元素对应的下标 从0开始
    private int findIndex(int key){
        Node cur = this.head;
        int count=0;
        while(cur != null){
            count++;
            if(cur.data == key){
                return count-1;
            }
            cur = cur.next;
        }
        return -1;//链表中没有这个元素。
    }

   //删除第一次出现关键字为key的节点
     public void remove(int key){
         Node cur = this.head;
         int index = findIndex(key);//找key元素对应的下标
         if(index==0){//如果删的是第一个节点
             cur= this.head;
             head=cur.next;
         }else {
             cur = searchIndex(index);//找到index位置的前一个节点地址
             if (index + 1 == this.size()) {//如果删的是最后一个节点
                 cur.next = null;
             } else {
                 cur.next = (cur.next).next;
             }
         }
    }

   // 返回链表中值为key的节点的个数
   private int keyCount(int key){
        int count=0;
        Node cur = this.head;
        while(cur!=null){
            if(cur.data==key){
                count++;
            }
            cur=cur.next;
        }
        return count;
    }

    // 删除所有值为key的节点  
      public void removeAllKey(int key){
         //封装一个方法  返回链表中值为key的节点的个数
          int count=this.keyCount(key);
          while(count!=0){
             this.remove(key);
              count--;
          }
      }

     //得到单链表的长度    
     public int size(){
        Node cur = this.head;
        int count = 0;
        while (cur != null) {
            count ++;
            cur = cur.next;
        }
        return count;
     }

     //打印单链表
      public void display(){
        //怎么知道有几个节点？一个节点一个节点往后遍历
            Node cur=this.head;//头节点不会轻易发生改变 所以用一个新节点。
          while(cur!=null){
              System.out.print(cur.data+" ");
              cur=cur.next;
          }
          System.out.println();

      }

      //将单链表清空
      public void clear(){
        this.head=null;
      }
}
