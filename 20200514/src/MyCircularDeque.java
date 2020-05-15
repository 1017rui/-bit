import java.util.Arrays;

/**
 * @author 张瑞瑞
 * @date 2020/05/15 15:02
 */
//设计实现双端队列。

//MyCircularDeque(k)：构造函数,双端队列的大小为k。
//insertFront()：将一个元素添加到双端队列头部。 如果操作成功返回 true。
//insertLast()：将一个元素添加到双端队列尾部。如果操作成功返回 true。
//deleteFront()：从双端队列头部删除一个元素。 如果操作成功返回 true。
//deleteLast()：从双端队列尾部删除一个元素。如果操作成功返回 true。
//getFront()：从双端队列头部获得一个元素。如果双端队列为空，返回 -1。
//getRear()：获得双端队列的最后一个元素。 如果双端队列为空，返回 -1。
//isEmpty()：检查双端队列是否为空。
//isFull()：检查双端队列是否满了。


public class MyCircularDeque {
    public int[]elem;
    public int usedSize;
    public int front;//队列的头
    public int rear;//队列的尾

    /** Initialize your data structure here. Set the size of the deque to be k. */
    public MyCircularDeque(int k) {
       this.elem=new int[k];
       this.usedSize =0;

    }

    /** Adds an item at the front of Deque. Return true if the operation is successful. */
    //insertFront()：将一个元素添加到双端队列头部。 如果操作成功返回 true。
    public boolean insertFront(int value) {
        if(isFull() ){
            return false;//队列满了，添加失败
        }

       for(int i=this.usedSize-1 ;i>=0 ;i--){
           this.elem[i+1]=this.elem[i];
       }
       this.elem[this.front ]=value ;
       this.rear++;
       this.usedSize ++;
       return true;
    }

    /** Adds an item at the rear of Deque. Return true if the operation is successful. */
    //insertLast()：将一个元素添加到双端队列尾部。如果操作成功返回 true。
    public boolean insertLast(int value) {
        if(isFull() ){
            return false;//队列满了，添加失败
        }

            this.elem [this.rear]=value;

        this.rear++;
        this.usedSize ++;

        return true;
    }

    /** Deletes an item from the front of Deque. Return true if the operation is successful. */
    //deleteFront()：从双端队列头部删除一个元素。 如果操作成功返回 true。
    public boolean deleteFront() {
        if(isEmpty() ){
            return false;
        }
        for(int i=0;i<this.elem.length-1;i++){
            this.elem[i]=this.elem[i+1];
        }
        this.rear --;
        this.usedSize --;

        return true;
    }

    /** Deletes an item from the rear of Deque. Return true if the operation is successful. */
    //deleteLast()：从双端队列尾部删除一个元素。如果操作成功返回 true。
    public boolean deleteLast() {
        if(isEmpty() ){
            return false;
        }
        this.rear--;
        this.usedSize --;

        return true;
    }

    /** Get the front item from the deque. */
    //getFront()：从双端队列头部获得一个元素。如果双端队列为空，返回 -1。
    public int getFront() {
        if(isEmpty() ){
            return -1;
        }
        return this.elem [this.front ];

    }

    /** Get the last item from the deque. */
    //getRear()：获得双端队列的最后一个元素。 如果双端队列为空，返回 -1。
    public int getRear() {
        if(isEmpty() ){
            return -1;
        }
        return this.elem [this.rear-1 ];

    }

    /** Checks whether the circular deque is empty or not. */
    public boolean isEmpty() {
        return this.usedSize  ==0;
    }

    /** Checks whether the circular deque is full or not. */
    public boolean isFull() {
    return this.elem .length ==this.usedSize ;
    }

    @Override
    public String toString() {
        return "MyCircularDeque{" +
                "elem=" + Arrays.toString(elem) +
                ", front=" + front +
                ", rear=" + rear +
                '}';
    }

    public static void main(String[] args) {
        MyCircularDeque circularDeque=new MyCircularDeque(3) ;
        circularDeque.insertLast(1);			        // 返回 true
        circularDeque.insertLast(2);			        // 返回 true
        circularDeque.insertFront(3);			        // 返回 true
        circularDeque.insertFront(4);			        // 已经满了，返回 false
        circularDeque.getRear();  				// 返回 2
        circularDeque.isFull();				        // 返回 true
        circularDeque.deleteLast();			        // 返回 true
        circularDeque.insertFront(4);			        // 返回 true
        circularDeque.getFront();//返回4
        System.out.println(circularDeque);

    }
}
