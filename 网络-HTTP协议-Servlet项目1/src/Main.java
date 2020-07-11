/**
 * @author 张瑞瑞
 * @date 2020/07/07 11:09
 */
/*
import java.util.Scanner;

public class Main{
    public static void change(String should,String fact){
        String[] s=should.split("\\.");
        String[] f=fact.split("\\.");
        int[] shoulds=new int[3];
        int[] facts=new int[3];
        for(int i=0;i<3;i++){
            shoulds[i]=Integer.parseInt(s[i]);
            facts[i]=Integer.parseInt(f[i]);
        }
        int[] result=new int[3];
        boolean flg=true;
        if(shoulds[0]>facts[0]){
            flg=false;
            int[] ret=shoulds;
            shoulds=facts;
            facts=ret;
        }
        for(int i=2;i>=0;i--){
            if(i==2&&(facts[i]<shoulds[i])){
                facts[i]+=19;
                facts[i-1]-=1;
            }
            if(i==1&&(facts[i]<shoulds[i])){
                facts[i]+=17;
                facts[i-1]-=1;
            }
            result[i]=facts[i]-shoulds[i];
        }
        if(!flg){
            System.out.print("-");
        }
        for(int i=0;i<3;i++){

            System.out.print(result[i]);
            if(i!=2){
                System.out.print(".");
            }
        }
        System.out.println();
    }
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        while(scan.hasNext()){
            String should=scan.next();
            String fact=scan.next();
            change(should,fact);
        }
    }
}*/
/*
import java.util.*;



public class Main {
    public static int countNumberOf2s(int n) {
        // write code here
        if(n<2){
            return 0;
        }
        int count=0;
        for(int i=2;i<=n;i++){
            count+=countNumberOf2sChild(i);
        }
        return count;
    }
    public static int countNumberOf2sChild(int num){
        int count=0;
        while(num!=0){
            if(num%10==2){
                count++;
            }
            num=num/10;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countNumberOf2s(1000));
    }
}*/
/*
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        while(scan.hasNext()){
            int n=scan.nextInt();//数组长度
            int sum=scan.nextInt();
            int[] value=new int[n];//初始化数组
            long[]dp=new long[sum+1];//动态规划数组
            dp[0]=1;//index=0的初始化值
            for(int i=0;i<n;i++){
                value[i]=scan.nextInt();
                for(int j=sum;j>=0;j--){
                    if(j>=value[i]){
                        dp[j]+=dp[j-value[i]];
                    }
                }
            }
            System.out.println(dp[sum]);
        }
    }
}*/
/*
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main{

    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int countjia=0,countping=0,countyi=0,jiaC=0,jiaJ=0,jiaB=0,yiC=0,yiJ=0,yiB=0;
        String maxjia="",maxyi="";
        Map<String,Integer> mapjia=new HashMap<>();
        Map<String,Integer> mapyi=new HashMap<>();
        while(scan.hasNext()){
            int n=scan.nextInt();
            for(int i=0;i<n;i++){
                String a=scan.next();
                String b=scan.next();
                if(a.equals("C")&&b.equals("J") || a.equals("B")&&b.equals("C") || a.equals("J")&&b.equals("B")){
                    //甲获胜
                    countjia++;
                    if(a.equals("C")){
                        jiaC++;
                    }
                    if(a.equals("J")){
                        jiaJ++;
                    }
                    if(a.equals("B")){
                        jiaB++;
                    }
                }else if(a.equals(b)){
                    //平
                    countping++;
                }else{
                    //乙获胜
                    countyi++;
                    if(b.equals("C")){
                        yiC++;
                    }
                    if(b.equals("J")){
                        yiJ++;
                    }
                    if(b.equals("B")){
                        yiB++;
                    }
                }
            }
            System.out.println(countjia+" "+countping+" "+countyi);
            System.out.println(countyi+" "+countping+" "+countjia);
            if(jiaC >jiaB){
                if(jiaB>jiaJ){
                    maxjia="C";
                }else{//jiaJ>jiaB
                    if(jiaC>=jiaJ){
                        maxjia="C";
                    }else{//jiaC<jiaJ
                        maxjia="J";
                    }
                }
            }else{//jiaC<jiaB
                if(jiaC >jiaJ){
                    maxjia="B";
                }else{//jiaC<jiaJ
                    if(jiaB>=jiaJ){
                        maxjia="B";
                    }else{//jiaB<jiaJ
                        maxjia="J";
                    }
                }
            }
            if(yiC >yiB){
                if(yiB>yiJ){
                    maxyi="C";
                }else{
                    if(yiC>=yiJ){
                        maxyi="C";
                    }else{
                        maxyi="J";
                    }
                }
            }else{
                if(yiC >yiJ){
                    maxyi="B";
                }else{
                    if(yiB>=yiJ){
                        maxyi="B";
                    }else{
                        maxyi="J";
                    }
                }
            }
            System.out.println(maxjia +" "+maxyi);
        }
    }
}
*/
/*
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        while(scan.hasNext()){
            String print=scan.nextLine();
            String fact=scan.nextLine().toUpperCase();
            StringBuffer sb=new StringBuffer();
            for(char ch:print .toUpperCase().toCharArray()){
                if(!fact.contains(ch+"") ){
                    if(!sb.toString().contains(ch+"") ){
                        sb.append(ch);
                    }
                }
            }
            System.out.println(sb.toString() );
        }
    }
}*/
/*
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        while(scan.hasNext()){
            int x0=scan.nextInt();
            int y0=scan.nextInt();
            int z0=scan.nextInt();
            int x1=scan.nextInt();
            int y1=scan.nextInt();
            int z1=scan.nextInt();

            double r=Math.sqrt(Math.pow(x1-x0,2)+Math.pow(y1-y0,2)+Math.pow(z1-z0,2));
            double v=4.0/3*Math.PI*Math.pow(r,3);
            System.out.print(String.format("%.3f",r)+" "+String.format("%.3f",v) );
        }
    }
}*/
/*
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
            while(scan.hasNext()){
                String str=scan.nextLine();
                int[] array=new int[26];
                for(int i=0;i<str.length();i++){
                    char ch=str.charAt(i);
                    if(ch>='A'&&ch<='Z') {
                        array[ch-'A']++;
                    }
                }
                for(int i=0;i<26;i++){
                    System.out.println((char)('A'+i)+":"+array[i]);
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
            String str=scan.nextLine();
            String s=str.substring(2);
            int j=0;
            int ret=0;
            int tmp=0;
            for(int i=s.length()-1;i>=0;i--){
                char ch=s.charAt(i);
                if(ch=='A'){
                   tmp=10;
                }else if(ch=='B'){
                    tmp=11;
                }else if(ch=='C'){
                    tmp=12;
                }else if(ch=='D'){
                    tmp=13;
                }else if(ch=='E'){
                    tmp=14;
                }else if(ch=='F'){
                    tmp=15;
                }else{
                    tmp=(char)ch;
                }
                ret+=tmp*Math.pow(16,j++);
            }
            System.out.println(ret);
        }
    }
}
/*
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (scan.hasNext()) {
            String str=scan.nextLine();
            int ret=Integer.parseInt(str.substring(2), 16);
            System.out.println(ret);

        }
    }
}*/
