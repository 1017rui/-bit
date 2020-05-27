/**
 * @author 张瑞瑞
 * @date 2020/05/26 19:01
 * 泛型的边界
 * T extends Comparable <T>  上界  T一定实现了Comparable这个接口
 * 泛型 没有下界。
 */
class Generic<T extends Comparable <T>>{//  泛型的边界  代表T实现了这个接口

    public T findMax(T[] elem){
        T max=elem[0];
        for(int i=0;i<elem.length ;i++){
            if(elem[i].compareTo(max)>0 ){//  引用类型比较需要比较器
                max=elem[i];
            }
        }
        return max;
    }
}/*
*   类型推导   根据实参的类型推导出形参的类型
*/
class Generic2{//  泛型的边界  代表T实现了这个接口

    //一个泛型的静态方法。
    public  static <T extends Comparable <T>> T findMax(T[] elem){
        T max=elem[0];
        for(int i=0;i<elem.length ;i++){
            if(elem[i].compareTo(max)>0 ){//  引用类型不能这样比较需要比较器
                max=elem[i];
            }
        }
        return max;
    }
}
public class TestDemo3 {
    public static void main(String[] args) {
        Generic <Integer> generic =new Generic<>() ;
        Integer[] array={12,3,54,67,43,23};
        System.out.println(generic.findMax(array));
        //通过类名调用方法
        System.out.println(Generic2.findMax(array));
    }
}
