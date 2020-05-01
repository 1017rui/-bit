import java.util.Arrays;

/**
 * @author 张瑞瑞
 * @date 2020/04/30 18:42
 */
class Money implements Cloneable{
    double money=12.5;
//alt+insert 或 ctrl+o
    //重写了父类的克隆方法
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
class Person implements Cloneable{//实现接口
    public int age;

    Money m=new Money();
    @Override
    protected Object clone() throws CloneNotSupportedException {
        //return super.clone();
        //1.克隆person
        Person p=(Person)super.clone();
        //2.克隆当前的Money对象 m
        //从而达到了深拷贝
        p.m=(Money)this.m.clone();
        return p;
    }
}
public class TestDemo {
    public static void main(String[] args) throws CloneNotSupportedException {
        Person person1=new Person();
        Person person2=(Person)person1.clone();
        System.out.println(person1.m.money);
        System.out.println(person2.m.money);
        System.out.println("==========修改============");
        person2.m.money=99.9;
        System.out.println(person1.m.money);
        System.out.println(person2.m.money);

    }
    public static void main1(String[] args) throws CloneNotSupportedException {
        Person person1=new Person();
        Person person2=(Person)person1.clone();
        System.out.println(person1.age);
        System.out.println(person2.age);
        System.out.println("==========修改============");
        person2.age=99;
        System.out.println(person1.age);
        System.out.println(person2.age);

    }
}
