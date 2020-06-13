/**
 * @author 张瑞瑞
 * @date 2020/06/11 21:55
 */
import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        while(scan.hasNext() ){
            int n=scan.nextInt();
            //key  出现的个位数字
            //value  这个数字出现的次数
            HashMap<Integer,Integer> map=new HashMap<>();
            if(n==0){
                map.put(0,1);
            }
            while(n!=0){
                int tmp=n%10;
                if(!map.containsKey(tmp)){
                    map.put(tmp,1);
                }else{
                    map.put(tmp,(map.get(tmp)+1));
                }
                n=n/10;
            }
            for(int i=0;i<10;i++){
                if(map.containsKey(i)){
                    System.out.println(i+":"+map.get(i));
                }
            }
        }
    }
}