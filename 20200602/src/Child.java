import java.util.LinkedList;
import java.util.List;

/**
 * @author 张瑞瑞
 * @date 2020/06/03 12:37
 */
class Base{
    public Base(String s){
        System.out.println("B");
    }
}

public class Child  extends Base {
    public Child(String s){
        super(s);
        System.out.println("D");
    }



    public static void main(String[] args) {
      new Child("C");
    }

}
