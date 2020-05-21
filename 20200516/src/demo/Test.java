package demo;

import java.util.*;

/**
 * @author 张瑞瑞
 * @date 2020/05/16 22:06
 */
class Student{
    public String name;
}
public class Test {
    public static void main(String[] args) {
        Queue<Integer> queue=new LinkedList<>() ;

        //Queue<Integer> queue=new PriorityQueue<>(); //使用Queue接口new一个对象
        PriorityQueue <Integer> priorityQueue =new PriorityQueue<>() ;//也可以直接new一个对象
        //priorityQueue .offer(new Student());//error
        //priorityQueue .offer(new Student());//放置的元素必须要能够比较大小
        priorityQueue .offer(10);
        priorityQueue .offer(2);
        priorityQueue .offer(21);
        priorityQueue .offer(8);
        System.out.println(priorityQueue.peek());//底层是一个小堆。


    }

    public static void main1(String[] args) {
        BinaryTree binaryTree = new BinaryTree();
        Node ret = binaryTree.buildTree(" ABC##DE#G##F###");
        System.out.println("前序遍历====================");
        binaryTree.preOrderTraversal(ret);
        System.out.println();

        System.out.println("===========前序遍历，非递归实现===========");
        binaryTree .preOrderTraversalNor(ret);

        System.out.println("中序遍历====================");
        binaryTree.inOrderTraversal(ret);
        System.out.println();

        System.out.println("===========中序遍历，非递归实现===========");
        binaryTree .inOrderTraversalNor(ret) ;

        System.out.println("后序遍历====================");
        binaryTree .postOrderTraversal(ret) ;
        System.out.println();

        System.out.println("===========后序遍历，非递归实现===========");
        binaryTree .postOrderTraversalNor(ret) ;
        /*
        binaryTree .getSize1(ret) ;
        System.out.println(BinaryTree .size );
        System.out.println(binaryTree.getSize2(ret));
        binaryTree .getLeafSize1(ret) ;
        System.out.println(BinaryTree .leafSize  );
        System.out.println(binaryTree .getLeafSize2(ret) );*/
       /*Node tmp=binaryTree .find(ret,'E');
        System.out.println(tmp.val);*/

        System.out.println("============层序遍历============");
        binaryTree.levelOrderTraversal(ret);
        List<List<Character >>list =binaryTree .levelOrder(ret);
        System.out.println(list);
        System.out.println(binaryTree.isCompleteTree(ret));
    }
}
