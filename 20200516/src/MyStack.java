
import java.util.Arrays;

/**
 * @author 张瑞瑞
 * @date 2020/05/16 16:17
 * 自己实现一个栈
 */
public class MyStack<T> {
    public T[]elem;
    public int top;//当前可以存放数据元素的下标

    public MyStack() {
        this.elem = (T[])new Object[10];
    }

    //入栈
    public void push(T val){
        //判断栈是否为满
        if(this.full() ){//扩容
          this.elem = Arrays .copyOf(this.elem,this.elem.length*2) ;
        }
        this.elem [this.top]=val;
        this.top++;
    }
    //出栈
    public T pop(){
        if(this.empty() ){
           //return -1;//栈为空  不能出栈
            throw new RuntimeException("栈空！") ;
         }
        T data=this.elem[this.top-1];
        this.top--;
        return data;
    }
    //拿到栈顶的元素
    public T peek(){
        if(this.empty() ){
            throw new RuntimeException("栈空！") ;
        }
        return this.elem [this.top-1];
    }
    //判断栈是否为空
    public boolean empty(){
        return this.top ==0;
    }
    //判断栈是否为满
    public boolean full(){
        return this.top==this.elem .length;
    }
    //栈的大小
    public int size(){
        return this.top;
    }
}
