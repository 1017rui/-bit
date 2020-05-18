

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * @author 张瑞瑞
 * @date 2020/05/16 16:15
 */
public class TestDemo1 {
    //判断字符串是否有效
    public static boolean isValid1(String str){
        Stack<Character >stack=new Stack<>();
        for(int i=0;i<str.length() ;i++){
            char ch=str.charAt(i);
            if(ch=='('||ch=='['||ch=='{'){
                stack.push(ch) ;
            }else{
                //1.判断栈是否为空
                if(stack .empty() ){
                    System.out.println("右括号多！");
                    return false;
                }
                char tmp=stack.peek() ;
                if(tmp=='('&&ch==')'||tmp=='['&&ch==']'||tmp=='{'&&ch=='}'){
                    stack.pop();
                }else{
                    System.out.println("左右括号不匹配！");
                    return false;
                }
            }
        }
        if(!stack.empty() ){
            System.out.println("左括号多！");
            return false;
        }
        return true;
    }
    public static boolean isValid(String str){
       Stack<Character >stack=new Stack<>();
       for(int i=0;i<str.length() ;i++){
           char ch=str.charAt(i);
           if(ch==')'||ch==']'||ch=='}'){
               return false ;
           }
           if(ch=='('||ch=='['||ch=='{'){
               stack.push(ch) ;
           }else{
               char tmp=stack.pop() ;
               if(tmp=='('&&ch!=')'||tmp=='['&&ch!=']'||tmp=='{'&&ch!='}'){
                   return false;
               }
           }
       }
       if(stack.empty() ){
           return true;
       }
       return false;
    }
    public static void main(String[] args) {
        String str="][]}";
        System.out.println(isValid1(str));
    }
    //掩饰自己实现的队列
    public static void main5(String[] args) {
        MyQueue  myQueue =new MyQueue() ;
        myQueue .offer(1) ;
        myQueue .offer(2) ;
        myQueue .offer(3) ;
        System.out.println(myQueue .peek() );
        System.out.println(myQueue .poll() );
        System.out.println(myQueue .peek() );

    }
    //演示库当中的队列
    public static void main4(String[] args) {
        Queue<Integer> queue=new LinkedList<>();

        queue .offer(17) ;
        queue .offer(18) ;
        queue .offer(19) ;
        queue .offer(20) ;
        System.out.println(queue);
        queue.remove() ;
        System.out.println(queue);
        System.out.println(queue.peek());
        queue.poll() ;//出队

    }
//测试自己实现的链式栈
    public static void main3(String[] args) {
       MyLinkedStack myLinkedStack =new MyLinkedStack() ;
       myLinkedStack .push(12);
       myLinkedStack .push(13);
       myLinkedStack .push(14);
       myLinkedStack .push(15);
       myLinkedStack .display() ;
        System.out.println(myLinkedStack.peek());
        System.out.println(myLinkedStack.pop());
        System.out.println(myLinkedStack.peek());
        System.out.println(myLinkedStack .size() );

    }
    //测试自己实现的 顺序栈
    public static void main2(String[] args) {
        MyStack<Integer > mystack=new MyStack<>() ;
        mystack .push(20) ;
        mystack .push(22) ;
        mystack .push(24) ;
        mystack .push(26) ;
        System.out.println(mystack );
        System.out.println(mystack.peek());
        System.out.println(mystack.pop());
        System.out.println(mystack.peek());
        MyStack <String> myStack1=new MyStack<>() ;
        myStack1 .push("zhang");



    }
    //栈  先进后出  底层是数组。
    public static void main1(String[] args) {
        Stack<Integer> stack =new Stack<>();
        stack.push(12);//入栈
        stack.push(13);
        stack.push(14);
        stack.push(15);
        System.out.println(stack );
        stack .pop();//出栈
        System.out.println(stack );
        System.out.println(stack.peek());//拿到栈顶的元素  并不删除
       // System.out.println(stack );
        System.out.println(stack.empty());//判断栈是否为空
        System.out.println(stack .search(14) );//返回此堆栈基于1的位置。
        System.out.println(stack .size() );

    }
}
