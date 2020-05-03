/**
 * @author 张瑞瑞
 * @date 2020/05/03 17:54
 * 类和对象，
 */
class Person{
    //字段
    public int age=20;//实例成员变量
    public String name="张三";
    public String sex="女";
    public int a;
    public static int count ;//静态成员变量
    //实例方法
    public void eat(){
        System.out.println("吃饭！");
    }
    public void sleep(){
        System.out.println("睡觉！");
    }
    //静态方法
    public static void func(){
       //  a=99;//error在静态方法中不能访问非静态的数据成员和方法，只能访问静态的。
        count=100;
        System.out.println("func(static)");
    }
    public void show(){

        System.out.println("我叫"+this.name+"，是一个"+this.sex+"生，今年"+this.age+"岁。");
    }


}

public class TestDemo {
    public static void main(String[] args) {
        Person person1=new Person();
        person1.a++;
        Person.count++;
        System.out.println(person1.a);//1
        System.out.println(Person.count);//1
        System.out.println("=========================");
        Person person2=new Person();
        person2.a++;
        Person.count++;
        System.out.println(person2.a);//1
        System.out.println(Person.count);//2说明静态成员变量只有一份。
       Person.func() ;//通过 类名.方法名 进行访问静态方法  无需创建一个一个对象
        System.out.println(Person.count);
    }
    public static void main1(String[] args) {
        Person per=new Person();//通过new关键字实例化 一个对象。
       /* per.eat() ;//对象名.方法名 调用实例方法
        per.sleep() ;
        System.out.println(per.name);
        System.out.println(per.age);
        System.out.println(per.sex);*/
       per.show() ;
       per.name="张瑞";
       per.show();
    }
}
