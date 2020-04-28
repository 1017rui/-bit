package com.bit.Demo3;

/**
 * @author 张瑞瑞
 * @date 2020/04/28 20:03
 * 接口：
 *1. 接口当中的方法都是抽象方法
 *2.也可以有具体的实现方法,这个方法是被default修饰的
 *3.接口当中定义的成员变量 ，默认是常量
 *4.接口当中的成员变量默认是 public static final
 * 成员方法是 public abstract
 *5.接口是不可以被实例化的
 *6.接口和类之间的关系：  implements
 *7.为了解决Java单继承的问题  可以实现多个接口。
 * 8.只要这个类 实现了该接口 你就可以进行向上转型
 */

//接口（interface）
interface Shape{
    //public static final int a=10;//a默认是常量
    //public abstract void draw();
    void draw();
   /* default void func(){
        System.out.println("fafacaicai");
    }*/

}
class Cycle implements Shape {
    @Override
    public void draw() {

        System.out.println("画一个⚪");
    }
}
class React implements  Shape {
    @Override
    public void draw() {
        System.out.println("画一个♦");
    }
}

public class TestDemo {
    public static void drawMap(Shape shape){
        shape.draw();
    }
    public static void main(String[] args) {
      Shape shape=new Cycle();
      Shape shape2=new React();
      drawMap(shape);
      drawMap(shape2);

    }
}
