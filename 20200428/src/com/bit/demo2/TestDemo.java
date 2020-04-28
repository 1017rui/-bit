package com.bit.demo2;

/**
 * @author 张瑞瑞
 * @date 2020/04/28 19:43
 */
/*  被abstract修饰，这个方法为抽象方法 可以没有具体的实现
    包含方法的类是抽象类
    注意点：
    1.抽象类不能被实例化
    2.类内的数据成员和普通类没有区别
    3.抽象类主要是用来继承的
    4.如果一个类继承了这个抽象类，那么这个类必须重写抽象类的方法
    5.抽象类A继承抽象类B 那么A 可以不重写B中的方法，
    但是一旦A要是要被继承 那么一定还要重写这个方法
    6.抽象类或者抽象方法 一定不能被final修饰
    */
  abstract class Shape{
    /*  public int age;
      public int a;
      public  void func(){

    }*/
    public abstract void draw();

}
class Cycle extends Shape {
       @Override
       public void draw() {
           System.out.println("画一个⚪");
       }
  }
class React extends Shape {
    @Override
    public void draw() {
        System.out.println("画一个♦");
    }
}
class Triangle  extends Shape {
    @Override
    public void draw() {
        System.out.println("画一个🔺");
    }
}
class Flower extends Shape {

    @Override
    public void draw() {
        System.out.println("画一个❀");
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
