/**
 * @author 张瑞瑞
 * @date 2020/05/04 13:20
 * 抽象类
 * 1.抽象类不能够被实例化
 * 2.类内的数据成员和普通类没有区别
 * 3.抽象类主要是用来继承的
 * 4.如果一个类继承了这个抽象方法，那么这个类必须重写抽象类当中的抽象方法
 * 5.当抽象类A继承了抽象类B，那么A可以不重写B中的方法，但是一旦A要是在被继承，那么一定还是要重写这个抽象方法
 * 6.抽象类和抽象方法一定不能被final修饰
 *
 */
abstract class Shape1{
    public int size;
    public String color;
    public void func() {

    }
    public abstract  void draw();
}
class Rect1 extends Shape1{
    @Override
    public void draw() {
        System.out.println("画一个♦");
    }
}
class Cycle1 extends Shape1{
    @Override
    public void draw() {
        System.out.println("画一个⚪");
    }
}
public class TestAbstract {
    public static void drawMap(Shape1 shape){
        shape.draw();
    }
    public static void main(String[] args) {
        //Shape1 shape =new Shape1();//error
        Shape1 shape1=new Cycle1();
        Shape1 shape2=new Rect1();
        drawMap(shape1) ;
        drawMap(shape2) ;
        shape1.draw();

    }
}
