/**
 * @author 张瑞瑞
 * @date 2020/05/09 16:50
 */
public class TestDemo4 {
    public static void main(String[]args){
        StringBuilder  stringBuilder =new StringBuilder() ;
        for(int i=0;i<10;i++){
            stringBuilder .append("a") ;
        }//不会产生大量的临时变量。
        StringBuffer sb2=new StringBuffer() ;
        sb2.append("zhang") ;

        sb2.reverse() ;
        System.out.println(sb2);
              /*//  StringBuffer stringBuffer =new StringBuffer() ;
        StringBuilder  stringBuilder =new StringBuilder() ;
        stringBuilder .append("abcd") ;
        stringBuilder .append("efg");//append永远只维持一个对象
              */
     /*   String s="hello";
         s=s+"world";
        System.out.println(s);
        //翻译之后：
        StringBuilder  sb=new StringBuilder() ;
        sb.append("hello") ;
        sb.append("world") ;
        String ret=sb.toString() ;*/
    }
}
