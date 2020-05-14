import java.util.LinkedList;
import java.util.Queue;

/**
 * @author 张瑞瑞
 * @date 2020/05/14 18:39
 * 用队列实现栈 需要两个栈
 */
 public class MyStack {
    private Queue<Integer> queue1;
    private Queue<Integer> queue2;

    /** Initialize your data structure here. */
    public MyStack() {
        queue1 =new LinkedList<>() ;
        queue2 =new LinkedList<>() ;
    }

    /** Push element x onto stack. */
    //入栈
    public void push(int x) {

        if(!queue1 .isEmpty() ){
            queue1 .offer(x) ;
        }else if(!queue2 .isEmpty() ){
            queue2 .offer(x);
        }else{
            queue1 .offer(x);
        }
    }

    /** Removes the element on top of the stack and returns that element. */
    //出栈
    public int pop() {
        if(empty()){
            return -1;//出栈失败
        }
        int val=0;//出栈的元素
        int queue1Size=queue1 .size();
        int queue2Size=queue2 .size();

        if(!queue1 .isEmpty()){

            while(queue1Size-1!=0){
                queue2.offer(queue1.poll());
                queue1Size--;
            }
            val=queue1.poll() ;
        }else{
            while(queue2Size-1!=0){
                queue1.offer(queue2.poll());
                queue2Size--;
            }
            val=queue2.poll() ;
        }
        return val;
    }

    /** Get the top element. */
    //拿到栈顶元素
    public int top() {
        if(empty()){
            return -1;
        }
        int val=0;//出栈的元素
        int queue1Size=queue1 .size();
        int queue2Size=queue2 .size();

        if(!queue1 .isEmpty()){
            while(queue1Size!=0){
                val=queue1.poll();
                queue2.offer(val);
                queue1Size--;
            }

        }else{
            while(queue2Size!=0){
                val=queue2.poll();
                queue1.offer(val);
                queue2Size--;
            }
        }
        return val;

    }

    /** Returns whether the stack is empty. */
    //判断栈是否为空
    public boolean empty() {
        if(queue1 .isEmpty() &&queue2 .isEmpty() ){
            return true;
        }
        return false;
    }
}

