/**
 * @author 张瑞瑞
 * @date 2020/06/26 20:28
 */
/*
import java.util.Scanner;

public class Main2{
    public static int commonDiv(int b,int c){
        int ret=b%c;
        while(ret!=0){
            b=c;
            c=ret;
            ret=b%c;
        }
        return c;
    }
    public static int func(int a,int n,int[] arr){
        int c=a;
        for(int b:arr){
            if(b<=c){
                c+=b;
            }else{
                c+=commonDiv(b,c);
            }
        }
        return c;
    }
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        while(scan.hasNext()){
            int n=scan.nextInt();//怪兽的数量
            int a=scan.nextInt();//小易的初始能力值
            int[] arr=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=scan.nextInt();//分别输入n个怪兽的防御力
            }
            int ret=func(a,n,arr);
            System.out.println(ret);
        }
    }
}*/
import java.util.Scanner;
class Student{
    public int id;
    public int score;

    public Student(int id, int score) {
        this.id = id;
        this.score = score;
    }
    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
class Operation{
    public String type;
    public int a;
    public int b;

    public Operation(String type, int a, int b) {
        this.type = type;
        this.a = a;
        this.b = b;
    }
}
public class Main2{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        while(scan.hasNext()){
            int N=scan.nextInt();//学生数目
            int M=scan.nextInt();//操作数目
            Student[] students=new Student[N];
            for(int i=0;i<N;i++){
                students[i]=new Student((i+1),scan.nextInt());//id是从1开始
            }
            Operation[] operations =new Operation[M];
            for(int i=0;i<M;i++){
                operations[i]=new Operation(scan.next(),scan.nextInt() ,scan.nextInt() ) ;
            }

            for(int i=0;i<M;i++){
                if(operations[i].type.equals("Q")){
                    //查询操作
                    int max=Math.max(operations [i].a,operations [i].b);
                    int min=Math.min(operations [i].a,operations [i].b)-1;
                    int maxScore=0;
                    while(min !=max ){
                        maxScore=Math.max(maxScore,students[min].getScore()) ;
                        min++;
                    }
                    System.out.println(maxScore);
                }else if(operations[i].type.equals("U")){
                    //更新操作
                    students[operations[i].a-1].setScore(operations[i].b );
                }
            }
        }
    }
}