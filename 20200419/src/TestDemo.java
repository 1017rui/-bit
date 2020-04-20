/**
 * @author 张瑞瑞
 * @date 2020/04/19 14:12
 */
//设计一个算术类，包含加法减法乘法除法运算方法。
/*
class Calculator{
    private int num1;
    private int num2;

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public int  add(){
        return this.num1+this.num2;
    }
    public int sub(){
        return this.num1-this.num2;
    }
    public int mul(){
        return this.num1*this.num2;
    }
    public double div(){
        return (double)this.num1/this.num2;
    }
}
public class TestDemo{
    public static void main(String[] args) {
        Calculator cal=new Calculator();
        cal.setNum1(9);
        cal.setNum2(3);
        System.out.println(cal.add());
        System.out.println(cal.sub());
        System.out.println(cal.mul());
        System.out.println(cal.div());
    }
}
*/
//实现交换两个变量的值，要求交换实参的值
   /* class MyValue{
        private int val;

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }
}
public class TestDemo{
        public static void swap(MyValue myValue1,MyValue myValue2){
            int tmp= myValue1.getVal();
            myValue1.setVal( myValue2.getVal());
            myValue2.setVal(tmp);
        }
    public static void main(String[] args) {
        MyValue myValue1=new MyValue();
        myValue1.setVal(10);
        MyValue myValue2=new MyValue();
        myValue2 .setVal(20);
        System.out.println("交换之前：");
        System.out.println(myValue1.getVal() );
        System.out.println(myValue2.getVal());
        swap(myValue1,myValue2);
        System.out.println("交换之后：");
        System.out.println(myValue1.getVal() );
        System.out.println(myValue2.getVal());
    }
}*/
   class MyValue{

       public int val;

}
public class TestDemo{

       public static void swap(MyValue myValue1,MyValue myValue2){
            int tmp=myValue1.val;
            myValue1.val=myValue2.val;
            myValue2.val=tmp;
    }
    public static void main(String[] args) {
        MyValue myValue1=new MyValue();
        myValue1.val=10;

        MyValue myValue2=new MyValue();
        myValue2 .val=20;

        System.out.println("交换之前：");
        System.out.println(myValue1.val );
        System.out.println(myValue2.val);

        swap(myValue1,myValue2);

        System.out.println("交换之后：");
        System.out.println(myValue1.val);
        System.out.println(myValue2.val);
    }
}






