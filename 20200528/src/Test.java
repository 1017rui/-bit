import java.lang.reflect.Array;
import java.util.*;

/**
 * @author 张瑞瑞
 * @date 2020/05/28 12:23
 */
public class Test {
    public static boolean isIsomorphicHelper(String s,String t){
        //判断两个字符串是否同构
        if(s.length() !=t.length() ){
            return false;
        }
        HashMap <Character ,Character > map=new HashMap<>() ;
        for(int i=0;i<s.length() ;i++){
            char s1=s.charAt(i);
            char t1=t.charAt(i) ;
            if(!map.containsKey(s1) ){
                map.put(s1,t1);
            }else{
                if(map.get(s1)!=t1){
                    return false;
                }
            }
        }
        for(int i=0;i<s.length() ;i++){
            char t1=t.charAt(i);
            char s1=s.charAt(i) ;
            if(!map.containsKey(t1) ){
                map.put(t1,s1);
            }else{
                if(map.get(t1)!=s1){
                    return false;
                }
            }
        }
        return true;
    }

    //求两个数组的交集  打印不重复的
    public static int[] intersection(int[] nums1, int[] nums2) {

        HashSet<Integer> set1=new HashSet<>();//存放nums1的所有元素
        HashSet<Integer> set2=new HashSet<>();//存放两个数组共有的元素 （不重复） 就是结果元素
        for(Integer s1:nums1 ){
            set1.add(s1) ;
        }
        for(Integer s2:nums2 ){
            if(set1 .contains(s2) ){
                set2 .add(s2);
            }
        }
        int[] array=new int[set2 .size()];//申请一个数组将set2当中的元素拷贝到数组中
        int j=0;
        for(int i:set2 ){
            array[j++]=i;
        }
        return array;
    }
    //两个数组的交集 输出结果中每个元素的次数，应与元素在两个数组中出现的次数一致。
    public static int[] intersect(int[] nums1, int[] nums2) {
        HashMap <Integer,Integer > map=new HashMap<>() ;//将nums1中的值以及每个值出现的次数放入map当中
        for(Integer s1:nums1){
            if(!map.containsKey(s1) ){
                map.put(s1,1);
            }else{
                int ret=map.get(s1);
                map.put(s1,ret+1);
            }
        }
        ArrayList <Integer> list=new ArrayList<>();
        for(Integer s2:nums2){
            if(map.containsKey(s2) &&map.get(s2)!=0){
                list.add(s2);
                int ret=map.get(s2);
                map.put(s2,ret-1);
            }
        }
        int[] array=new int[list .size()];//申请一个数组将set2当中的元素拷贝到数组中
        int j=0;
        for(int i:list ){
            array[j++]=i;
        }
        return array;

    }
    public static int firstUniqChar(String s) {
        //key  字符串中的字符
        //value 给我i字符出现的次数
        HashMap <Character ,Integer> map=new HashMap<>() ;
        for(char ch:s.toCharArray() ){
            if(!map.containsKey(ch) ){
                map.put(ch,1) ;
            }else{
                int ret=map.get(ch);
                map.put(ch,ret+1) ;
            }
        }
        for(int i=0;i<s.length();i++){
            ////拿到ch字符出现的个数
            char ch=s.charAt(i) ;
            if(map.get(ch)==1){
                return i;
            }

        }
        return -1;

    }
    public static int distributeCandies(int[] candies) {
        //每次让妹妹分得糖果的种类多。但弟弟妹妹每人得到的糖果数是相同的
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int s:candies){
            if(!map.containsKey(s)){
                map.put(s,1);
            }else{
                int ret=map.get(s);
                map.put(s,ret+1);
            }
        }
        int count=map.size();//糖果的种类
        int result=0;
        if(count>=candies.length/2){
            result=candies.length/2;
        }else{
            result=count;
        }
        return result;

    }
    public static boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int ch:arr){
            if(!map.containsKey(ch)){
                map.put(ch,1);
            }else{
                int ret=map.get(ch);
                map.put(ch,ret+1);
            }
        }
        Set<Integer> set=map. keySet();
       int[]array=new int[set.size()];
       int i=0;
       for(Integer s:set){
           array[i++]=s;
       }
       for(i=0;i<array.length;i++){
           for(int j=i+1;j<array.length;j++){
               if(map.get(array[i])==map.get(array[j])){
                   return false;
               }
           }
       }
       return true;
    }

    public static void main(String[] args) {
        int[] arr={-3,0,1,-3,1,1,1,-3,10,0};
        boolean ret=uniqueOccurrences(arr) ;
        System.out.println(ret);
    }
    public static void main6(String[] args) {
        int[]candies={1,1,2,2,2,3,3,3,4,4};

       int result= distributeCandies(candies ) ;
        System.out.println(result );
    }
    public static void main5(String[] args) {

        String s="loveleetcode";
        int ret=firstUniqChar(s);
        System.out.println(ret);
    }
    public static void main4(String[] args) {
        int[]nums1={4,9,5};
        int[]nums2={9,4,9,8,4};
        int[] list=intersect(nums1,nums2) ;

        System.out.println(Arrays.toString(list) );

    }
    public static void main3(String[] args) {
        String str1="ab";
        String str2="aa";
        boolean ch=isIsomorphicHelper(str1, str2);
        System.out.println(ch);

    }
    public static void main2(String[] args) {
        BinarySearchTree binarySearchTree =new BinarySearchTree() ;
       int[]array={7,2,9,18,56,15,3};
        for (int i:array) {
            binarySearchTree .insert(i) ;
        }
        binarySearchTree .preOrder(binarySearchTree .root) ;
        System.out.println();
        binarySearchTree .inOrder(binarySearchTree .root) ;
        System.out.println();
        System.out.println(binarySearchTree.search(18).val);
        System.out.println("==================================");
        binarySearchTree .remove(18) ;
        binarySearchTree .preOrder(binarySearchTree .root) ;
        System.out.println();
        binarySearchTree .inOrder(binarySearchTree .root) ;
        System.out.println();
    }
    public int numJewelsInStones(String J, String S) {
        char[] array1=J.toCharArray() ;
        char[] array2=S.toCharArray() ;
        Set<Character > set=new HashSet<>();
       for(char ch:array1){
           set.add(ch) ;
       }
       int count=0;
       for(int i=0;i<array2.length ;i++){
           if(set.contains(array2 [i]) ){
              count++;
           }
       }
       return count;
    }
    public static int heightChecker(int[] heights) {
        int[]array=Arrays.copyOf(heights ,heights .length) ;
        Arrays .sort(array) ;
        int count=0;
        for(int i=0;i<array.length ;i++){
                if(array [i]!=heights [i]){
                    count++;
                }
        }
    return count;
    }
    public static int numOfSubarrays(int[] arr, int k, int threshold) {
        if(arr.length==0){
            return 0;
        }
        int sum=0;
        for(int i=0;i<=arr.length-k;i++){
            int j=0;
            int count=0;
            while(j!=k){
                count +=arr[i+j];
                j++;
            }
            if(count>=k*threshold){
                sum++;
            }
        }
        return sum;
    }
    public static void main1(String[] args) {
        int[] arr={2,2,2,2,5,5,5,8};
        int k=3;
        int threshold=4;
        int num=numOfSubarrays(arr,k,threshold ) ;
        System.out.println(num);
        int[]arr1={1,2,3,4,5};
        int re=heightChecker(arr1);
        System.out.println(re);
       /* MyArrayList <Integer> my1=new MyArrayList<>() ;
        my1.add(1);
        my1.add(2);
        my1.add(3);
        my1.add(4);
        my1.display() ;
*/
    }
}
