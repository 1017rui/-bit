/**
 * @author 张瑞瑞
 * @date 2020/06/08 22:31
 */
import java.util.*;

public class Main1{
    public static int func(int n){
        List<Integer> list=new ArrayList<>();

        for(int i=0;i<n;i++){
            list.add(i);
        }
        int i=0;
        while(list.size()>1){
            i=(i+2)%list.size() ;
           list.remove(i) ;
        }
        return list.get(0) ;//此时list当中只剩余一个元素返回即可。

    }
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int nums=func(n);
        System.out.println(nums);
    }
}
