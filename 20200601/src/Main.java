import java.util.Scanner;

/**
 * @author 张瑞瑞
 * @date 2020/06/02 10:56
 */
public class Main{
    public static int func(String A,String B){
        StringBuffer sb=new StringBuffer() ;
        int count=0;

        for(int i=1;i<A.length()+1 ;i++){
            //+1是为了考虑到把字符串B插到字符串A 后面。
            String ret1=A.substring(0,i);
            String ret2=A.substring(i);
            sb.append(ret1) ;
            sb.append(B) ;
            sb.append(ret2) ;
            if(isPalind(sb.toString())) {
                count++;
            }
            sb=new StringBuffer() ;

        }
        //考虑把字符串B插到字符串A 前面。
        sb.append(B);
        sb.append(A);
        if(isPalind(sb.toString())) {
            count++;
        }
        return count;
    }
    public static boolean isPalind(String str){
        //判断一个字符串是否为回文串
        int left=0;
        int right=str.length()-1;
        while(left<right){
            char ch1=str.charAt(left) ;
            char ch2=str.charAt(right) ;
            if(ch1!=ch2){
                return false ;
            }
            left++;
            right--;
        }
        return true;

    }
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        String str1=scan.next();
        String str2=scan.next();
        int result=func(str1,str2);
        System.out.println(result );
    }
}
