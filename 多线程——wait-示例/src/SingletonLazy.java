/**
 * @author 张瑞瑞
 * @date 2020/06/19 19:22
 * 懒汉模式
 */

public class SingletonLazy {
    // 1. 需要保存该类唯一对象的引用
    private static SingletonLazy instance = null;

    //第二版 ：
    // 线程安全的情况   加锁了 加了synchronized修饰
    //能保证线程安全 但不是最优化的版本
    public synchronized static SingletonLazy getInstance() {
        if (instance == null) {//在这里判断的时候instance == null
            //到这里实例化的时候
            instance = new SingletonLazy();
        }
        return instance;
    }

    //第一版：
    // 线程不安全的情况
    public static  SingletonLazy getInstanceUnsafe() {
        // getInstance 被调用的时候，代表有人需要
        // 该类的对象了
        // 所以应该实例出对象出来了 —— 按需加载

        /*
        if (instance == null) {
            // 代表对象还没有被初始化
            // 需要先初始化
            instance = new SingletonLazy();
            return instance;
        } else {
            // 代表 instance 已经指向了一个对象了
            // 所以我们不需要实例化对象了
            // 直接返回该对象的引用即可
            return instance;
        }
        */

        if (instance == null) {//在这里判断的时候instance == null
            //到这里实例化的时候 instance有可能已经不是null了
            instance = new SingletonLazy();
        }

        return instance;
}

    private SingletonLazy() {

    }
}

