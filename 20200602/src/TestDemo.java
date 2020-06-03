/**
 * @author 张瑞瑞
 * @date 2020/06/02 16:52
 */
class Student{
    //私有属性name
    private String name = "bit";
    //公有属性age
    public int age = 18;
    //不带参数的构造方法
    public Student(){
        System.out.println("Student()");
    }
    private Student(String name,int age) {
        this.name = name;
        this.age = age;
        System.out.println("Student(String,name)");
    }
    private void eat(){
        System.out.println("i am eat");
    }
    public void sleep(){
        System.out.println("i am pig");
    }
    private void function(String str) {
        System.out.println(str);
    }
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
public class TestDemo {
    public static void main(String[] args) {
       // Student student =new Student("zhang",12);error
        //拿到class对象的三种方式：
        //1.
        Class c1=null;
        try {
            c1=Class.forName("Student") ;
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        //2.
        Class c2=Student .class;
        //3.
        Student s1=new Student();
        Class c3=s1.getClass() ;

        System.out.println(c1==c2);
        System.out.println(c3==c2);
        System.out.println(c1==c3);


    }
}
