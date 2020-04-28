package com.bit.demo1;

/**
 * @author 张瑞瑞
 * @date 2020/04/28 18:41
 */
class Animal{
    public String name;
    public Animal(String name){
        this.name=name;
    }
    public void eat(){
        System.out.println(this.name+"正在吃！Animal");
    }
}
class Cat extends Animal{

    public String huzi;

    public Cat(String name,String huzi) {
        super(name);//子类在构造的时候，一定要先帮助父类构造。
        this.huzi=huzi;
    }

    //向上转型 将子类赋值给父类

    public void func(){
        System.out.println(this.name);
    }
    public void eat(){
        System.out.println(this.name+"正在吃！Cat");
    }
}
public class TestDemo1 {
    public static void main(String[] args) {
        /*Cat cat=new Cat();
        cat.eat();*/
        //父类引用 引用父类对象  向上转型
        Animal animal=new Cat("初一","胡子");
        animal.eat();  //发生了运行时绑定（运行时多态）（动态绑定）  建立在重写（顾名思义 一模一样）上

    }
}
