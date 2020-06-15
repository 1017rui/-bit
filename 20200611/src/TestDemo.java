import java.util.*;
/**
 * @author 张瑞瑞
 * @date 2020/06/15 11:06
 */
public class TestDemo {
    //方法一：
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String str=scan.nextLine();//将数字当成字符串的形式输入
        char[] ch=str.toCharArray();//将字符串转换为字符数组
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<ch.length ;i++){
            if(!map.containsKey(ch[i]-'0') ){
                map.put(ch[i]-'0',1);
            }else{
                map.put(ch[i]-'0',map.get(ch[i]-'0')+1);
            }
        }
        for(int i=0;i<10;i++){
            if(map.containsKey(i) ){
                System.out.println(i+":"+map.get(i));
            }
        }
    }
    //方法二：
    public static void main1(String[] args){
        Scanner scan=new Scanner(System.in);
        String str=scan.nextLine();//将数字当成字符串的形式输入
        char[] ch=str.toCharArray();//将字符串转换为字符数组
        List<Integer> list=new ArrayList<>();//用于存放每个数字出现的个数
        //初始化list
        for(int i=0;i<10;i++){
            list.add(0);
        }
        for(int i=0;i<ch.length;i++){
            list.set(ch[i]-'0',list.get(ch[i]-'0')+1);
        }
        for(int i=0;i<list.size();i++){
            if(list.get(i)>0){
                System.out.println(i+":"+list.get(i));
            }
        }

    }
}
