import java.util.Stack;

/**
 * @author 张瑞瑞
 * @date 2020/05/14 20:19
 */
public class MinStack {
    private Stack<Integer > stack;
    private Stack <Integer >minstack;
    public MinStack() {

        this.stack =new Stack<>() ;
        this.minstack =new Stack<>() ;

    }

    public void push(int x) {
        stack .push(x);
        if(minstack .isEmpty() ){
            //最小栈内没有元素
            minstack .push(x);
        }else{
            //最小栈内有元素 拿到栈顶元素和x进行比较
            int top=minstack .peek() ;
            if(x<=top){
                minstack .push(x);
            }
        }
    }

    public void pop() {
        if(!stack .empty() ){
           int tmp= stack.pop();
            if(tmp==minstack.peek() ){
                minstack .pop();
            }
        }
    }
//拿到栈顶元素并不删除
    public int top() {
        if(stack .empty() ){
            return -1;
        }
        return stack .peek() ;
    }
//求得当前栈中的最小元素
    public int getMin() {
        if(minstack .empty() ){
            return -1;
        }
        return minstack .peek();
    }
}
