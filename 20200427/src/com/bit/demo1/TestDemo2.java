package com.bit.demo1;

/**
 * @author 张瑞瑞
 * @date 2020/04/27 22:29
 */
class Base{
    public int a;
}
class Derive extends Base{
    public int b;
}
public class TestDemo2 {
    public static void main(String[] args) {
        Derive derive = new Derive();
        derive.a=99;
    }
}
