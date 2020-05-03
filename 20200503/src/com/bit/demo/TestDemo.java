package com.bit.demo;

/**
 * @author 张瑞瑞
 * @date 2020/05/03 20:42
 * 继承8
 */
class Animal{
    protected  String name;
    public Animal(String name){
        this.name=name;
        System.out.println("Animal<String>");
    }
    public void eat(){
        System.out.println(this.name+" Animal::eat()");
    }
    public void sleep(){
        System.out.println(this.name+" Animal::sleep()");
    }
}
class Cat extends Animal{
    public int count;
    public Cat(String name) {
        super(name);//必须放在第一行  显式调用    子类在构造是要先帮父类进行构造
        System.out.println("Cat<String>");

    }
    //一个子类只能继承一个父类，在Java当中是单继承。

}
 /*final class ChineseGardCat extends Cat{//final修饰的类称为 密封类 不能再被继承了。

    public ChineseGardCat(String name) {
        super(name);
    }
}*/
/*class Orange extends ChineseGardCat {

    public Orange(String name) {
        super(name);
    }
}*/
class Bird extends Animal{

    public Bird(String name) {
        super(name);
    }

    public void fly(){
        System.out.println(this.name+" Bird::fly()");
    }
}
public class TestDemo {
    //返回值的方式发生向上转型
    public static Animal func() {
        /*Cat cat=new Cat("猫咪咪");
       return cat;*/
        return new Cat("咪咪");
    }
    public static void main(String[] args) {
        Animal animal=func();
    }
    //传参的形式进行向上转型
    public static void func(Animal animal){
        animal.eat();
    }
    public static void main4(String[] args) {
        Cat cat=new Cat("猫咪咪");
        func(cat);
    }
    //直接赋值的方式进行向上转型
    public static void main3(String[] args) {
        //向上转型
        //父类引用 引用子类对象
        Animal animal=new Cat("咪咪");//将子类赋值给父类
        animal.eat();
        //animal.count;//error 向上转型之后，父类引用只能引用父类自己的
    }
    public static void main2(String[] args) {
       /* ChineseGardCat  chinesegardcat=new ChineseGardCat("中华田园猫") ;
        chinesegardcat.eat();*/
    }
    public static void main1(String[] args) {
        Cat cat=new Cat("mimi");
        //cat.name ="mimi";
        cat.eat();
        cat.sleep();
        Bird bird=new Bird("bage");
        bird.eat();
        bird.fly();
    }
}
