package com.bit.demo1;

/**
 * @author 张瑞瑞
 * @date 2020/04/27 18:38
 */
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

class Cat extends Animal{
  /*  public String name;
    public void eat(){
        System.out.println(this.name+"Cat::eat()");
    }*/
  public Cat(String name){
      //super.name="haha";///这样的话没有调用父类的构造方法
      super(name);//调用父类的构造方法//显式调用
//      super.eat();//访问父类的eat方法
//      super.name;//访问父类的name属性
      System.out.println("Cat(String)");
  }
}
  class ChineseGardenCat extends Cat{

    public ChineseGardenCat(String name) {
        super(name);
    }
}
class Orange extends ChineseGardenCat {

    public Orange(String name) {
        super(name);
    }
}
class Bird extends Animal{
//alt+enter
    public Bird(String name) {
        super(name);
    }

    /* public String name;
        public void eat(){
            System.out.println("Bird::eat()");
        }*/
    public void fly(){

        System.out.println(this.name+"Bird::fly()");
    }
}

public class TestDemo {
    public static void main(String[] args) {

    }
    public static void main2(String[] args) {
        ChineseGardenCat chineseGardenCat=new ChineseGardenCat("haha");
        chineseGardenCat.eat();
    }
    public static void main1(String[] args) {
        Cat cat=new Cat("mimi");
        cat.name="mimi";
        cat.eat();
        //cat.sleep();
        Bird bird =new Bird("八哥");
        bird.fly();
        bird.eat();
    }

}
