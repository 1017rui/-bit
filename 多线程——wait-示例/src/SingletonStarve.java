/**
 * @author 张瑞瑞
 * @date 2020/06/19 19:02
 * 饿汉模式的单例
 */
//通过final修饰类，避免有人定义该类的子类来构造方法（有时）
public final class SingletonStarve {
    //1.需要保存我仅有的对象
    private static final SingletonStarve instance;
    //2.饿汉模式也就是一开始就初始化
    //静态代码块 或者  直接初始化
    static {
        instance =new SingletonStarve() ;
    }
    //3.如果需要该类的对象，只能使用instance指向的对象
    //所以需要提供方法，把对象返回。
    public static SingletonStarve getInstance() {
        return instance ;
    }
    //4.尽可能的避免有人无意中构造出该类的对象
    //所以，把类的构造方法标记为private，减少误用可能
    private SingletonStarve() {

    }
}
