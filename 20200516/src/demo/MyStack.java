package demo;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author 张瑞瑞
 * @date 2020/05/16 19:27
 * 用两个对列来实现栈
 */
public class MyStack {
   private Queue<Integer> queue1;
   private Queue<Integer> queue2;

    public MyStack (){
        this.queue1=new LinkedList<>() ;
        this.queue2=new LinkedList<>() ;
    }
    public void push(int x){
        if(this.empty() ){
            queue1 .offer(x) ;
        }else if(!this.queue1.isEmpty()){
            queue1 .offer(x) ;
        }else{
            queue2 .offer(x) ;

        }
    }
    public int pop(){
        if(this.empty() ){
            return -1;
        }
        int len=0;
        int data=0;
        if(!queue1.isEmpty() ){
            len=queue1 .size() ;
            while(len-1!=0){
                queue2.offer(queue1 .poll() ) ;
                len--;
            }
             data=queue1.poll() ;

        }else{
            len=queue2 .size() ;
            while(len-1!=0){
                queue1.offer(queue2 .poll() ) ;
            }
            data=queue2.poll() ;

        }
        return data;
    }
    //拿到栈顶元素
    public int top(){
        if(this.empty() ){
            return -1;
        }
        int size1=queue1.size();
        int size2=queue2.size();
        int data=0;
        if(!queue1 .isEmpty() ){
            for(int i=0;i<size1;i++){
                data=queue1 .poll();
                queue2 .offer(data) ;
            }
        }else{
            for(int i=0;i<size2;i++){
                data=queue2 .poll();
                queue1 .offer(data) ;
            }
        }
        return data;
    }

    public boolean empty(){
        return queue1.isEmpty() &&queue2 .isEmpty() ;
    }
}
