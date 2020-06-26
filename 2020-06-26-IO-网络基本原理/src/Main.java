/**
 * @author 张瑞瑞
 * @date 2020/06/26 17:58
 */


import java.util.Scanner;

public class Main{
    public static void A1(int[] arr){
        int sum=0;
        for(int n:arr){
            if(n%5==0&&n%2==0){
                sum+=n;
            }
        }
        if(sum==0){
            System.out.print("N"+" ");
        }else{
            System.out.print(sum+" ");
        }
    }

    public static void A2(int[] arr){
        int sum=0;
        int flg=1;
        boolean look=true;
        for(int n:arr){
            if(n%5==1){
                sum+=n*flg;
                flg=-(flg);
                look=false;
            }
        }
        if(look){
            System.out.print("N"+" ");
        }else{
            System.out.print(sum+" ");
        }
    }
    public static void A3(int[] arr){
        int count=0;
        for(int n:arr){
            if(n%5==2){
                count++;
            }
        }
        System.out.print(count+" ");
    }

    public static void A4(int[] arr){
        int sum=0;
        int count=0;
        for(int n:arr){
            if(n%5==3){
                sum+=n;
                count++;
            }
        }
        if(count==0){
            System.out.print("N"+" ");
        }else{
            double num=1.0*sum/count ;
            System.out.printf("%.1f ",(float)sum/count  ) ;

        }
    }
    public static void A5(int[] arr){
        int max=0;
        for(int n:arr){
            if(n%5==4){
                max=Math.max(max,n);
            }
        }
        if(max==0){
            System.out.print("N");
        }else{
            System.out.print(max);
        }
    }
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
            int n=scan.nextInt();
            int[] arr=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=scan.nextInt() ;
            }
            A1(arr);
            A2(arr);
            A3(arr);
            A4(arr);
            A5(arr);

    }
}