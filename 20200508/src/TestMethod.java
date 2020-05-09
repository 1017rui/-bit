/**
 * @author 张瑞瑞
 * @date 2020/05/09 17:42
 */

public class TestMethod {
    //判断字符是否为元音字母。
    public static boolean isVowel(char ch){
       if(ch=='A'||ch=='O'||ch=='E'||ch=='I'||ch=='U'||ch=='a'||ch=='o'||ch=='e'||ch=='i'||ch=='u'){
           return true;
       }
       return false;
    }
    //反转字符串中的元音字母
    public static String reverseVowels(String s) {
     char[] array=s.toCharArray() ;
     int left=0;
     int right=s.length()-1;
     while(left<right){
         if(!isVowel(array[left])){
             left++;
         }else if(!isVowel(array[right])){
            right--;
         }else{
             char tmp=array[left];
             array[left]=array[right];
             array[right]=tmp;
             left++;
             right--;
         }
     }
     return new String(array);
    }
    public static void main(String[] args) {
        String str="leetcode";
        System.out.println(reverseVowels(str));

    }
  /*  public static boolean detectCapitalUse(String word) {
    int upper=0;

   //遍历求整个字符串中大写字母的个数
       *//* char[] array=word.toCharArray() ;//将字符串变为字符数组
        for(int i=0;i<array.length;i++){
            if(array[i]>='A'&&array[i]<='Z'){
                upper++;

            }
        }*//*
       for(int i=0;i<word.length();i++){
           char ch=word.charAt(i) ;
           if(ch>='A'&&ch<='Z'){
               upper++;
           }
       }
        if(upper==word.length()||upper==0||(upper==1&&word.charAt(0)>='A'&&word.charAt(0)<='Z')){
            return true;
        }
        return false ;
    }
    public static void main1(String[]args){
        String s="zzAcx";
        System.out.println(detectCapitalUse(s));
    }*/
/*
    //实现方法 split, 能够指定分割符将字符串拆分成字符串数组(不必支持正则表达式)
//实现方法 compareTo, 能够实现按照字典序比较字符串大小
    //实现方法 contains, 能够判定字符串中是否包含子串
    public static boolean contains(String str,String s){

    }
    //实现方法 indexOf, 能够找出字符串子串存在的位置
    //实现方法 replace, 能够替换字符串中的某个部分
    public static void main(String[]args){
        String str1="abc";
        String str2="abc";

    }*/
}
