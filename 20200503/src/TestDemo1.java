/**
 * @author 张瑞瑞
 * @date 2020/05/03 18:18
 * 封装  用private修饰字段或方法
 */
class Student{
    private String name;
    private int age;

    public Student() {
       //this("bit",18);//this调用构造函数  且置能调用一次  且只能放在第一行
        this.name = name;
        this.age = age;
        System.out.println("Student()");
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Student(String ,int)");
    }

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
//重写object的toString方法
    @Override//注解
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
public class TestDemo1 {
    public static void main(String[] args) {
        //没有引用的对象称为匿名对象
        //匿名对象只能在创建对象时使用
        // 匿名对象  只能使用一次
        new Student().setName("caocao") ;
        System.out.println(new Student());

        new Student().setAge(12) ;
        System.out.println(new Student());

        System.out.println(new Student());


    }
    public static void main2(String[] args) {
        Student student1=new Student();
        //System.out.println(student1);
        Student student2=new Student("张瑞瑞",20);
        //System.out.println(student2);

    }
    public static void main1(String[] args) {
        Student stu=new Student();
        stu.setName("张瑞") ;
        stu.setAge(18) ;
        System.out.println(stu);
    }
}
