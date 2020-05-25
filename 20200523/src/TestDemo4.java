

/**
 * @author 张瑞瑞
 * @date 2020/05/25 23:06
 * 匿名内部类
 */
class Animal{
   public void func(){
       System.out.println("Animal::func()");
   }

}
public class TestDemo4 {
    public static void main(String[] args) {
        new Animal(){
            @Override
            public void func() {
                System.out.println("我重写了这个方法！");
            }
        }.func();
    }
}
