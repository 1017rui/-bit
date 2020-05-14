import java.util.LinkedList;
import java.util.Stack;

/**
 * @author 张瑞瑞
 * @date 2020/05/14 19:45
 */
public class MyQueue {
    private Stack <Integer >stack1;
    private Stack <Integer >stack2;

    /** Initialize your data structure here. */
    public MyQueue() {
        this.stack1 =new Stack<>() ;
        this.stack2 =new Stack<>() ;


    }

    /** Push element x to the back of queue. */
    //入队
    public void push(int x) {
      stack1.push(x) ;
    }

    /** Removes the element from in front of queue and returns that element. */
    //出队
    public int pop() {
        if(empty() ){//队列为空
            return -1;
        }
        if(stack2.isEmpty() ) {
            while (!stack1.empty()) {
                stack2.push(stack1.pop());
            }
        }

        return stack2.pop() ;
    }

    /** Get the front element. */
    //返回队列首部元素
    public int peek() {
        if(empty() ){//队列为空
            return -1;
        }
        if(stack2 .isEmpty() ) {
            while (!stack1.empty()) {
                stack2.push(stack1.pop());
            }
        }
        return stack2.peek() ;
    }


    /** Returns whether the queue is empty. */
    public boolean empty() {
        if(stack1 .isEmpty() &&stack2 .isEmpty() ){
            return true;
        }
        return false;
    }
}
