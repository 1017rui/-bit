import java.net.HttpURLConnection;

/**
 * @author 张瑞瑞
 * @date 2020/04/26 11:21
 */
//实现无头单向非循环链表
    class Node {
        public int data;//数值域
        public Node next;//下一个节点的引用
    //定义一个构造方法用于 初始化
    public Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class MySingleLinkedList {
        //由于无头 所以定义一个头节点
    public Node head;
    //实现一些操作单链表你的方法

    //实现头插法插入节点
    public void addFirst(int data){
        Node node=new Node(data);
        //如果是第一次插入，只需把它置为头节点
        if(this.head==null){
            this.head=node;
            return;
        }
        node.next=this.head;
        this.head=node;
    }

    //实现尾插法插入节点
    public void addLast(int data){
        Node node =new Node (data);
        //如果是第一次插入，只需把它置为头节点
        if(this.head==null){
            this.head=node;
            return;
        }
        Node cur=this.head;
        while(cur.next!=null) {
            cur = cur.next;
        }
        cur.next = node;

    }

    //找下标对应节点的前一个节点
    private Node findBeforeNode(int index){
        Node cur=this.head;
        while(index-1!=0){
            cur=cur.next;
            index--;
        }
        return cur;
    }
    //在任意位置插入节点，下标从零开始
    public void addIndex(int index,int data){
        if(index<0||index>this.size()){
            throw new RuntimeException("下标不合法！") ;
        }
        if(index==0) {//相当于头插
            this.addFirst(data);
            return;
        }
        if(index==this.size()){//相当于尾插
            this.addLast(data) ;
            return;
        }
        Node node =new Node(data);//要插入的节点
        Node cur=this.findBeforeNode(index); //找下标对应节点的前一个节点
        node.next=cur.next;
        cur.next=node;
    }

    // //找到key对应节点的前驱
    private Node findPrev(int key){
        Node prev=this.head;
        while(prev.next!=null){
            if(prev.next.data==key){
                return prev;
            }
            prev=prev.next;
        }
        return null;//链表中没有这个节点
    }

    //删除第一次出现关键字为key的节点
    public void remove(int key){
        if(this.head==null){//如果链表为空，没有需要删除的节点
            System.out.println("单链表为空！");
            return;
        }
        if(this.head.data==key){//如果要删的是头节点，要把下一个节点置为单链表新的头
            this.head=this.head.next;
            return;
        }
        //找到key对应节点的前驱，只要让key的前驱和key的后继之间建立联系就可以删除key
        Node prev=this.findPrev(key);

        if(prev==null){//说明单链表中没有关键字为key的这个节点
            System.out.println("没有需要删除的节点！");
            return;
        }
        Node node=prev.next;//要删的节点
        prev.next=node.next;
    }

    //删除所有关键字为key的节点
    public void removeAllKey(int key){//只能遍历单链表一遍

        //先不考虑头节点是否需要删除
        Node prev=this.head;//让它始终存放要删除节点的前驱
        Node cur=prev.next;//要删的节点

        while(cur!=null){
          if(cur.data==key){//cur是需要删除的节点
              prev.next=cur.next;
              cur=cur.next;
          }else{
              prev=cur;
              cur=cur.next;
          }
        }

        //现在单独考虑头节点要删除的情况
        if(this.head.data==key){
            this.head=this.head.next;//让头节点指向下一个节点即可
        }
    }
    //查找是否包含关键字key是否在单链表中
    public boolean contains (int key){
        Node cur=this.head;
        while(cur!=null){
            if(cur.data==key){
                return true;
            }
            cur=cur.next;
        }
        return false;
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

    //将单链表置为空
    public void clear(){
        this.head=null;
    }
    //实现一个打印单链表的方法
    public void display(){
        Node cur=this.head;
        while(cur!=null){
            System.out.print(cur.data+" ");
            cur=cur.next;
        }
        System.out.println();
    }

   //反转一个单链表
   public Node reverseList() {//返回的是反转后新的头节点
        Node cur=this.head;//要反转的节点
        Node prev=null;//cur的前驱节点
        Node newHead=null;//新的头节点
       while(cur!=null){
           //每次反转一个结点之前要先把下一个节点记住，否则反转之后就找不到了
           Node curNext=cur.next;//放在循环条件中是为了防止空指针异常

           //注意：当curNext为空时，此时cur指向的反转后新的头节点
           if(curNext==null){
               newHead=cur;
           }
           cur.next=prev;
           prev=cur;
           cur=curNext;
       }
       return newHead;
   }

   //对应的测试打印方法
    public void display1(Node newHead){
        Node cur=newHead;
        while(cur!=null){
            System.out.print(cur.data+" ");
            cur=cur.next;
        }
        System.out.println();
    }

    //给定一个带有头节点的非空单链表，返回链表的中间节点，如果有两个中间节点，返回后面那个节点
    //奇数个节点返回最中间
    //偶数个节点返回中间两个节点的后一个
    public Node middleNode(){
        Node fast=this.head;//快指针
        Node slow=this.head;//慢指针
        while(fast!=null&&fast.next!=null){//顺序不能改变，否则会发生空指针异常
            fast=fast.next.next ;
            slow=slow.next;
        }
        return slow;
    }

    //输入一个链表，输出该链表中倒数第k个节点
    public Node findKthToTail(int k){//只允许遍历单链表一遍
        //首先判断 k的合法性
        /*if(k<0||k>this.size()){
            System.out.println("k值不合法！");
            return null ;
        }*/
        if(k<0){
            System.out.println("k值不合法！");
            return null ;
        }
        Node fast=this.head;
        Node slow=this.head;
        //要找倒数第k个节点 先让快指针先走k-1步，
        while(k-1!=0){
        if(fast!=null) {
            fast = fast.next;
            k--;
        }else{
                System.out.println("链表中没有这个节点！");
                return null;
            }

        }
        //之后快慢指针分别各走一步，当快指针走到最后一个节点此时慢指针对应的节点即为所求节点
        while(fast.next!=null){
            fast=fast.next;
            slow=slow.next;
        }
        return slow;
    }

    //编写代码，以给定值X为基准将链表分割成两部分，所有小于X的节点排在大于或等于X的节点之前。
    public Node partition(int x){
        Node as=null;//放小于X的节点
        Node ae=null;
        Node bs=null;//放大于等于X的节点
        Node be=null;
        Node cur=this.head;//用于遍历整个单链表
        while(cur!=null){
            if(cur.data<x){
                if(bs==null){
                    bs=cur;
                    be=cur;

                }else{
                    be.next=cur;
                    be=be.next;
                }
            }else{
                if(as==null){
                    as=cur;
                    ae=cur;

                }else{
                    ae.next=cur;
                    ae=ae.next;
                }
            }
            cur=cur.next;
        }
        if(bs==null){
            return as;
        }else{//将bs和as进行拼接
            be.next=as;
        }
        if(as!=null){
            ae.next=null;
        }
        return bs;
    }
    //在排序的链表中，存在重复的节点，，请删除链表中重复的节点，重复的链表步保留，返回链表的头指针
    //在排序的链表中，如果出现重复的节点，肯定是相邻的。
    //定义一个虚拟节点用来解决问题
    public Node deleteDuplication(){
        Node newHead=new Node(-1);//虚拟节点
        Node tmp=newHead ;
        Node cur=this.head;//用来遍历整个链表
        while(cur!=null){
            if(cur.next!=null&&cur.data==cur.next.data){
                //一旦遇到相同的节点，可能会出现多个，所以写一个循环
                while(cur.next!=null&&cur.data==cur.next.data) {
                    cur = cur.next;
                }
                //循环跳出之后cur指的仍是与之前相同的节点，所以cur需要多走一步
                cur=cur.next;
            }else{
              tmp.next=cur;
              tmp=tmp.next;
              cur=cur.next;
            }
        }
        tmp.next=null;
        return newHead.next;
    }

    //判断链表是否为回文结构
    public boolean chkPalindrome(){

        if(this.head==null){
            return false;
        }
        if(this.head.next==null){
            return true;
        }
        //1.找到链表的中间节点

        Node fast=this.head;
        Node slow=this.head;
        while(fast!=null&&fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        //跳出循环之后的slow肯定是中间节点

        //2.从中间节点开始把后面的节点反转
        Node cur=slow.next;
        while(cur!=null){
            Node curNext=cur.next;
            cur.next=slow;
            slow=cur;
            cur=curNext;
        }

        //3.一个指针从左边开始移动，一个从右边开始移动
        while(this.head!=slow){//不考虑偶数的情况
            if(this.head.data!=slow.data){
                return false ;
            }
        if(this.head.next==slow){//考虑偶数
            return true;
        }
            this.head=this.head.next;
           slow=slow.next;
        }

        return true;
    }
}
