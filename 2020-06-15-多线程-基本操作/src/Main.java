/**
 * @author 张瑞瑞
 * @date 2020/06/15 22:13
 */
import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        String str=scan.nextLine();//以字符串的形式输入
        String[] s=str.split(" ");
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<10;i++){
            list.add(Integer.parseInt(s[i]) );
        }
        StringBuffer sb=new StringBuffer();

        //挑选一个最小的首位
        for(int i=1;i<10;i++){
            if(list.get(i)!=0){
                sb.append(i);
                list.set(i,list.get(i)-1);
                break;
            }
        }
        for(int i=0;i<10;i++){
            if(list.get(i)!=0){
                for(int j=0;j<list.get(i);j++){
                    sb.append(i);
                }
            }
        }
        System.out.println(sb.toString());
    }
}