/**
 * @author 张瑞瑞
 * @date 2020/04/30 12:21
 */
//力扣数组题目：
//在歌曲列表中，第 i 首歌曲的持续时间为 time[i] 秒。
//返回其总持续时间（以秒为单位）可被 60 整除的歌曲对的数量。
// 形式上，我们希望索引的数字 i 和 j 满足  i < j 且有 (time[i] + time[j]) % 60 == 0。
/*
public class TestArray {
    public static int numPairsDivisibleBy60(int[] time) {
        int countBy60=0;
        //定义一个数组用于存放time中的数组对60取余后0-59之间每个余数出现的次数
        int count[]=new int[60];
        for(int t : time) {
            count[t % 60] += 1;
        }
        //对于余数为0和30的值，每次两两组合，假设0和30的余数出现的次数为k .那么两两组合的结果为k*(k-1)/2
        countBy60+=count[0]*(count[0]-1)/2;
        countBy60+=count[30]*(count[30]-1)/2;
        //其余1与59组合，2与58组合，故使用双指针分别从1和59两头向中间遍历。1的情况出现m次，59的情况出现n次，则总共有m*n种组合。
        for(int i=1,j=59;i<j;i++,j--){
            countBy60 +=count[i]*count[j];
        }
        return countBy60 ;
    }

        public static int numPairsDivisibleBy601(int[] time) {
        int count=0;
        for(int i=0;i<time.length;i++){
            for(int j=0;j<time.length;j++){
                if(i<j&&((time[i]+time[j])%60==0)){
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[]time={30,20,150,100,40};
        int countBy60=numPairsDivisibleBy60(time);
        System.out.println(countBy60 );
    }

}
*/
//旅游方案选择A[i]+A[j]-(j-i) 较大的
    //=A[i]+i+A[j]-j
public class TestArray{
    public static int max(int a,int b){
        return (a>b)?a:b;
    }
    //大佬的
    // 每次把A[i]+i置成最大的，然后在和后面的相加 A[i]+i+A[j]-j判断是否最大
    public static int bestProgram2(int[]A){
        int max=0;
        int maxelementaddindex=A[0]+0;
        for(int i=1;i<A.length;i++){
          max = max(max,maxelementaddindex +A[i]-i);
          maxelementaddindex =max(maxelementaddindex ,A[i]+i);
        }
        return max;
    }

    //运行时超出了时间限制
    public static int bestProgram1(int[]A){
        int left=0;
        int right=A.length-1;
        int result=0;
        while(left<right){
            for(right=A.length-1;right>left;right--){
                result=max(result,A[left]+A[right]-(right-left));
            }
            right=A.length-1;
            left++;
        }
       return result;
    }

    //存在问题：考虑的不够全面
    public static int bestProgram(int[]A){
        int left=0;
        int right=A.length-1;
        int result=0;
        while(left<right){
            result=max(result,A[left]+A[right]-(right-left));
            if(A[left]<A[right]){
                left++;
            }else{
                right--;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int[]A={6,9,10,5,9,10,4,5};
        int result=bestProgram2(A) ;
        System.out.println(result);

    }
}