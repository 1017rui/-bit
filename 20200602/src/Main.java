import java.util.Scanner;
import java.util.Stack;

/**
 * @author 张瑞瑞
 * @date 2020/06/03 13:27
 */
/*public class Main{
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
}*/
import java.util.*;
public class Main{
    public static int func(String str){
        HashSet <String> set=new HashSet<>();
        StringBuffer sb1=new StringBuffer();
        for(char s:str.toCharArray() ){
            if(s!=' '){
                sb1.append(s);
            }else{
                set.add(sb1.toString() );
                sb1=new StringBuffer();
            }
        }
        return set.size();

       /* HashMap<String,Integer> map=new HashMap<>();
        StringBuffer sb=new StringBuffer();
        for(char s:str.toCharArray() ){
            if(s!=' '){
                sb.append(s);
            }else{
                if(!map.containsKey(sb.toString())){
                    map.put(sb.toString(),1);
                }else{
                    int ret=map.get(sb.toString());
                    map.put(sb.toString(),ret+1);
                }
                sb=new StringBuffer();
            }
        }
        return map.size();

        */

    }
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        StringBuffer sb=new StringBuffer();
String str1="zhang";
char ch='a';
if(str1.contains(ch+"") ){

}
        while(scan.hasNext()){
            String str=scan.nextLine();
            sb.append(str);
        }
        int count=func(sb.toString());
        System.out.println(count);
    }
}