import java.util.Arrays;

/**
 * @author 张瑞瑞
 * @date 2020/05/25 20:12
 * 缺点：每次业务不同需要修改类本身。
 * 重点：自定义类型 为什么要实现可比较的
 */
class Student implements Comparable <Student>{
    public String name;
    public int age;
    public int score;

    public Student(String name, int age, int score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }

    @Override
    public int compareTo(Student o) {
       // return this.age -o.age;
        return this.score-o.score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", score=" + score +
                '}';
    }
}
public class TestDemo2 {
    public static void main(String[] args) {
        Student student1=new Student("bit",16,89);
        Student student2=new Student("gaobo",26,66);
        Student student3=new Student("liigost",18,100);
        Student []students=new Student[3];
        students [0]=student1 ;
        students [1]=student2 ;
        students [2]=student3 ;
        Arrays.sort(students);
        System.out.println(Arrays.toString(students ) );

    /*if(student1 .compareTo(student2 )>0 ){
        System.out.println(">");
    }*/
    }
}
