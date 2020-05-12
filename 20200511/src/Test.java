import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author 张瑞瑞
 * @date 2020/05/12 0:07
 */
class Student{
    private String name;
    private String grade;
    private double attribute;

    public Student(String name, String grade, double attribute) {
        this.name = name;
        this.grade = grade;
        this.attribute = attribute;
    }
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", grade='" + grade + '\'' +
                ", attribute=" + attribute +
                '}';
    }
}
public class Test {
    public static List<Character > func(String str1,String str2){
        List<Character> list=new ArrayList<>() ;
        for(int i=0;i<str1.length();i++){
            char ret=str1.charAt(i);
            if(!str2.contains(ret+"" ) ){
                list.add(ret);
            }
        }
        return list;
    }
    public static void main(String[] args) {
        String str1 = "welcome to bit";
        String str2 = "come";
        List<Character> list = func(str1, str2);
        for (char ch : list) {//放的是字符
            System.out.print(ch);
        }
        //System.out.println(list);
}
    public static void main2(String[] args) {
        List<Integer>list=new ArrayList<>();
        list.add(12) ;
        list.add(24) ;
        list.add(7) ;
        list.add(46) ;
        list.add(33) ;
        System.out.println(list);
        Collections .sort(list);
        System.out.println("=====================");
        System.out.println(list);

    }
    public static void main1(String[] args) {
        Student student1=new Student("张三","火箭一班",90);
        Student student2=new Student("李四","火箭二班",80);
        Student student3=new Student("王五","火箭三班",89);
        List<Student> list=new ArrayList<>();
          list .add(student1);
          list .add(student2);
          list .add(student3);
        System.out.println(list);

    }
}
