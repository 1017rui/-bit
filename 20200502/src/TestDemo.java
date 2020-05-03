/**
 * @author 张瑞瑞
 * @date 2020/05/02 18:29
 */
class A{
    public String name;
    public A(String name){
        System.out.println("你骄傲！");
    }
}
class B extends A{
    public B(String name) {
        super(name);
    }
}
class C extends B{
    public C(String name) {
        super(name);
    }
}
public class TestDemo {
    public static void main(String[] args) {
        A a=new A("zhanga");
        A b=new B("zhangb");
        A c=new C("zhangc");
    }
}
