import java.util.Arrays;

/**
 * @author 张瑞瑞
 * @date 2020/05/13 18:34
 * 自己实现栈
 */
public class MyStack {
    public int[] elem;//数组
     public int top;//表示当前可以存放数据元素的一个下标
    public MyStack (){
        this.elem=new int[10];
        this.top=0;

    }
    //入栈
    public void push(int data){
      //  1.判断是否为满
        //  2. 往里存放数据
       if(this.full() ){//如果栈满了进行扩容
           this.elem= Arrays.copyOf(this.elem,this.elem.length*2) ;
       }
        this.elem[this.top]=data;
        this.top++;
    }

    public boolean full(){
        if(this.top==this.elem.length){
            return true;
        }
        return false;
    }
    //栈的长度
    public int size(){
        return this.top;
    }
    public boolean empty(){
        return this.top==0;
    }
    //出栈 拿到栈顶元素 删除
    public int pop(){
        if(this.empty() ){
            throw new RuntimeException("栈空！") ;
        }
        int data=this.elem[this.top-1];
        this.top--;
        return data;
    }
    //拿到栈顶元素 不删除
    public int peek(){
        if(this.empty() ){
            throw new RuntimeException("栈空！") ;
        }
        int data=this.elem[this.top-1];
        return data;
    }


}
