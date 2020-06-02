import java.util.*;

/**
 * @author 张瑞瑞
 * @date 2020/05/30 14:36
 */
public class Test {
    public static char findTheDifference(String s, String t) {
        char ret=0;
        for(int i=0;i<s.length();i++){
            ret^=(s.charAt(i)^t.charAt(i)) ;
        }
        ret^=t.charAt(s.length()) ;
        return ret;

    }
    public static int findMaxLength(int[] nums) {
        int len = nums.length;
        if (len <= 1) return 0;
        int count = 0;
        int maxLen = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        for (int i = 0; i < len; i++) {
            if (nums[i] == 1) count++;
            else if (nums[i] == 0) count--;

            if (map.containsKey(count)) {
                maxLen = Math.max(maxLen, i - map.get(count));
            } else {
                map.put(count, i);
            }
        }
        return maxLen;
    }
    public static boolean containsDuplicate(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>() ;
        //key存放数组中的元素
        //value 该元素在数组中出现的次数
        for(int num:nums){
            if(!map.containsKey(num) ){
                map.put(num,1);
            }else{
                int ret=map.get(num);
                map.put(num,ret+1);
            }
        }
        Collection<Integer> collection =map.values() ;
        //map.values(), 返回所有 value 的可重复集合
        for(Integer c:collection ){
            if(c>=2){
                return true;
            }
        }
        return false;
    }
    public boolean isValidSudoku(char[][] board){
        HashMap <Integer,Integer> []rows=new HashMap[9] ;//行
        HashMap <Integer,Integer> []columns=new HashMap[9] ;//列
        HashMap <Integer,Integer> []boxes=new HashMap[9] ;//3*3单元格
        for(int i=0;i<9;i++){
            rows[i]=new HashMap<>() ;
            columns[i]=new HashMap<>() ;
            boxes[i]=new HashMap<>() ;
        }
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                char num=board[i][j];
                if(num!='.'){
                    //说明是数字
                    int n=(int)num;
                    int box_index=(i/3)*3+j/3;//求3*3单元格的下标
                    rows[i].put(n,rows[i].getOrDefault(n,0)+1 );
                    columns[j].put(n,columns[j].getOrDefault(n,0)+1 );
                    boxes [box_index ].put(n,boxes [box_index].getOrDefault(n,0)+1 );

                    if(rows[i].get(n)>1 || columns[j].get(n)>1 || boxes[box_index].get(n)>1 ){
                        return false ;
                    }

                }

            }
        }
        return true;

    }
    public int lengthOfLongestSubstring(String s){
        int ret=0;
        Map<Character ,Integer> map=new HashMap<>() ;
        for(int start=0,end=0;end<s.length();end++){
            char tmp=s.charAt(end);
            if(map.containsKey(tmp) ){
                start=Math.max(map.get(tmp),start);
            }
            ret=Math.max(ret,end-start+1);
            map.put(tmp,end+1);
        }
        return ret;
    }


    public String mostCommonWord(String paragraph,String[] banned){
        paragraph +=".";
        HashSet<String> set=new HashSet<>();//存放禁用单词
        for(String ban:banned){
            set.add(ban.toLowerCase()) ;//忽略大小写，全部转化为小写来看待。
        }

        HashMap<String,Integer> map=new HashMap<>() ;
        //key 存放段落中出现的单词
        //value 存放该单词出现的次数
        int max=0;
        String result="";
        StringBuffer stringBuffer =new StringBuffer() ;
        for(int i=0;i<paragraph .length();i++){
            char c=paragraph .charAt(i);
            if((c>='a'&&c<='z')||(c>='A'&&c<='Z')){
                stringBuffer .append(c) ;
                continue;
            }

            if(stringBuffer .length()>0 ){
                String res=stringBuffer .toString() .toLowerCase() ;
                if(!set.contains(res) ){
                    map.put(res,map.getOrDefault(res,0)+1 );
                    int count=map.get(res);
                    if(count>max){
                        max=count;
                        result =res;
                    }
                }
                stringBuffer =new StringBuffer() ;
            }
        }
        return result;

    }
    public static  int[] numSmallerByFrequency(String[] queries, String[] words) {
       int count=0;
       List<Integer> list=new ArrayList<>() ;

        for(int i=0;i<queries .length ;i++){
             count=0;
            for(int j=0;j<words .length;j++){
                if(f(queries[i])<f(words[j])){
                    count++;
                }
            }
            list.add(count) ;
        }
       int[] array=new int[list.size() ] ;
        int i=0;
        for(Integer in: list){
            array[i++]=in;
        }
    return array;
    }
    public static  int f(String str){
        int min=123;
        if(str.length() ==1){
            return 1;
        }
        for(int i=0;i<str.length()-1;i++){
            if(str.charAt(i)<=str.charAt(i+1)){
                min=Math.min(min,str.charAt(i)) ;
            }else{
                min=Math.min(min,str.charAt(i+1)) ;
            }
        }
        char ch=(char) min;
        int count=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==min ){
                count++;
            }
        }
        return count;

    }

    public static void main(String[] args) {
        String str="b";
        int count=f(str);
        System.out.println(count);
        String [] strings1={"bba","abaaaaaa","aaaaaa","bbabbabaab","aba","aa","baab","bbbbbb","aab","bbabbaabb"};
        String[] strings2={"aaabbb","aab","babbab","babbbb","b","bbbbbbbbab","a","bbbbbbbbbb","baaabbaab","aa"};
       int[] array=numSmallerByFrequency(strings1,strings2) ;
        System.out.println(Arrays.toString(array) );
    }
    public static void main2(String[] args) {
        int[]nums={3,1};
        boolean ret=containsDuplicate(nums) ;
        System.out.println(ret);
    }
    public static void main1(String[] args) {
    String s="abcd";
    String t="abcde";
    char ret=findTheDifference(s,t) ;
        System.out.println(ret);
    }
}
