/**
 * @author 张瑞瑞
 * @date 2020/08/04 10:52
 */
public class Test {
    public static void main(String[] args) {
        MyLinkedList myLinkedList=new MyLinkedList();
        myLinkedList.addFirst(12);
        myLinkedList.addFirst(34);
        myLinkedList.addFirst(56);
        myLinkedList.addLast(22);
        myLinkedList.addLast(44);
        myLinkedList.addLast(66);
        myLinkedList.display();
        myLinkedList.addIndex(1,120);
        myLinkedList.display();
        System.out.println(myLinkedList.findIndex(56));
        myLinkedList.remove(66);
        myLinkedList.display();


    }
    public static void main1(String[] args) {
        MyArrayList myArrayList=new MyArrayList();
        myArrayList.add(0,12);
        myArrayList.add(1,23);
        myArrayList.add(2,34);
        myArrayList.display();
        myArrayList.add(1,111);
        myArrayList.add(2,12);
        myArrayList.display();
        myArrayList.remove(12);
        myArrayList.display();

    }
}
