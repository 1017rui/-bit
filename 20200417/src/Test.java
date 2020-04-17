/**
 * @author 张瑞瑞
 * @date 2020/04/17 15:06
 */
class TestDemo{
    public int a;
    public static int count;
}
public class Test{
  public static void main(String[] args) {
    TestDemo t1 = new TestDemo();
    t1.a++;
    TestDemo.count++;
    System.out.println(t1.a);//1
    System.out.println(TestDemo.count);//1
    System.out.println("============");
    TestDemo t2 = new TestDemo();
    t2.a++;//1
    TestDemo.count++;//2
    System.out.println(t2.a);
    System.out.println(TestDemo.count);
  }
}

