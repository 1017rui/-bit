/**
 * @author 张瑞瑞
 * @date 2020/06/15 18:35
 * 创建线程（匿名类）
 */

//各自占用一定的时间片去运行
public class CreateThreadWithNimingLei {
    public static void main(String[] args) {
        //new要继承的类
        Thread t= new Thread(() -> {//lambda表达式
            while(true){
                System.out.println("我是子线程");
            }
        });


        /*Thread t=new Thread(){//new要继承的类
        //覆写相应的方法
            @Override
            public void run() {//匿名类
                while(true){
                    System.out.println("我是子线程");
                }
            }
        };*/
        t.start() ;//t就是创建出的子类的对象
        while(true){
            System.out.println("我是main线程");
        }

    }
}
