/**
 * @author 张瑞瑞
 * @date 2020/05/16 17:23
 * 自己实现一个队列 链式
 */
class Node{
    public int data;
    public Node next;

    public Node(int data) {
        this.data = data;
    }
}
public class MyQueue {
    public Node front;//头节点
    public Node rear;//尾节点
    public int usedSize;

    //入队
    public boolean offer(int val){
        Node node=new Node(val);
        if(this.isEmpty() ){
            this.front=node;
            this.rear =node;

        }else{
            this.rear.next=node;
            this.rear=node;
        }
        this.usedSize++;
        return true;
    }
    //出队
    public int poll(){
        if(this.isEmpty() ){
            throw new RuntimeException("队列为空！") ;
        }
        int data=this.front.data;
        this.front=this.front.next;
        this.usedSize--;
        return data;
    }
    //拿到队头元素
    public int peek(){
        if(this.isEmpty() ){
            throw new RuntimeException("队列为空！") ;
        }
       return this.front.data;
    }
    public boolean isEmpty(){
        return this.usedSize ==0;
    }
    public int size(){
        return this.usedSize ;
    }
}
