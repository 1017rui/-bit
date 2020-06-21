/**
 * @author 张瑞瑞
 * @date 2020/06/21 18:52
 */
/*
import java.util.Scanner;

public class Main1{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int count=scanner.nextInt();
        while(count-->0){
            int n=scanner.nextInt();
            int k=scanner.nextInt();
            int[] array=new int[2*n];
            for(int i=0;i<2*n;i++){
                int tmp=i;
                for(int j=0;j<k;j++){
                    if(tmp<n){
                        tmp=2*tmp;
                    }else{
                        tmp=2*(tmp-n)+1;
                    }
                }
                array[tmp]=scanner.nextInt();
            }
            //打印
            for(int i=0;i<2*n;i++){
                System.out.print(array[i]+" ");
            }
        }
    }
}

 */
import java.util.*;
//定义类表示学生
class Person {
    public String name;
    public int score;
    public Person(String name,int score){
        this.name=name;
        this.score=score;
    }
}
public class Main1{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int flg=scanner.nextInt();
        List<Person> list=new ArrayList<>();
        while(n-->0){
            String name=scanner.next();
            int score=scanner.nextInt();
            list.add(new Person(name,score));//将输入的信息存储在list当中
        }
        if(flg==0){//降序  利用集合的sort方法自定义一个比较器
            list.sort((o1,o2)->o2.score -o1.score );
        }else if(flg==1){//升序
            list.sort((o1,o2)->o1.score -o2.score );
        }
        for(Person person :list){
            System.out.println(person.name+" "+person .score );
        }
    }
}
