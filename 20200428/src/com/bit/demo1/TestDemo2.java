package com.bit.demo1;

/**
 * @author 张瑞瑞
 * @date 2020/04/28 18:56
 */
//理解多态
    class Shape{
        public void draw(){

        }
}
class Cycle extends Shape{
    @Override
    public void draw() {

        System.out.println("画一个⚪");
    }
}
class React extends Shape{
    @Override
    public void draw() {
        System.out.println("画一个♦");
    }
}
class Triangle  extends Shape{
    @Override
    public void draw() {
        System.out.println("画一个🔺");
    }
}
class Flower extends Shape{

    @Override
    public void draw() {
        System.out.println("画一个❀");
    }
}
public class TestDemo2 {

     /*   //什么是多态？
    //多态发生的前提：
    1.父类引用 引用子类对象
    2.父类和子类有同名的覆盖方法
    3.通过父类引用代用这个重写的方法的时候*/
        public static void drawMap(Shape shape){
            shape.draw();
        }
    public static void drawShapes() {
        //我们创建了一个 Shape 对象的数组.
        Shape[] shapes = {new Cycle(), new React(), new Cycle(),new Triangle(),new Flower()};
        for (Shape shape : shapes) {
            shape.draw();
        }
    }
    public static void main(String[] args) {
       /* Shape shape1=new Cycle();
        Shape shape2=new React();
        *//*shape1.draw() ;
        shape2.draw() ;*//*
        drawMap(shape1);
        drawMap(shape2);
        Shape shape3=new Triangle();
        drawMap(shape3);*/
        drawShapes() ;
    }

}
