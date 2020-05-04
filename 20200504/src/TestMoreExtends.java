/**
 * @author 张瑞瑞
 * @date 2020/05/04 15:19
 * 多继承  接口解决多继承的问题
 */
class Animal{
    protected String name;
    public Animal(String name){
        this.name=name;
    }
}
interface IFlying{//接口名字以动词为主
    void fly();
}
interface IRunning{
    void run();
}
interface ISwimming{
    void swim();
}
class Cat extends Animal implements IRunning{
    public Cat(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println(this.name+" 正在用四条腿跑！");
    }
}
class Fish extends Animal implements ISwimming{
    public Fish(String name) {

        super(name);
    }

    @Override
    public void swim() {

        System.out.println(this.name+" 正在用尾巴游泳！");
    }
}
class Duck extends Animal implements IRunning,ISwimming ,IFlying{
    public Duck(String name) {
        super(name);
    }

    @Override
    public void fly() {

        System.out.println(this.name+" 正在用翅膀飞! " );
    }

    @Override
    public void run() {

        System.out.println(this.name+" 正在用两条腿跑！");
    }

    @Override
    public void swim() {
        System.out.println(this.name+" 正在用脚掌游泳！");
    }
}
class Robot implements IRunning{
    @Override
    public void run() {
        System.out.println("我是机器人，我在用腿跑！");
    }
}
public class TestMoreExtends {
    public static void walk(IRunning irunning){
        irunning .run();

    }
    public static void swim(ISwimming iswimming){
        iswimming.swim() ;
    }

    public static void main(String[] args) {
        Cat cat=new Cat("mimi");
        walk(cat);
        Duck duck=new Duck("yaya");
        walk(duck);
        swim(duck);
    }
    public static void main1(String[] args) {
        IRunning irunning =new Robot() ;
       walk(irunning);
       IRunning irunning1=new Duck("鸭鸭");
       walk(irunning1 );
       ISwimming iswimming=new Duck("鸭鸭");
       swim(iswimming);
    }
}
