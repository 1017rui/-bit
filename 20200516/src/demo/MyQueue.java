package demo;

import java.util.ArrayList;
import java.util.Stack;

/**
 * @author 张瑞瑞
 * @date 2020/05/16 19:55
 * 用两个栈实现队列
 *
 * 入队都指定入在一个栈当中
 *
 *
 */
public class MyQueue {
    private Stack<Integer> stack1;
    private Stack<Integer> stack2;

    public MyQueue (){
        this.stack1=new Stack<>();
        this.stack2=new Stack<>();

    }
    //入队
    public void push(int x){
        stack1.push(x);//指定入到栈1
    }
    //出队
    public int top(){
        if(this.empty() ){
            return -1;
        }
       if(stack2.isEmpty() ){
               /*int size=stack1 .size() ;
               for(int i=0;i<size;i++){
                   stack2.push( stack1 .pop()) ;
               }*/
               while(!stack1.isEmpty() ){
                   stack2.push( stack1 .pop()) ;
               }
       }
       return stack2 .pop();
    }
    //返回队列首元素
    public int peek(){
        if(this.empty() ){
            return -1;
        }
        if(stack2.isEmpty() ){
            while(!stack1.isEmpty() ){
                stack2.push( stack1 .pop()) ;
            }
        }
        return stack2 .peek();
    }
    //判断队列是否为空
    public boolean empty(){
        return stack1 .isEmpty() &&stack2 .isEmpty() ;
    }
}
