package com.bit.Demo3;

/**
 * @author 张瑞瑞
 * @date 2020/04/28 20:22
 *
 * 多继承
 * 接口可以解决多继承的关系
 */
class Animal{
    protected String name;
    public Animal(String name) {
        this.name = name;
    }
}

interface IFlying{//一般是动词
    void fly();
}
interface IRunning{
    void run();
}
interface ISwimming{
    void swim();
}
//一个类可以继承一个普通类/抽象类，并且可以同时实现多个接口
//先extends在implement
class Cat extends Animal implements IRunning {
    public Cat(String name) {
        super(name);
    }
    @Override
    public void run() {
        System.out.println(this.name + "正在用四条腿跑");
    }
}
class Fish extends Animal implements ISwimming {
    public Fish(String name) {
        super(name);
    }

    @Override
    public void swim() {
        System.out.println(this.name + "正在用尾巴游泳");
    }
}
class Frog extends Animal implements IRunning,ISwimming{
    public Frog(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println(this.name + "正在游泳！");
    }

    @Override
    public void swim() {
        System.out.println(this.name + "正在跑！");
    }
}
class Robot implements IRunning {//机器人
    @Override
    public void run() {
        System.out.println("我是机器人，我正在跑！");
    }
}
public class TestMoreExtends {
    public static void walk(IRunning running) {
        System.out.println("我带着伙伴去散步");
        running.run();
    }

    public static void main(String[] args) {
        IRunning irunning =new Robot() ;
        walk(irunning);
        IRunning frog =new Frog("青青") ;
        walk(frog);
    }
}
