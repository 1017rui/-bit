import java.util.Scanner;
/**
 * @author 张瑞瑞
 * @date 2020/04/12 18:00
 */
public class FrogJump {
    public static int count(int n){
        if(n==1){
            return 1;
        }
        if(n==2){
            return 2;
        }
        return count(n-1)+count(n-2);

    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int ret=count(n);
        System.out.println(ret);
    }
}
