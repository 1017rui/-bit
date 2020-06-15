/**
 * @author 张瑞瑞
 * @date 2020/06/15 18:35
 */
public class CreateThreadWithNimingLei {
    public static void main(String[] args) {
        Thread t=new Thread(){
            @Override
            public void run() {
                while(true){
                    System.out.println("我是子线程");
                }
            }
        };
        t.start() ;
        while(true){
            System.out.println("我是main线程");
        }

    }
}
