/**
 * @author 张瑞瑞
 * @date 2020/06/24 23:51
 */
import java.util.Scanner;

public class Main{
    public static void func(String exist,String want){
        int count=0;//记录已经匹配的珠子数
        for(int i=0;i<want.length();i++){
            for(int j=0;j<exist.length();j++){
                char w=want.charAt(i);
                char e=exist.charAt(j);
                if(w==e){
                    count++;
                    e=' ';//匹配成功不允许在参加匹配
                    break;
                }
            }
        }
        if(count==want.length()){//全部匹配了
            System.out.println("Yes"+" "+(exist.length()-count));
        }else{
            System.out.println("No"+" "+(want.length()-count));
        }
    }
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        while(scanner.hasNext()){
            String exist=scanner.next();
            String want=scanner.next();
            func(exist,want);
        }
    }
}