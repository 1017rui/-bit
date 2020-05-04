/**
 * @author 张瑞瑞
 * @date 2020/05/04 13:35
 * 接口Interface
 * 注意的问题：
 * 1.接口当中的方法都是抽象方法
 * 2.但是也可以有具体实现的方法，这个方法是被default修饰的
 * 3.接口当中定义的成员变量默认是常量
 * 4.接口当中的成员变量 默认是 public static final
 * 成员方法 默认是 public abstract
 * 5.接口是不可以被实例化的
 * 6.接口和类之间的关系：implement
 * 7.接口的出现是为了解决Java单继承的问题，可以实现多个接口，以达到和多继承类似的效果
 * 8.只要这个类实现了该接口，那么这个类就可以发生向上转型了
 *
 */
interface IShape{
    void draw();
   //public abstract  void draw();
    //public static final int  a=10;
    /*default void func(){

    }*/

}
class Rect2 implements IShape {
    @Override
    public void draw() {
        System.out.println("画一个♦");
    }
}
class Cycle2 implements IShape {
    @Override
    public void draw() {
        System.out.println("画一个⚪");
    }
}
public class TestInterface {
    public static void drawMap(IShape shape){
        shape.draw();
    }
    public static void main(String[] args) {
      // IShape shape=new IShape() ;//error

        IShape shape1=new Rect2();
        IShape shape2=new Cycle2();
        drawMap(shape1) ;
        drawMap(shape2) ;
    }
}
