/**
 * @author 张瑞瑞
 * @date 2020/06/30 10:51
 */
/*
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        while(scan.hasNext()){
            int candidates=scan.nextInt();//候选人人数
            String[] ch1=new String[candidates];
            for(int i=0;i<candidates;i++){
                ch1[i]=scan.next();
            }
            int voters=scan.nextInt();//投票人人数
            String[] ch2=new String[voters];
            for(int i=0;i<voters;i++){
                ch2[i]=scan.next();
            }
            int sum=0;
            for(int i=0;i<candidates;i++){
                int count=0;
                for(int j=0;j<voters;j++){
                    if(ch1[i].equals(ch2[j]) ){
                        count++;
                    }
                }
                sum+=count;
                System.out.println(ch1[i]+" : "+count);
            }
            if(sum<=voters){
                System.out.println("Invalid"+" : "+(voters-sum));
            }
        }
    }
}
*/
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);

        while(scan.hasNext()){
            int n=scan.nextInt();//学生
            int m=scan.nextInt();//操作
            int[] scores=new int[n];//n个学生初始成绩
            for(int i=0;i<n;i++){
                scores[i]=scan.nextInt();
            }
            for(int i=0;i<m;i++){
                String c=scan.next();
                int a=scan.nextInt();
                int b=scan.nextInt();
                if(c.equals("Q")){
                    int left=Math.min(a,b);
                    int right=Math.max(a,b);
                    //询问操作 找id在[a,b]之间的最高成绩
                    //id从[a,b]   实际上下标从[a-1，b)
                    int maxScore=0;
                    for(int j=left-1;j<right;j++){
                        if(scores[j]>maxScore){
                            maxScore=scores[j];
                        }
                    }
                    System.out.println(maxScore);

                }else if(c.equals("U")){
                    //更新操作，要求把ID为a的学生的成绩更改为b。
                    scores[a-1]=b;
                }
            }
        }
    }
}