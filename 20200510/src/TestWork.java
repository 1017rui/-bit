
import javax.print.DocFlavor;
import java.util.Arrays;

/**
 * @author 张瑞瑞
 * @date 2020/05/10 22:20
 */
public class TestWork {
    //实现方法 split, 能够指定分割符将字符串拆分成字符串数组(不必支持正则表达式)
    public static String[] mySplit(String str,char s) {
        int count=0;
        for(int i=0;i<str.length() ;i++){
            char ch=str.charAt(i) ;
            if(ch==s){
                count++;
            }
        }
        String[] strings=new String[count+1];
        int j=0;
        for(int i=0;i<str.length() ;i++){
            char ch=str.charAt(i) ;
            if(ch==s){
               strings[j++]=str.substring(0,i) ;//?
            }
        }
        return strings;
    }

    public static void main(String[] args) {
        String  str="i love you";
        char s=' ';

       String [] array= mySplit(str,s);
        System.out.println(array);
    }
    //实现方法 replace, 能够替换字符串中的某个部分

    public static String myReplace(String string,String target,String replacement){
        int index=myIndexof(string,target) ;
        StringBuffer sb=new StringBuffer();
        sb.append(string.substring(0,index) ) ;

        sb.append(replacement );
        if(index+target .length()!=string.length()){
            sb.append(string.substring(index+target .length(),string.length())) ;
        }
        return sb.toString() ;
    }

    //实现方法 indexOf, 能够找出字符串子串存在的位置
    public static int myIndexof(String string,String s){
        char []array=string.toCharArray() ;
        char []array1=s.toCharArray() ;
        int index=0;

        for(int i=0;i<array.length;i++){
            if(array[i]==array1[0]){
                index=i;
                int j=1;
                for(;j<array1.length;j++){
                    i++;
                    if(i==array.length){
                        return -1;
                    }
                    if(array[i]!=array1[j]){
                        break;
                    }

                }
                if(j==array1.length){
                    return index;
               }
            }

        }
        return -1;
    }
    //实现方法 compareTo, 能够实现按照字典序比较字符串大小
    public static int myCompareTo(String str1,String str2){
        int len=(str1.length()>str2.length())?(str2.length()):(str1.length());
        int i=0;
        while(i<len){
            char ch1=str1.charAt(i);
            char ch2=str2.charAt(i);
            if(ch1==ch2){
              i++;
            }else{
                return ch1-ch2;
            }

        }
        if(str1.length()==str2.length()){
            return 0;
        }else if(str1.length()>str2.length()){
            return 1;
        }else{
            return -1 ;
        }
    }
    //实现方法 contains, 能够判定字符串中是否包含子串
    public static boolean myContains(String string,String s){
       char []array=string.toCharArray() ;
       char []array1=s.toCharArray() ;
       for(int i=0; i<array.length;i++){
           int j=0;
           while(array[i]==array1[j]){
               i++;
               j++;
               if(i==array.length){
                   break;
               }
               if(j==array1.length){
                   return true;
               }
           }
       }
       return false;
    }

    public static void main1(String[] args) {
        String str="i love you";
        String s1="you";
        String s2="java";
        //System.out.println(str.concat("you"));
       /* String[] array=str.split("A") ;
        System.out.println(Arrays.toString(array));
       String ret= str.replace("you","java") ;
        System.out.println(ret);*/
      /* boolean bool=myContains(str,s) ;
        System.out.println(bool);
        String str1="abcf";
        String str2="abag";
        int tmp=myCompareTo(str1,str2);
        System.out.println(str1.compareTo(str2));
        System.out.println(tmp);*/
      /*int ret=myIndexof(str, s);
        System.out.println(ret);*/
      String tmp=myReplace(str,s1,s2) ;
        System.out.println(tmp);
    }
}
