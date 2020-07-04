/**
 * @author 张瑞瑞
 * @date 2020/06/30 22:42
 */
/*
import java.util.Scanner;

public class Main{
    public static long func10(String str){
        String[] strings=str.split("[.]") ;
        long result=0;
        result +=Long.parseLong(strings[0])<<24;
        result +=Long.parseLong(strings[1])<<16;
        result +=Long.parseLong(strings[2])<<8;
        result +=Long.parseLong(strings[3]);
        return result;
    }
    public static String func(Long n){
        StringBuffer sb=new StringBuffer() ;//用于字符串的拼接
        sb.append(n>>24) ;
        sb.append(".");
        sb.append(String.valueOf((n&0x00FFFFFF)>>16) ) ;
        sb.append(".");
        sb.append(String.valueOf((n&0x0000FFFF)>>8) ) ;
        sb.append(".");
        sb.append(String.valueOf((n&0x000000FF)));
        return sb.toString() ;
    }
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        while(scan.hasNext()){
            String str=scan.next();
            Long n=scan.nextLong();
            Long ret1=func10(str);
            String ret2=func(n);
            //System.out.println(func10(str));
            //System.out.println(func(n));
            System.out.println(ret1);
            System.out.println(ret2);
        }
    }
}
*/
/*
import java.util.Scanner;
public class Main{
    //判断长度是否超过8
    public static boolean islength(String str){
        if(str==null||str.length()<=8){
            return false;
        }
        return true;
    }
    //判断是否包含数字，大小写字母，其他符号至少三种
    public static boolean charKinds(String str){
        int Digit=0;
        int lowercase=0;
        int uppercase=0;
        int others=0;
        for(char ch:str.toCharArray()){
            if(ch>='0'&&ch<='9'){
                Digit=1;
            }else if(ch>='a'&&ch<='z'){
                lowercase=1;
            }
            else if(ch>='A'&&ch<='Z'){
                uppercase=1;
            }else{
                others=1;
            }
        }
        int total=Digit + lowercase +uppercase + others ;
        return total>=3 ? true:false;

    }
    //判断是否有长度超2的重复子串
    public static boolean checkString(String str){
        for(int i=0;i<str.length()-2;i++){
            String sub=str.substring(i,i+3);
            if(str.indexOf(sub,i+3)!=-1 ){//!=-1说明找到了子串
                return true;
            }
        }
        return false ;
    }

    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        while(scan.hasNext()){
            String str=scan.nextLine();
            if(islength(str) && charKinds(str) && (!checkString(str)) ){
                System.out.println("OK");
            }else{
                System.out.println("NG");
            }
        }
    }
}
*/
/*
import java.util.Scanner;

public class Main{
    public static int getAllSchemeNum(int[] arr,int sum){
        int count=0;
        //将选择一个数，两个数...n个数时的方案数相加
        for(int num=1;num<=arr.length;num++)
        {
            //getNumIfChosseM是选择m个数时得到的方案数
            count+=getSchemeNumIfChooseM(arr,num,0,sum);
        }
        return count;
    }
    public static int getSchemeNumIfChooseM(int[] arr, int num,int index,int sum){
        int count=0;

        //如果全部选择完成，则只需判定sum是否为零，如果为零，符合条件，返回1，否则返回0
        if(num==0)
        {
            return sum==0?1:0;
        }
        //剩余要选的数里，第一个数可选的范围为[index,arr.length-num]
        for(int i=index;i<=arr.length-num;i++)
        {
            if(arr[i]<=sum)
                //可选的个数减一，可选的左边界等于当前确定数的小标加1,
                count+=getSchemeNumIfChooseM(arr,num-1,i+1,sum-arr[i]);
        }

        return count;
    }
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        while(scan.hasNext()){
            int n=scan.nextInt();
            int num=scan.nextInt();
            int []array=new int[n];
            for(int i=0;i<n;i++){
                array[i]=scan.nextInt();
            }
            int count=getAllSchemeNum(array,num);
            System.out.println(count);
        }
    }
}*/
/*
import java.util.Scanner;
public class Main{
    //阿拉伯数字0-9对应的中文
    static String[] map = {"壹","贰","叁","肆","伍","陆","柒","捌","玖"};
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()){
            String number = scan.next();
            resolve(number);
        }
        scan.close();
    }
    public static void resolve(String str){

        String[] strArr = str.split("\\.");
//整数部分
        int number = Integer.valueOf(str.split("\\.")[0]);
        StringBuffer res = new StringBuffer("人民币");
        int yi = (int)(number/100000000);
        if(yi!=0){
            res.append(resolveQian(yi)).append("亿");
            number = number-yi*100000000;
        }
        int wan = (int)(number/10000);
        if(wan!=0){
            res.append(resolveQian(wan)).append("万");
            number = number-wan*10000;
        }
//处理千百十个位
        String beforePointString = resolveQian(number);
        if(beforePointString.length()>1){
            res.append(beforePointString).append("元");
        }
//若有小数点，处理小数点后面位数
//小数部分处理
        if(strArr.length>1){
            String afterPointStr = strArr[1];
            res.append(handleNumberAfterPoint(afterPointStr));
        }
//在resolveQian() 方法里可能会返回 零xxx
//但在最高为不能有"零"
        String resString = res.toString();
        if(resString.length()>4 && resString.charAt(3)=='零' && resString.charAt(4)!='元'){
//最高位的零去掉
            resString = resString.substring(0,3)+resString.substring(4);
        }
        System.out.println(resString);
    }
    //处理4位数 千百十个位
    public static String resolveQian(double temp){
        StringBuffer resBuffer = new StringBuffer();
//千位
        int qian = (int)(temp/1000);
        if(qian!=0){
            resBuffer.append(map[qian-1]).append("仟");
            temp = temp-qian*1000;

        }
//百位
        int bai = (int)(temp/100);
        if(bai!=0){
            resBuffer.append(map[bai-1]).append("佰");
            temp = temp-bai*100;
        }
//注意:零 只会添加在 百位和十位
        if(qian!=0 && bai==0){
            resBuffer.append("零");
        }
//十位
        int shi = (int)(temp/10);
        if(shi!=0){
            if(shi!=1){
                resBuffer.append(map[shi-1]);
            }
            resBuffer.append("拾");
            temp = temp-shi*10;
        }
//注意：0
        if(bai!=0&&shi==0){
            resBuffer.append("零");
        }
//个位
        int ge = (int)(temp%10);
        if(ge!=0){
//5,0001 这种情况，千百十位均为0
            if(qian==0&&bai==0&&shi==0){
                resBuffer.append("零");
            }
            resBuffer.append(map[ge-1]);
        }
        String res = resBuffer.toString();
        return res;
    }
    //处理小数点后面的数
    public static String handleNumberAfterPoint(String str){
        String res = "";
        if(str.equals("00") ||str.equals("0")){
            res = "整";
        }else{
            if(str.charAt(0)!='0'){
                res += map[Integer.valueOf(str.charAt(0)+"")-1]+"角";
            }
            if(str.length()>1 && str.charAt(1)!='0'){

                res += map[Integer.valueOf(str.charAt(1)+"")-1]+"分";
            }
        }
        return res;
    }
}*/
/*
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        while(scan.hasNext()){
            int N=scan.nextInt();
            BigInteger [] bi=new BigInteger[N] ;
            for(int i=0;i<N;i++){
                bi[i]=scan.nextBigInteger();
            }
            Arrays.sort(bi);
            for(BigInteger elem:bi){
                System.out.println(elem);
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
            char[] array=str.toCharArray() ;
            for(char c:array){
                String s1=Integer.toBinaryString(c);//将字符的二进制形式以字符串的形式返回。
                String s2=String.format("%07d",Integer.parseInt(s1) );//格式化为整型字符串   整数长度为7位，如果不到7位就用0来补充
                int count=0;
                for(int i=0;i<7;i++){
                   char ch= s2.charAt(i) ;
                   if(ch=='1'){
                       count++;
                   }
                }
               if(count%2==0){
                   s2="1"+s2;
               }else{
                   s2="0"+s2;
               }
                System.out.println(s2);
            }
        }
    }
}