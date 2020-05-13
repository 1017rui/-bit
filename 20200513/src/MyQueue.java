/**
 * @author 张瑞瑞
 * @date 2020/05/13 19:27
 */
class Node1{
    public int data;
    public Node1 next;
    public Node1(int data){
        this.data =data;
    }
}
public class MyQueue {
    public int usedSize;
    public Node1 front;//头
    public Node1 rear;//尾
    //添加一个元素
    public boolean offer(int val){
        Node1 node=new Node1(val);
        //如果是第一次添加元素
        if(this.front ==null ){
            this.front=node;
            this.rear=node;

        }else {
            this.rear.next = node;
            this.rear = node;
        }
        this.usedSize ++;
        return true;
    }
    //出队并且删除队头元素
    public int poll(){
        if(isEmpty() ){
            throw new RuntimeException("队列为空！") ;
        }
        int data=this.front .data;
        this.front =this.front .next;
        this.usedSize --;
        return data;

    }
    public int peek(){
        if(isEmpty() ){
            throw new RuntimeException("队列为空！") ;
        }
        int data=this.front .data;
        return data;
    }
    public int size(){
        return this.usedSize ;
    }
    public boolean isEmpty(){
        return this.usedSize ==0;
    }
}
