/**
 * @author 张瑞瑞
 * @date 2020/05/10 21:40
 * 泛型:
 *<T>占位符  表示当前类是一个泛型类
 *
 * 泛型的意义：
 * 1.可以自动进行类型的检查
 * 2.可以自动进行类型的转换
 *
 * 泛型的坑：
 * 1.不能new泛型类型的数组 this.elem=new T[10];
 * 2.简单类型不能作为泛型类型的参数 一定是引用类型。
 * 3.泛型类型的参数不参与类型的组成。
 *
 * 泛型的面试问题：
 * 泛型怎么编译的？
 * 擦除机制：在编译的时候被擦除为object了（不是替换）
 * 泛型只是编译时期的一种机制。在运行的时候不存在泛型这种说法。所有的处理均在编译阶段已经处理。
 */
//实现通用顺序表
public class MyArrayList <T>{
    public T[]elem;
    public int usedSize;

    public MyArrayList() {
        this.elem=(T[])new Object[10];
        this.usedSize=0;
    }
    //默认尾插
    public void add(T val){
        this.elem[this.usedSize]=val;
        this.usedSize++;

    }
    public T getVal(int pos){
        return this.elem[pos];
    }
    public static void main(String[] args) {

    }
}
