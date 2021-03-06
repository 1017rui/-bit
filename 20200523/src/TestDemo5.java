/**
 * @author 张瑞瑞
 * @date 2020/05/25 23:09
 * 常用的三个内部类：
 * 1.实例内部类
 * 2.静态内部类
 * 3.匿名内部类
 */
class OuterClass{
    public int data1=1;
    public static int data2=2;
    //实例内部类  看作是一个普通的实例数据成员
    class InnerClass{
        /*
        *1.如何拿到实例内部类的对象
         */
        public int data1=11;//如果有这个 打印的是11 局部变量优先

        public int data3=3;
        public void func(){
            System.out.println(data1);//可以访问外部类的实例成员
            System.out.println(OuterClass .this.data1);
            System.out.println(data2);//可以访问外部类的静态成员
            System.out.println(data3);//可以访问内部类的实例成员

            System.out.println("chchch");
        }
    }
}
public class TestDemo5 {

    public static void main(String[] args) {
        OuterClass outerClass =new OuterClass() ;
        OuterClass.InnerClass innerClass =outerClass.new InnerClass() ;
        innerClass .func();
    }
}
