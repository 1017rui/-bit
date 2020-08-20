/**
 * @author 张瑞瑞
 * @date 2020/08/15 16:
 * */
import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        HashMap <Integer,Integer> map=new HashMap<>();
        while(scan.hasNext()){
            int num=scan.nextInt();
            if(!map.containsKey(num)){
                map.put(num,1);
            }else{
                map.put(num,map.get(num)+1);
            }
        }
        for(Map.Entry<Integer, Integer> entry:map.entrySet()){
            if(entry.getValue()>=map.size()/2){
                System.out.println(entry.getKey());
                break;
            }
        }
    }
}