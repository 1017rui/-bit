/**
 * @author 张瑞瑞
 * @date 2020/06/17 11:19
 * 线程状态
 */
public class PrintAllThreadState {
    public static void main(String[] args) {
        Thread.State[] values=Thread.State .values() ;
        for(Thread.State s:values){
            System.out.println(s);
        }
    }
}
