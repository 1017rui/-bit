package com.bit.demo;

/**
 * @author 张瑞瑞
 * @date 2020/05/03 22:01
 * 多态
 */
class Animal1{
    protected  String name;
    public Animal1(String name){
        this.name=name;
        eat();
       // System.out.println("Animal<String>");
    }
    public void eat(){
        System.out.println(this.name+" Animal::eat()");
    }
    public void sleep(){
        System.out.println(this.name+" Animal::sleep()");
    }
}
class Cat1 extends Animal1{

    public Cat1(String name) {
        super(name);
      //  System.out.println("Cat<String>");

    }

    public void eat(){
        System.out.println(this.name+" Cat::eat()");
    }
}
class Bird1 extends Animal1{

    public Bird1(String name) {
        super(name);
    }

    public void fly(){
        System.out.println(this.name+" Bird::fly()");
    }
}
public class TestDemo1 {
    //在构造方法中也会发生运行时绑定
    public static void main(String[] args) {
        Cat1 cat =new Cat1("mimi");
        //cat.eat();
    }
    public static void main3(String[] args) {
        //演示不安全的向下转型
        Animal1 animal=new Cat1("咪咪");
        animal.eat();
        if(animal instanceof Bird1) {
            Bird1 bird = (Bird1) animal;
            bird.fly();
        }
        else
            System.out.println("lalalalalala");
    }
    public static void main2(String[] args) {
        Animal1 animal =new Bird1("八哥");
        animal.eat();
        //向下转型  把父类的引用 赋值给了子类
        Bird1 bird=(Bird1)animal;
        bird.fly();
    }
    //发生了运行时绑定（动态绑定）
   // 父类引用引用子类对象  同时 通过父类调用同名的覆盖方法  此时就会发生运行时绑定。
    public static void main1(String[] args) {
        Animal1 animal=new Cat1("咪咪");
        animal.eat();
    }
}
