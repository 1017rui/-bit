/**
 * @author 张瑞瑞
 * @date 2020/06/08 21:42
 */
public class Test {
    public static void main(String[] args) {
        int[]array={1,2,3,4,5};
        int i=0;
        for (int s:array) {
            System.out.println(array[i++]);
        }
    }
    static int cnt=6;
    static{
        cnt+=9;
    }
    public static void main1(String[] args) {
       /* double x=3.0;
        int y=5;
        x/=--y;
        System.out.println(x);*/
        System.out.println(cnt);
    }
    static {
        cnt/=3;
    };
}
