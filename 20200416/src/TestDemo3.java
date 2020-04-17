/**
 * @author 张瑞瑞
 * @date 2020/04/16 20:56
 */
//封装 用private  没有特殊要求属性都设置为私有的
//为什么封装？

class Student {
    //限定你只能在类中访问
    //如果没有特殊要求尽量所有的属性都设置为私有
    private String name;//封装 就是用private修饰属性
    private int age;
    //提供一个公开的接口

    //快捷键  alt+insert 选中所有属性需按住shift键
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private void fun1() {
        System.out.println("fun1()");
    }

    public void show() {
        System.out.println("我叫" + this.name + ", 今年" + age + "岁");
    }

    //快捷键同上
    //重新实现了一下 Object类的toString()方法
    //object是所有类的父类。
    @Override//注解：指的是这个方法是重新写的  重写
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
//以上是类的实现者写的代码

//以下是类的调用者
public class TestDemo3 {
    public static void main(String[] args) {
        Student student=new Student();
       /* student.setName("zhangruirui");
        String str=student.getName();
        System.out.println(str);*/
      // student.age=20;
        //student.show();
        System.out.println(student);//Student{name='zhangruirui', age=0}
        String str2=student.toString();
        System.out.println(str2);//Student{name='zhangruirui', age=0}

    }
}
