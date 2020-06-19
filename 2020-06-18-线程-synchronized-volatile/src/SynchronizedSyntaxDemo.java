/**
 * @author 张瑞瑞
 * @date 2020/06/18 19:24
 * 演示关键字synchronized的语法
 */
public class SynchronizedSyntaxDemo {
    /*
    修饰方法
     */
    public synchronized void method(){

    }
    public static synchronized void staticMethod(){

    }
    /*
    修饰代码块
     */
    public void otherMethod(){
        // 括号里跟着指向对象的引用，引用不能是 null
        Object o=new Object();
        synchronized(o){
        }
        synchronized(this){
        }
        synchronized(SynchronizedSyntaxDemo .class){
        }
    }
}
