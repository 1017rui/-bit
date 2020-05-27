/**
 * @author 张瑞瑞
 * @date 2020/05/26 18:45
 * 1.<T>:表示当前类是泛型类
 * 2.意义：放数据的时候可以自动进行类型的检查
 * 3.取数据的时候，可以自动进行类型的转换
 * 4.泛型到底是怎么编译的？在编译时期的一种机制 --》 擦除机制
 * 编译的时候是按照Object去编译的  但不是替换成Object  运行的时候没有泛型的概念。
 * 5.泛型是有边界的。
 * 坑：
 * 1.不能够new泛型类型 的数组
 * 2.简单类型不能作为泛型类型的参数
 *3.泛型类型的参数不参与类型的组成
 */
class MyStack<T>{
    public T[]elem;
    public int top;
    public MyStack (){
        this.elem=(T[])new Object[10];
    }
    public void push(T val){
        this.elem[this.top]=val;
        this.top++;
    }
    public T peek(){
        return this .elem[this.top-1];
    }
}

public class TestDemo2 {
    public static void main(String[] args) {
        MyStack<Integer> myStack =new MyStack<>() ;
        myStack .push(10);
        myStack .push(4) ;
        System.out.println(myStack .peek());
    }
}
