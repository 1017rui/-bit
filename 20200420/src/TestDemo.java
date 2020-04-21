/**
 * @author 张瑞瑞
 * @date 2020/04/20 13:24
 */
public class TestDemo {
    public static void main(String[] args) {
       ArraysList arr=new ArraysList();
       for(int i=0;i<10;i++){
           arr.add(i,i);
       }
       arr.display();
       arr.add(3,112);
       arr.display();
      // arr.getPos(11);
       // System.out.println(arr.contains(112));
       // System.out.println(arr.search(10));
      /*  arr.setPos(7,67);
       arr.display() ;
       arr.remove(112);
       arr.display();*/
    }
}
