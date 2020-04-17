import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

/**
 * @author 张瑞瑞
 * @date 2020/04/16 19:49
 */
//public （共有的）访问修饰限定符 private(私有的) protected(受保护的) 啥也不写 默认权限
class Person{//类名大驼峰
    //字段->成员变量  定义在方法外面，类里面
    // 实例成员变量在对象里面
    //实例成员没有像初始化默认值为0，引用类型默认为null，简单类型默认为0
    // char->'\u0000'boolean->false
    public String name;
    public int age;
    public static int size;//静态成员 不属于对象 属于类
    //public boolean flag;
    //public char a;
    //方法 ->行为  一个类由字段和方法共同组成

    //实例成员方法
    public void eat(){

        System.out.println("eat()!");
    }
    public void sleep(){

        System.out.println("sleep()!");
    }
    public static void fun1()
    {
        System.out.println("static::fun1");
        //age=10;
        size=10;
    }
   public void show() {

        System.out.println("我叫" + name + ", 今年" + age + "岁");
    }

}
public class TestDemo2 {
    public static void main(String[] args) {
        //实例化一个对象 通过关键字new
        Person per=new Person();
        //per.eat();//访问成员方法
        //per.sleep();
        //System.out.println(per.a);
        //System.out.println(per.flag);
        //System.out.println(  per.name );
        //如何访问静态成员变量？
        //类名.静态成员变量
      //  System.out.println(per.size);//错的
       // System.out.println(Person.size);
        //如何访问静态方法？
        //类名.方法名
//        per.fun1();
//        Person.fun1();
        per.name="zhangruirui";
        per.age=20;
        per.show();

    }
}
