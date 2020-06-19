/**
 * @author 张瑞瑞
 * @date 2020/06/19 19:37
 */
public class SingletonLazyTwice {
    private final String name;
    private final int age;
    private final String gender;
    private static volatile  SingletonLazyTwice  instance = null;
    // 以下写法是线程安全的么？
    // 不是
    // 这把锁加的毫无意义
    public static SingletonLazyTwice getInstanceUnsafe() {
        if(instance ==null){
            //这把锁加的毫无意义
            synchronized (SingletonLazyTwice .class){
                instance =new SingletonLazyTwice() ;
            }
        }
        return instance ;
    }
    //第三版：
    // 通过二次判断，既保证了线程安全，又减少了抢锁的次数
    //仍存在一些小错误
    public static SingletonLazyTwice getInstanceWrong() {
        if (instance == null) {
            synchronized (SingletonLazyTwice.class) {
                // instance 可能是 null，也可能不是 null
                //如果加完锁之后还为null,进行初始化
                if (instance == null) {
                    // 这里因为锁的存在，只会执行一次
                    // 保证了单例
                    instance = new SingletonLazyTwice();
                } else {
                    // 抢锁之前，instance 是 null
                    // 但是从抢锁到抢锁成功这段期间
                    // instance 已经不是 null
                    // 代表已经被之前抢到锁的线程实例化好了
                    // 也就什么都不需要做了
                }
            }
        }
        return instance;
    }
    //第四版：
    //有点代码可能会被重排序。加volatile
    public static SingletonLazyTwice getInstance() {
        if (instance == null) {
            // instance == null，然后抢锁
            // 如果 instance != null，需要抢锁么？   不需要
            // 一个线程持有锁，能干扰另一个不抢锁的线程么？  不能
            synchronized (SingletonLazyTwice.class) {

                if (instance == null) {
                    //下面的代码可能会发生重排序
                    //加volatile
                    instance = new SingletonLazyTwice();
                }
            }
        }

        return instance;
    }
    private SingletonLazyTwice (){
        name = "peixinchen";
        age = 34;
        gender = "男";
    }

}
