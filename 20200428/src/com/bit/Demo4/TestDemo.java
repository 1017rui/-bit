package com.bit.Demo4;

import java.util.Arrays;

/**
 * @author 张瑞瑞
 * @date 2020/04/28 20:59
 * 一般情况下：自定义类型进行比较需要是可比较的
 * Comparable Comparator 是有区别的！！！
 */
class Student implements Comparable<Student>{
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
    public int compareTo(Student o) {
        if(this.score>o.score){
            return 1;
        }else if(this.score==o.score){
            return 0;
        }else{
            return -1;
        }
    }
}
public class TestDemo {
    public static void main(String[] args) {
      Student student1=new Student("bit",18,70);
        Student student2=new Student("gaobo",28,60);
        Student student3=new Student("sasa",17,99);
      /* if(student1.compareTo(student2)<0 ){
            System.out.println("student1的年龄<student2");
        }*/
        Student[]students=new Student[3];
        students[0]=student1;
        students[1]=student2;
        students[2]=student3;
        Arrays.sort(students);
        System.out.println(Arrays.toString(students));





    }
}
