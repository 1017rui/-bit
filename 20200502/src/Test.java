/**
 * @author 张瑞瑞
 * @date 2020/05/02 18:37
 */
/*class Base {

    Base() {

        System.out.print("Base");

    }

}

public class Alpha extends Base {

    public static void main( String[] args ) {

        new Alpha();

        //调用父类无参的构造方法

        new Base();

    }

}*/
/*
class Base{

    public Base(String s){

        System.out.print("B");

    }

}
 class Derived extends Base {

     public Derived(String s) {
         super(s);
         System.out.print("D");

     }
 }
public  class Test {
    public static void main(String[] args) {

        new Derived("C");
    }
}
*/
/*
class Base{

    public Base(String s){

        System.out.print("B");

    }

}

public class Test extends Base{

    public Test (String s) {
        super(s);
        System.out.print("D");

    }

    public static void main(String[] args){

        new Test("C");
    }
}*/
/*
class X{
    Y y=new Y();
    public X(){
        System.out.print("X");
    }
}
class Y{
    public Y(){
        System.out.print("Y");
    }
}
public class Test extends X{
    Y y=new Y();
    public Test(){
        System.out.print("Z");
    }
    public static void main(String[] args) {
        new Test();
    }
}*/
class B1 {
    public int Func() {
        System.out.print("B");
        return 0;
    }
}
class D1 extends B1 {
    @Override
    public int Func() {
        System.out.print("D");
        return 0;
    }
}
public class Test {
    public static void main(String[] args) {
        B1 a = new B1();
        B1 b = new D1();
        a.Func();
        b.Func();
    }
}