/**
 * @author 张瑞瑞
 * @date 2020/06/23 23:19
 */
import java.util.Scanner;

public class Main1{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        while(scanner.hasNext()){
            String str=scanner.nextLine();
            for(char ch:str.toCharArray()){
                if(ch!=' '){
                    if(ch>='F'&&ch<='Z'){
                        ch=(char)(ch-5);

                    }else{
                        ch=(char)(ch-5+26);
                    }
                    System.out.print(ch);
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}