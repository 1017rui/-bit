import java.util.Arrays;

/**
 * @author 张瑞瑞
 * @date 2020/05/04 16:56
 * 接口的实例
 * 自定义类型进行比较 需要是  可比较的
 * Comparable Comparator
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
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", score=" + score +
                '}';
    }

    @Override
    public int compareTo(Student o) {//指定比较方式
        if(this.age>o.age){
            return 1;
        }else if(this.age==o.age){
            return 0;
        }else{
            return -1;
        }
       // return 0;
    }
}
public class TestDemo {
    public static void main(String[] args) {
        Student student1=new Student("bit",18,76);
        Student student2=new Student("gao",29,96);
        Student student3=new Student("chuyi",17,56);
       /* if(student1.compareTo(student2)<0 ){
            System.out.println("学生1的年龄小于学生2的年龄！");
        }*/
        Student[]students=new Student[3];
        students[0]=student1;
        students[1]=student2;
        students[2]=student3;
        Arrays.sort(students);
        System.out.println(Arrays.toString(students));


    }

    public static void main1(String[] args) {
        int[]array={21,32,14,31,27,40,35};
        Arrays.sort(array);//从大到小排序
        System.out.println(Arrays.toString(array));
    }
}
