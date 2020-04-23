/**
 * @author 张瑞瑞
 * @date 2020/04/21 14:09
 */
//实现不带头结点的单向非循环链表
    class Node{
        public int data;
        public Node next;
        //创建一个构造方法用以初始化
        public  Node(int data){
            this.data=data;
            this.next=null;
        }
            }
public class MySingleLinkedList {
    public Node head;//自定义一个头结点
    //头插法    
     public void addFirst(int data){
         Node node=new Node(data);
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
        Node node=new Node(data);
        //如果是第一次插入元素
        if(this.head==null) {
            this.head = node;
            return;//注意 别忘了
        }
        Node cur=this.head;
        while(cur.next!=null){
            cur=cur.next;
        }
        cur.next=node;

    }
    //下标合法性的判断
    private void checkIndex(int index){
        if(index<0||index>this.size()){
            throw new RuntimeException("下标不合法！") ;
        }
    }
    //找要插入的元素的前一个元素指向的节点
    private Node findNode(int index){
        checkIndex(index);
        Node cur=this.head;//index-1
        for(int i=0;i<index-1;i++){
             cur=cur.next;
        }
        return cur;

    }
    //任意位置插入,第一个数据节点为0号下标  
      public void addIndex(int index,int data){
         Node node=new Node(data);
         //如果下标不合法，抛出异常
          checkIndex(index);//这个下标可以==size(),相当于尾插。
          if(index==0){
                //相当于头插法
              this.addFirst(data);
              return;
          }
          if(index==this.size()){
              //相当于尾插法
              this.addLast(data);
              return;
          }
          //找要插入的元素的前一个元素指向的节点
          Node cur=findNode(index);
          node.next=cur.next;
          cur.next=node;

      }
     //查找是否包含关键字key是否在单链表当中    
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
     //找到关键字为key的节点的下标
    public int findIndex(int key){
        int count=0;
        Node cur=this.head;
        while(cur!=null){
            if(cur.data!=key) {
                count++;
                cur=cur.next;
            }else {
                return count;
            }
        }
        return -1;
    }
      //删除第一次出现关键字为key的节点
      public void remove(int key){
       int index=this.findIndex(key);//找到这个关键字对应的下标
          if(index==-1){
              System.out.println("没有需要删除的节点！");
              return ;
          }
          if(index==0){//要移除头节点
              this.head=head.next;
              return ;
          }
          //找到这个下标对应的节点的前一个节点
          Node cur=this.findNode(index);
          if((cur.next).next==null){//要移除尾节点
              cur.next=null;
              return ;
          }
          cur.next=(cur.next).next;
      }

      //找要删除的节点的前驱
    private Node searchPrev(int key){
         Node prev=this.head;
         while(prev.next!=null){
             if(prev.next.data==key){
                 return prev;
             }else{
                 prev=prev.next;
             }
         }
         return null;
    }
      public void remove1 (int key){
         if(this.head==null){
             System.out.println("链表为空！");
             return;
         }
         if(this.head.data==key){//要删除头节点
             this.head=this.head.next;
             return;
         }
         Node prev=searchPrev(key);
         if(prev==null){
             System.out.println("没有需要删除的元素！");
             return;
         }
         Node del=prev.next;
         prev.next=del.next;
      }
      //封装一个方法，找关键值为key的元素的个数
    private int findCount(int key){
         int count=0;
         Node cur=this.head;
         while(cur!=null){
             if(cur.data==key){
                 count++;
             }
             cur=cur.next;
         }
         return count;
    }
     //删除所有值为key的节点  
     public void removeAllKey(int key){//存在问题，遍历的好多次
         int count=this.findCount(key);
         if(count==0){
             System.out.println("没有需要删除的节点！");
         }
         while(count!=0){
             this.remove(key);
             count--;
         }
     }
     public void removeAllKey1(int key){//遍历单链表一遍
         Node prev=this.head;//前驱节点
         Node cur=prev.next;//代表要删除的节点
         while(cur!=null){
             if(cur.data==key){//则是要删除的元素
                 prev.next=cur.next;
                 cur=cur.next;
             }else{//否则prev,cur往后移动
                 prev=cur;
                 cur=cur.next;
             }
         }
         //如果头节点满足条件，删除头节点
         if(this.head.data==key){
             this.head=this.head.next;
         }

     }
     //得到单链表的长度    
     public int size(){
         int count=0;
         Node cur=this.head;
         while(cur!=null){
             count++;
             cur=cur.next;
         }
         return count;
     }
    //打印单链表
     public void display(){
         Node cur=this.head;
         while(cur!=null){
              System.out.print(cur.data+" ");
              cur=cur.next;
         }
             System.out.println();
         }
     //将单链表清空
    //释放内存空间
    //JVM在回收内存的时候，当没有人在引用她的时候，这个对象才会被回收
     public void clear(){//用于解决内存泄漏
         this.head=null;//可以回收掉内存
     }
    public Node reverseList() {//反转链表
       Node cur=this.head;
       Node prev=null;
       Node newHead =null;
       while(cur!=null){
           Node curNext=cur.next;
           if(curNext==null){
              newHead=cur;
           }
           cur.next=prev;
           prev=cur;
           cur=curNext;
       }
     return newHead;
    }
public void display1(Node newHead){
    Node cur=newHead;
    while(cur!=null){
        System.out.print(cur.data+" ");
        cur=cur.next;
    }
    System.out.println();
}

//给定一个带有头结点 head 的非空单链表，返回链表的中间结点。如果有两个中间结点，则返回第二个中间结点
    public Node middleNode()
    {
       /* if(this.head==null){
            return null;
        }*/
        Node slow=this.head;
        Node fast=this.head;

        while(fast!=null&&fast.next!=null){
            fast=(fast.next).next;//一次走两步
            slow=slow.next;//一次走一步
        }
        return slow;
    }
    //链表中倒数第k个节点
    public Node FindKthToTail(int k) {
//首先判断K的合法性
        if(k<=0||k>this.size()){
            System.out.println("下标不合法！");
           return null;
        }
// 之后定义两个指针，快指针先走k-1步，之后快慢指针同时移动
// 当快指针的next为空时，此时慢指针即为所求节点
        Node fast=this.head;
        Node slow=this.head;
        int i=0;
        while(i<k-1){
            fast=fast.next;
            i++;
        }
        while(fast.next!=null){
            slow=slow.next;
            fast=fast.next;
        }
        return slow;
    }
    }


