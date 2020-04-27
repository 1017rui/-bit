package com.bit.demo3;

/**
 * @author 张瑞瑞
 * @date 2020/04/27 23:30
 */
//多态
class Animal {
    protected String name;
    public Animal(String name){
        this.name=name;
        System.out.println("Animal(String)");
    }

    public void eat() {
        System.out.println(this.name+" Animal::eat()");
    }

    public void sleep() {
        System.out.println("Animal::sleep()");
    }
}

class Cat extends Animal {
    public int count=99;
    public Cat(String name){
        super(name);
        System.out.println("Cat(String)");
    }
    public void eat() {
        System.out.println(this.name+" Cat::eat()");
    }
}
class Bird extends Animal {

    public Bird(String name) {
        super(name);
    }
    public void fly(){
        System.out.println(this.name+"Bird::fly()");
    }
}

public class TestMin {
    //演示不安全的向下转型
    public static void main(String[] args) {
        Animal animal=new Cat("八哥");
        if(animal instanceof Bird) {
            Bird bird = (Bird) animal;
            bird.fly();
        }else
            System.out.println("lalalalala");
    }
    //向下转型
    //非常不安全，很少使用
    public static void main6(String[]args){
        Animal animal=new Bird("八哥");
        animal.eat();
        //向下转型
        Bird bird=(Bird)animal;
        bird.fly();
    }

    /*
    多态
     */
    public static void main5(String[] args) {
        Animal animal=new Cat("咪咪");
        animal .eat();

    }
    public static Animal func(){
        return new Cat("咪咪");
    }
    public static void main4(String[] args) {
        Animal animal=func();
        animal.eat();
    }
    public  static void func(Animal animal){
        animal.eat();
    }
    public static void main3(String[] args) {
    Cat cat=new Cat("咪咪");
     func(cat);
    }
    //向上转型  将子类赋值给父类 父类引用子类对象
    public static void main2(String[] args) {
       Animal animal=new Cat("咪咪");
       animal .eat();

       //animal.count; error 向上转型之后 通过父类的引用只能访问父类的方法或者属性

    }

    public static void main1(String[] args) {
    Animal animal= new Animal("豆豆");
    Cat cat=new Cat("咪咪");
    }
}
