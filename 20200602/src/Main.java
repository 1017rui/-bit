import java.util.Scanner;
import java.util.Stack;

/**
 * @author 张瑞瑞
 * @date 2020/06/03 13:27
 */
public class Main{
    public boolean chkParenthesis(String A, int n) {
        // write code here
        Stack<Character> stack =new Stack<>();
        for(int i=0;i<n;i++){
            char ch=A.charAt(i) ;
            if(ch!='('&&ch!=')'){
                return false;
            }else if(ch=='('){
                stack.push(ch) ;
            }else{//ch=')'
                if(stack.empty()){
                    return false;
                }else{
                    stack.pop();
                }
            }
        }
        return true;
    }
    public static String func(String str){
        String ret="";
        StringBuffer sb=new StringBuffer();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i) ;
            if(ch>=48&&ch<=57){
                sb.append(ch) ;
            }else{
              ret=(ret.length()>sb.toString().length())  ?ret:sb.toString() ;
              sb=new StringBuffer() ;
            }
        }
        ret=(ret.length()>sb.toString().length())  ?ret:sb.toString() ;
        return ret;


    }
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        String str=scan.nextLine();
        String ret=func(str);
        System.out.println(ret);
    }
}
