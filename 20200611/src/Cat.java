import java.math.BigInteger;
import java.util.Scanner;

/**
 * @author 张瑞瑞
 * @date 2020/06/14 21:08
 */
/*abstract class Animal{
    abstract void say();
}
public class Cat extends Animal {
    //如果一个类继承了抽象类，那么这个类必须重写抽象类的方法
    public Cat(){
        System.out.println("i am a cat");
    }
    public static void main(String[] args) {
        Cat cat=new Cat();
    }

   @Override
    void say() {

    }
}*/
public class Cat{
    public static String AddLongInteger(String addend,String augend){
        BigInteger sum1=new BigInteger(addend);
        BigInteger sum2=new BigInteger(augend);
        BigInteger sum=sum1.add(sum2);
        return sum.toString() ;
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String addend=scan.nextLine();//加数
        String augend=scan.nextLine();//被加数
        /*BigInteger sum1=new BigInteger(addend);
        BigInteger sum2=new BigInteger(augend);
        BigInteger sum=sum1.add(sum2);
        System.out.println(sum);*/
        String result=AddLongInteger(addend,augend);
        System.out.println(result);
    }
    public static String AddLongInteger1(String addend,String augend){
        StringBuffer sb=new StringBuffer();
        //sb.insert(0,)
        while(true){
            int num1 = 0;
            int num2 = 0;
            int i=addend .length()-1;
            if(i!=-1)  {
                num1=Integer .parseInt(addend.charAt(i--)+"");
            }else{
                break;
            }
            int j=augend .length()-1;
            if(j!=-1)  {
                num2=Integer .parseInt(addend.charAt(j--)+"");
            }else{
                break;
            }
            int ret=0;
            int sum=num1+num2+ret;
            if(sum<=9){
                sb.insert(0, sum) ;
                ret=0;
            }else{
                sb.insert(0,sum%10) ;
                ret=sum/10;
            }
        }
        return sb.toString() ;
    }
    public static void main3(String[] args){
        Scanner scan=new Scanner(System.in);
        String addend=scan.nextLine();//加数
        String augend=scan.nextLine();//被加数
        String result=AddLongInteger(addend,augend);
        System.out.println(result);
    }

    public static void main2(String[] args){
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();//列
        String ch=scan.next();
        int row= (n%2==1)?(n/2+1):(n/2);

        for(int i=0;i<row;i++){
            for(int j=0;j<n;j++){
                if(i==0 || i==row-1){
                    System.out.print(ch);
                }else{
                    if(j==0 || j==n-1){
                        System.out.print(ch);
                    }else{
                        System.out.print(" ");
                    }

                }
            }
            System.out.println();//换行
        }
    }
    public static void main1(String[] args) {

        int x=20;
        int y=30;
        boolean b;
        b=x>50&&y>60 || x>50&&y<-60 ||x<-50&&y<60 ||x<-50&&y<-60;
        System.out.println(b);
    }
}