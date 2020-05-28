/**
 * @author 张瑞瑞
 * @date 2020/05/28 12:24
 */
public class MyArrayList<T> {
    private T[] array;
    private int size;
    public MyArrayList (){
        array=(T[])new Object[10];
        size=0;
    }
    //尾插
    public void add(T t){
        array[size]=t;
        size++;
    }
    //尾删
    public T remove(){
        T t=array[size-1];
        array [size-1]=null;
        size--;
        return t;
    }
    public void display(){
        for(int i=0;i<size;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }
}
