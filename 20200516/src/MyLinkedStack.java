import java.util.Arrays;

/**
 * @author 张瑞瑞
 * @date 2020/05/16 17:01
 * 用链表实现栈
 */
class Node1{
    public int data;
    public Node1 next;

    public Node1(int data) {
        this.data = data;
    }
}
public class MyLinkedStack {
    public Node1 head;//头节点
    //入栈
    public void push(int val){
       //采用头插法入栈
        Node1 node=new Node1(val);
        if(this.empty() ){
            this.head=node;
            return;
        }
        node.next=this.head;
        this.head=node;
    }
    //出栈
    public int pop(){
        //从头出
        if(this.empty() ){
            throw new RuntimeException("栈空！") ;
        }
        int data=this.head.data;
        this.head=this.head.next;
        return data;
    }
    //拿到栈顶元素
    public int peek(){
        if(this.empty() ){
            throw new RuntimeException("栈空！") ;
        }
        return this.head.data;
    }
    public boolean empty(){
       return this.head==null;
    }
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
}
