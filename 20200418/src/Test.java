import java.util.Arrays;

/**
 * @author 张瑞瑞
 * @date 2020/04/18 12:11
 */
/*//编写一个类Calculator,有两个属性num1,num2,这两个数据的值，不能在定义的同时初始化，
// 最后实现加减乘 除四种运算.
    class Calculator{
        private int num1;
        private int num2;

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public int  add(int num1, int num2){
        return num1+num2;
    }
    public int sub(int num1,int num2){
        return num1-num2;
    }
    public int mult(int num1,int num2){
        return num1*num2;
    }
    public double div(int num1,int num2){
        if(num2==0){
            return -1;
        }
        return (double)num1/num2;
    }

}
public class Test {
    public static void main(String[] args) {
        Calculator cal=new Calculator();
        cal.setNum1(9);
        cal.setNum2(3);
        System.out.println(cal.add(cal.getNum1(), cal.getNum2() ));
        System.out.println(cal.sub(cal.getNum1(), cal.getNum2() ));
        System.out.println(cal.mult(cal.getNum1(), cal.getNum2() ));
        System.out.println(cal.div(cal.getNum1(), cal.getNum2() ));
    }
}*/
/*//设计一个包含多个构造函数的类，并分别用这些构造函数来进行实例化对象
    class Student{
        private String name;
        private int age;
        public Student(){
            this.name="zhubajie";
            this.age=50;
            System.out.println("Student()");
        }
        public Student(String name){
            this.name=name;
            System.out.println("Student(String)");
        }
        public Student(int age){
            this.age=age;
            System.out.println("Student(int)");
        }
        public Student(String name,int age){
            this.name=name;
            this.age=age;
            //System.out.println("Student(String,int)");
        }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
public class Test{
    public static void main(String[] args) {
        Student stu1=new Student();
        System.out.println(stu1);
        Student stu2=new Student("zhangfei");
        Student stu3=new Student(999);
        Student stu4=new Student("caocao",1000);
        System.out.println(stu4);

    }
}*/
   // 实现交换两个变量的值。要求：需要交换实参的值。?
    /*class Num{
        private int num1;
        private int num2;

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }
    @Override
    public String toString() {
        return "Num{" +
                "num1=" + num1 +
                ", num2=" + num2 +
                '}';
    }
}
public class Test{
    public static void main(String[] args) {
        Num num=new Num();
        num.setNum1(23);
        num.setNum2(45);
        System.out.println("交换之前："+num);
        int tmp=num.getNum1() ;
        num.setNum1(num.getNum2() );
        num.setNum2(tmp);
        System.out.println("交换之后："+num);
    }
    }
*/
/*public class Test{
    static boolean Paddy;
    public static void main(String args[]){
        System.out.println(Paddy);
    }
}*/
/*
class Hest {

    public String toString() {

        System.out.print("aaa");

        return "bbb";

    }
}
public class Test {
    public static void main(String[] args) {
        System.out.println(new Hest());
    }
}

*/
//给定整型数组, 把所有的偶数放到数组前面, 把所有奇数放到数组后面.
/*
public class Test{
    public static void adjustOrder(int []array){
        int left=0;
        int right=array.length-1;
        while(left<right){
            while(left<right&&array[left]%2==0){
                left++;
            }//跳出循环时在右边找到一个奇数
            while(left<right&&array[right]%2!=0){
                right--;
            }//跳出循环时在右边找到一个偶数
            if(left<right){
                int tmp=array[left];
                array[left]=array[right];
                array[right]=tmp;
            }
        }
    }
    public static void main(String[] args) {
        int[]array={1,2,3,4,5,6,7,8,9,10};
        adjustOrder(array);
        System.out.println(Arrays.toString(array));
    }
}
*/
//给定两个整型数组, 交换两个数组的内容.
/*
public class Test{
    public static void swap(int[]array1,int[]array2){
        int len=array1.length;
        for(int i=0;i<len;i++){
            int tmp=array1[i];
            array1[i]=array2[i];
            array2[i]=tmp;
        }
    }
    public static void main(String[] args) {
        int[]array1={1,2,3,4,5};
        int[]array2={6,7,8,9,10};
        swap(array1,array2);
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
    }
}*/
/*
public class Test {
    public  int aMethod(){
      static int  i = 0;
        i++;
        return i;
    }
    public static void main(String args[]){
        Test test = new Test();
        test.aMethod();
        int j = test.aMethod();
        System.out.println(j);
}
}*/
public class Test{

    private int count;

    public static void main(String[] args) {

        Test test=new Test(88);

        System.out.println(test.count);

    }

    Test(int a) {

        count=a;

    }

}
