/**
 * @author 张瑞瑞
 * @date 2020/06/19 9:20
 */
class X{
    Y y=new Y();
    public X(){
        System.out.print("X");
    }
}
class Y{
    public Y(){
        System.out.print("Y");
    }
}
public class Test extends X {
    Y y=new Y();
    public Test(){
        System.out.print("Z");
    }

    public static void main(String[] args) {
        new Test();
    }

   /* private int count;
    public static void main3(String[] args) {
        Test test=new Test(88);
        System.out.println(test.count );
    }
    Test(int a){
        count=a;
    }*/

    public String name="abc";

    /*public static void main2(String[] args) {
        Test test=new Test();
        Test testb=new Test();
        System.out.println(test.equals(testb)+","+test.name.equals(testb.name ) );
    }*/
    static boolean a;
    public static void main1(String[] args) {
        System.out.println(a);
    }
}
