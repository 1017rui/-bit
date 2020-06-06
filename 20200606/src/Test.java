/**
 * @author 张瑞瑞
 * @date 2020/06/06 8:46
 */
/*
class TestA{
    public TestA(){
        System.out.println("I'm A class");
    }
    static{
        System.out.println("static A");
    }

}
public class Test extends TestA {
    public Test(){
        System.out.println("I'm B class");
    }
    static{
        System.out.println("static B");
    }
    public static void main(String[] args) {
        new Test();
    }
}
*/

public class Test{
    public static void main(String[] args) {
        int num=10;
        int ret=test(num);
        System.out.println(ret);
    }
    public static int test(int b){
        try{
            b+=10;
            return b;
        }catch(RuntimeException e){

        }catch(Exception e2){

        }finally {
            b+=10;
            return b;
        }
    }
}
