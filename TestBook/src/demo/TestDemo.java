package demo;

/**
 * @author 张瑞瑞
 * @date 2020/05/01 22:17
 *
 */
interface A{
    void func1();
}
interface B{
    void func2();
}
//extends 扩展
interface C extends A,B{//接口和接口之间是扩展
    void func3();

}
class TestB implements C{//类和接口之间是实现
    public void func3(){

    }
    @Override
    public void func1() {

    }

    @Override
    public void func2() {

    }
}
class Test implements A,B{
    @Override
    public void func1() {

    }

    @Override
    public void func2() {

    }

    public void func3() {

    }
}
public class TestDemo {
    public static void main(String[] args) {

    }
}
