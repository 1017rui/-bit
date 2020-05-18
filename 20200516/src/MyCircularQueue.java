/**
 * @author 张瑞瑞
 * @date 2020/05/16 18:00
 * 循环队列
 * rear表示当前可以存放数据元素的下标
 * 如果front==rear 此时队列为空（舍弃一个元素，这样不会出现front==rear时队列已满的情况）
 * 如果rear的下一个是front时就认为队列是满的。
 *
 *
 */
public class MyCircularQueue {
    public int[] elem;
    //public int usedSize;
    public int front;
    public int rear;
    //初始化数组长度为k
    public MyCircularQueue(int k){
        this.elem =new int[k];
    }
    //入队
    public boolean enQueue(int value){
        //首先判断队列是否满了
        if(this.isFull() ){
            return false;
            //throw new RuntimeException("队列已经满了！") ;
        }
        this.elem[this.rear]=value;
        this.rear=(this.rear+1)%this.elem.length;
        return true;
    }
    //出队
    public boolean deQueue(int value){
        if(isEmpty() ){
            return false;
        }
        this.front=(this.front+1)%this.elem.length;
        return true;

    }
    //拿到队头元素
    public int Front(){
        if(isEmpty() ){
            return -1;
        }
       return this.elem[this.front];
    }
    //拿到队尾元素
    public int Rear(){
        if(isEmpty() ){
            return -1;
        }
        if(this.rear==0){
            return this.elem[this.elem.length-1];
        }
        return this.elem[this.rear-1];
    }
    public boolean isEmpty(){
        return this.front==this.rear;
    }
    public boolean isFull(){
       return (this.rear +1)%this.elem.length ==this.front;
    }
}
