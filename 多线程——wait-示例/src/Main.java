/**
 * @author 张瑞瑞
 * @date 2020/06/19 19:07
 * 懒汉模式
 * 可能线程不安全
 */
public class Main {
    static class SubThread extends Thread{
        @Override
        public void run() {
            for(int i=0;i<1000;i++){
                {
                    //饿汉模式  线程安全
                    SingletonStarve instance = SingletonStarve.getInstance();
                    System.out.println(instance);
                }

                {
                    SingletonLazy instance1 = SingletonLazy .getInstance();
                    System.out.println(instance1);
                }
            }
        }
    }

    public static void main(String[] args) throws IllegalAccessException, InstantiationException {
        for(int i=0;i<1000;i++){
            new SubThread().start() ;
        }

        // 由于 SingletonStarve 构造方法是 private 的
        // 所以，会有语法错误
        //SingletonStarve mistake = new SingletonStarve();

        // 如果要用到该类的对象
        SingletonStarve right = SingletonStarve.getInstance();

        //小人  走后门构造出一个对象出来
        //利用反射可以构造
        SingletonStarve 强行构造=SingletonStarve .class.newInstance() ;
    }
}

