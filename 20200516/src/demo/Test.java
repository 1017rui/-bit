package demo;

import java.util.List;

/**
 * @author 张瑞瑞
 * @date 2020/05/16 22:06
 */
public class Test {
    public static void main(String[] args) {
        BinaryTree binaryTree =new BinaryTree() ;
        Node ret=binaryTree .buildTree() ;
        System.out.println("前序遍历====================");
        binaryTree .preOrderTraversal(ret) ;
        System.out.println();
        System.out.println("中序遍历====================");
        binaryTree .inOrderTraversal(ret)  ;
        System.out.println();
        System.out.println("后序遍历====================");
       /* binaryTree .postOrderTraversal(ret) ;
        System.out.println();
        binaryTree .getSize1(ret) ;
        System.out.println(BinaryTree .size );
        System.out.println(binaryTree.getSize2(ret));
        binaryTree .getLeafSize1(ret) ;
        System.out.println(BinaryTree .leafSize  );
        System.out.println(binaryTree .getLeafSize2(ret) );*/
       /*Node tmp=binaryTree .find(ret,'E');
        System.out.println(tmp.val);*/
        System.out.println(binaryTree.isCompleteTree(ret));
        System.out.println("======================");
        binaryTree .levelOrderTraversal(ret);
        List<List<Character >>list =binaryTree .levelOrder(ret);
        System.out.println(list);
    }
}
