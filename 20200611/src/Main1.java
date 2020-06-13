import java.util.Scanner;

/**
 * @author 张瑞瑞
 * @date 2020/06/11 22:20
 */
public class Main1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System .in);
        String str=scanner.nextLine();//以字符串的形式输入（这样可以输入多位的正整数）
        char[] arrays=str.toCharArray() ;//将输入的数字字符串 搞成字符形式 存放在这个数组当中
        int[] count=new int[10];//存放0-9这些数字出现的次数
        for(int i=0;i<arrays.length;i++){
            count[(int)arrays[i]-'0']++;
        }
        for(int i=0;i<count.length ;i++){
            if(count[i]!=0){//为0说明该数字一次都没出现
                System.out.println(i+":"+count[i]);
            }
        }

    }
}
