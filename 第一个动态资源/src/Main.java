/**
 * @author 张瑞瑞
 * @date 2020/07/06 13:28
 */
/*
import java .util.Scanner;

public class Main{
    //逆置字符串
    public static String reverse(String str){
        int left=0;
        int right=str.length()-1;
        char[] array=str.toCharArray();
        while(left<right){
            char ch=array[left];
            array[left]=array[right];
            array[right]=ch;
            left++;
            right--;
        }
        return String.copyValueOf(array) ;//将字符数组转换为字符串
    }
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        while(scan.hasNext()){
            String str=scan.nextLine();
            //拿到逆置后的字符串
            String ret=reverse(str);
            String[] strings=ret.split(" ");
            String[] result=new String[strings.length];
            for(int i=0;i<strings.length;i++){
                result[i]=reverse(strings[i]);
            }
            for(String s:result){
                System.out.print(s+" ");
            }
        }
    }
}*/
/*
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        Scanner scan = new Scanner(System.in);
        while (scan.hasNext()) {
            String str = scan.next();
            int row = scan.nextInt();
            String[] arr = str.split("\\\\");
            String s = arr[arr.length - 1];
            if (s.length() > 16) {
                s = s.substring(s.length() - 16);
            }
            String key = s + " " + row;
            if (map.containsKey(key)) {
                map.put(key, (map.get(key) + 1));
            } else {
                map.put(key, 1);
            }

            int count = 0;
            for (String string : map.keySet()) {
                count++;
                if (count > map.keySet().size() - 8) {
                    System.out.println(string + " " + map.get(string));
                }
            }
        }
    }
}
*/
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<String> names = new ArrayList<>();
        List<Integer>sum = new ArrayList<>();
        while(in.hasNext()){
            String[] strs = (in.next()).split("\\\\");
            String name = strs[strs.length-1];
            name= name+" "+in.next();
            int index = names.indexOf(name);
            if(index != -1){//存在
                sum.set(index,sum.get(index)+1);
            }else{
                names.add(name);
                sum.add(1);
            }
        }
        String[] namestmp = new String[names.size()];
        names.toArray(namestmp);
        Integer[] sumtmp = new Integer[sum.size()];
        sum.toArray(sumtmp);
        //排序
        for(int i=0; i<namestmp.length; i++){
            int maxIndex = i;
            for(int j=i+1; j<namestmp.length; j++){
                if(sumtmp[j] > sumtmp[maxIndex]){
                    maxIndex = j;
                }
            }
            String name1 = namestmp[maxIndex];
            System.arraycopy(namestmp,i,namestmp,i+1,maxIndex-i);
            namestmp[i] = name1;
            Integer sum1 = sumtmp[maxIndex];
            System.arraycopy(sumtmp,i,sumtmp,i+1,maxIndex-i);
            sumtmp[i] = sum1;
        }
        //输出
        for(int i=0; i<Math.min(namestmp.length,8); i++){
            String name = namestmp[i];
            String a = name.split(" ")[0];
            String b = name.split(" ")[1];
            if(a.length()>16){
                name = a.substring(a.length()-16)+" "+b;
            }
            System.out.println(name+" "+sumtmp[i]);
        }
    }
}
