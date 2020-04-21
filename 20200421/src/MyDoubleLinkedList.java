/**
 * @author 张瑞瑞
 * @date 2020/04/21 18:45
 */
//无头双向链表的实现
 class Node1{
        public int data;
        public Node1 prev;//指向前一个节点
        public Node1 next;//指向后一个节点

        //提供一个构造方法用于初始化
    public Node1(int data){
        this.data=data;
        this.prev=null;
        this.next=null;
    }
}
public class MyDoubleLinkedList {
     public Node1 head;//定义一个头结点
    //头插法  
      public void addFirst(int data) {
          Node1 node=new Node1(data);//创建一个节点

          node.next =this.head;
          this.head=node;

      }
     //尾插法  
     public void addLast(int data) {
         Node1 node=new Node1(data);

         //找最后一个节点
         Node1 cur=this.head ;
         if(this.head==null){
             head=node;
             return;
         }
         while(cur.next!=null){
             cur=cur.next;
         }
         cur.next=node;
         node.prev=cur;
     }

     // 找下标对应节点的前一个节点
    private  Node1 findNode(int index){
          Node1 cur=this.head ;
          for(int i=0;i<index-1;i++){
              cur=cur.next;
          }
          return cur;
    }
     //任意位置插入,第一个数据节点为0号下标  
      public void addIndex(int index,int data) {
       Node1 node=new Node1(data);
       //判断下标是否合法
          if(index<0||index>this.size()){
              throw new RuntimeException("下标位置不合法！") ;
          }
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
          //找下标对应节点的前一个节点
          Node1 cur=findNode(index);
          node.prev= cur;
          node.next=cur.next;
           cur.next=node;
          (node.next).prev=node;
      }
      //查找是否包含关键字key是否在单链表当中
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
    //找到key元素对应的下标
    private int findIndex(int key){
        int count=0;
        Node1 cur=this.head;
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
      public void remove(int key) {

       int index=findIndex(key);//找到key元素对应下标
          if(index==-1){
              System.out.println("没有需要删除的元素！");
              return;
          }
          if(index==0){//删除头节点
              this.head=this.head.next;
              this.head.prev=null;
              return;
          }
         //找下标对应节点的前一个节点
          Node1 cur=findNode(index);
          if((cur.next).next==null){//删除尾节点
              cur.next =null;
              return;
          }
          cur.next=(cur.next).next;
          (cur.next).prev=cur;

      }
      //获取链表中值为key的节点的个数
      private int findCount(int key){
          int count=0;
          Node1 cur=this.head;
          while(cur!=null){
              if(cur.data==key){
                  count++;
              }
              cur=cur.next;
          }
          return count;
      }
      //删除所有值为key的节点  
      public void removeAllKey(int key) {
          int count=this.findCount(key);
          if(count==0){
              System.out.println("没有需要删除的元素！");
          }
          while(count!=0){
              this.remove(key);
              count--;
          }
    }
      //得到单链表的长度    
     public int size() {
          int count=0;
         Node1 cur=this.head;
         while(cur!=null){
             count++;
             cur=cur.next;
         }
         return count ;

     }
     //打印单链表
      public void display() {
          Node1 cur=this.head;
          while(cur!=null){
              System.out.print(cur.data+" ");
              cur=cur.next;
          }
          System.out.println();
      }
      //清空链表
      public void clear(){
          this.head=null;
      }
}

