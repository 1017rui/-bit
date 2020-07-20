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

/*import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        List<Integer> list=new ArrayList<>();
        while(scan.hasNext()){
            int n=scan.nextInt();
            int sum=0;
            for(int i=0;i<n;i++){
                int a=scan.nextInt();
                int b=scan.nextInt();

                if(a==1){
                    //插入
                    int j=0;
                    for(;j<list.size();j++){
                        if(list.get(j)>=b){
                            list.add(j,b);
                            break;
                        }
                    }
                    if(list.size()==j){
                        list.add(b);//尾插
                    }
                    sum+=b;
                }else if(a==2){
                    //删除
                    list.remove(list.indexOf(b));
                    sum-=b;
                }
                int max=list.get(list.size()-1);
                if(sum-max>max){
                    System.out.println("Yes");
                }else{
                    System.out.println("No");
                }
            }
        }
    }
}*/
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
/*
import java.util.Scanner;

public class Main{
    //进行加密
    public static String Add(String str){
        StringBuffer sb=new StringBuffer();
        for(char ch:str.toCharArray()){
            if(ch>='A'&&ch<='Z'){
                ch=(char)(ch+32);
                ch=(ch=='z')?'a':(char)(ch+1);
            }else if(ch>='a'&&ch<='z'){
                ch=(char)(ch-32);
                ch=(ch=='Z')?'A':(char)(ch+1);
            }else{
                //数字
                ch=(ch=='9')?'0':(char)(ch+1);
            }
            sb.append(ch);
        }
        return sb.toString();
    }
    //进行解密
    public static String Sub(String str){
        StringBuffer sb=new StringBuffer();
        for(char ch:str.toCharArray()){
            if(ch>='A'&&ch<='Z'){
                ch=(char)(ch+32);
                ch=(ch=='a')?'z':(char)(ch-1);
            }else if(ch>='a'&&ch<='z'){
                ch=(char)(ch-32);
                ch=(ch=='A')?'Z':(char)(ch-1);
            }else{
                //数字
                ch=(ch=='0')?'9':(char)(ch-1);
            }
            sb.append(ch);
        }
        return sb.toString();
    }
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        while(scan.hasNext()){
            String add=scan.nextLine();//需要加密
            String sub=scan.nextLine();//需要解密
            System.out.println(Add(add));
            System.out.println(Sub(sub));

        }
    }
}*/

import java.util.*;

public class Main{
    public static String func(String s){
        StringBuffer sb=new StringBuffer();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch>='0'&&ch<='9'){
                sb.append(ch);
            }else if(ch>='A'&&ch<='C'){
                sb.append("2");
            }else if(ch>='D'&&ch<='F'){
                sb.append("3");
            }else if(ch>='G'&&ch<='I'){
                sb.append("4");
            }else if(ch>='J'&&ch<='L'){
                sb.append("5");
            }else if(ch>='M'&&ch<='O'){
                sb.append("6");
            }else if(ch>='P'&&ch<='S'){
                sb.append("7");
            }else if(ch>='T'&&ch<='V'){
                sb.append("8");
            }else if(ch>='W'&&ch<='Z'){
                sb.append("9");
            }
            if(sb.toString().length()==3){
                sb.append("-");
            }
        }
        return sb.toString();
    }
    //去掉字符串中的-
    public static String newString(String s) {
        StringBuffer sb=new StringBuffer() ;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!='-' ){
                sb.append(s.charAt(i));
            }
        }
        return sb.toString() ;
    }

    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        while(scan.hasNext()){
            int n=scan.nextInt();
            String[] strings=new String[n];
            Set<String> set=new HashSet<>();
            for(int i=0;i<n;i++){
                strings[i]=scan.next();
                String str=newString(strings[i]);
                String ret=func(str);
                set.add(ret);
            }
            String[] tmp=new String[set.size()];
            int j=0;
            for(String s:set){
                tmp[j++]=s;
            }
            Arrays.sort(tmp);
            for(int i=0;i<tmp.length;i++){
                System.out.println(tmp[i]);
            }
            System.out.println();
        }
    }
}