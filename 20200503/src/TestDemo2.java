/**
 * @author 张瑞瑞
 * @date 2020/05/03 19:43
 */
class Calculator{
    private  int num1;
    private  int num2;
//提供一个构造方法 用以初始化
    public Calculator(int num1,int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
    public int add(){
        return this.num1+this.num2;
    }
    public int sub(){
        return this.num1-this.num2;
    }
    public int mul(){
        return this.num1*this.num2;
    }
    public double div(){
        if(num2==0){
            return -1;//表示输入了不合法的数字
        }
        return (double)this.num1/this.num2;
    }
}
public class TestDemo2 {
    public static void main(String[] args) {
        Calculator cal=new Calculator(3,9) ;
        System.out.println(cal.add());
        System.out.println(cal.sub());
        System.out.println(cal.mul());
        System.out.println(cal.div());
        Calculator cal1=new Calculator(8,0) ;
        System.out.println(cal1.add());
        System.out.println(cal1.sub());
        System.out.println(cal1.mul());
        System.out.println(cal1.div());
    }
}
