/**
 * @author 张瑞瑞
 * @date 2020/04/21 13:10
 */
//用于测试MyArraysList类
public class TestDemo {
    public static void main(String[] args) {
        MyArraysList my=new MyArraysList() ;
        for(int i=0;i<10;i++){
            my.add(i,i);
        }
        my.display();
        my.add(10,112);
        my.display();
       /* System.out.println(my.contains(112));
        System.out.println(my.search(1));
        System.out.println(my.search(112));
        System.out.println(my.getPos(10) );*/
       my.setPos(0,12);
       my.setPos(10,15);
       //my.setPos(15,7);
        my.remove(112) ;
       my.display() ;
        System.out.println(my.size());
    }
}
