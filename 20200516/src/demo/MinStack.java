package demo;

import java.util.Stack;

/**
 * @author 张瑞瑞
 * @date 2020/05/16 20:37
 * 最小栈
 */
public class MinStack {
    private Stack <Integer> stack;
    private Stack<Integer> minStack;
    public MinStack (){
        this.stack=new Stack<>();
        this.minStack =new Stack<>();
    }
    public void push(int x){
        stack.push(x);
        if(minStack.isEmpty() ){
            //最小栈内没有元素
            minStack.push(x) ;
        }else{
            //最小栈内有元素
            int top=minStack.peek();
            if(x<=top){
                minStack.push(x) ;
            }
        }
    }
    public void pop(){
        if(!stack .isEmpty() ){
            stack .pop();
            if(minStack .peek()== stack .pop()){
                minStack.pop();
            }
        }

    }
    //拿到栈顶元素
    public int top(){
        if(stack .isEmpty() ){
            return -1;
        }
        return stack.peek();
    }
   //拿到当前栈中的最小元素
    public int getMin(){
        if(stack .isEmpty() ){
            return -1;
        }
        return minStack.peek();
    }

}
