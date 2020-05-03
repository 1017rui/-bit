/**
 * @author 张瑞瑞
 * @date 2020/05/03 19:58
 */
class Num{
    private int num;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "Num{" +
                "num=" + num +
                '}';
    }
}
public class TestDemo3 {
    public static void swap(Num num1,Num num2){
        int tmp=num2.getNum() ;
        num2.setNum(num1.getNum() );
        num1.setNum(tmp) ;
    }
    public static void main(String[] args) {
        Num num1=new Num();
        Num num2=new Num();
        num1.setNum(10) ;
        num2.setNum(20) ;
        System.out.println(num1);
        System.out.println(num2);
        swap(num1,num2);//交换
        System.out.println(num1);
        System.out.println(num2);
    }
}
