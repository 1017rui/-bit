/**
 * @author 张瑞瑞
 * @date 2020/05/04 13:04
 * 多态
 * 发生的前提：
 * 1.父类引用 引用子类对象
 * 2.父类和子类有同名的覆盖方法
 * 3.通过父类引用调用这个重写方法的时候就会发生多态
 */
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
class Rect extends Shape{
    @Override
    public void draw() {
        System.out.println("画一个♦");
    }
}
class Flower extends Shape{
    @Override
    public void draw() {
        System.out.println("画一个❀");
    }
}
class Triangle extends Shape{
    @Override
    public void draw() {
        System.out.println("画一个🔺");
    }
}
public class TestPolypeptide {

    //降低圈复杂度
   public static void drawShapes(){
       Shape shapes[]={new Cycle(),new Flower(),new Triangle() ,new Rect() };
       for(Shape shape:shapes){
           shape.draw();
       }
   }
    public static void drawMap(Shape shape){
        shape.draw();
    }
    public static void main(String[] args) {
        /*Shape shape1=new Cycle();
        Shape shape2=new Rect();
        Shape shape3=new Flower();
        drawMap(shape1) ;
        drawMap(shape2) ;
        drawMap(shape3) ;
        Shape shape4=new Triangle() ;
        drawMap(shape4) ;*/
        drawShapes();


    }
}
