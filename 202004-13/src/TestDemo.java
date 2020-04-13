import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;

/**
 * @author 张瑞瑞
 * @date 2020/04/13 18:29
 */
public class TestDemo {
    //青蛙跳台阶
    public static int jump(int n){
        if(n==1){
            return 1;
        }
        else if(n==2){
            return 2;
        }else {
            return jump(n-1)+jump(n-2);
        }
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int ret=jump(n);
        System.out.println(ret);
    }
    //汉诺塔
    public static void move(char pos1,char pos2){
        System.out.print(pos1+"->"+pos2+" ");
    }
    //n 盘子个数
    //pos1 起始位置
    //pos2 中途位置
    //pos3 目的地位置
    public static void hanoi(int n,char pos1,char pos2,char pos3){
        if(n==1) {
            move(pos1,pos3);
        }else{
            hanoi(n-1,pos1,pos3,pos2);
            move(pos1,pos3);
            hanoi(n-1,pos2,pos1,pos3);
        }
    }
    public static void main1(String[] args) {

        hanoi(1,'A','B','C');
        System.out.println();
        hanoi(2,'A','B','C');
        System.out.println();
        hanoi(3,'A','B','C');
        System.out.println();
    }
}
