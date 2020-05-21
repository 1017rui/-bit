import java.util.List;

/**
 * @author 张瑞瑞
 * @date 2020/05/20 22:39
 */
public class TestDemo {
    public static void main(String[] args) {
        BinaryTree binaryTree =new BinaryTree() ;
        Node ret=binaryTree .buildBinaryTree() ;
        System.out.println("==============前序遍历================");
        System.out.println("==============方式一：================");
        binaryTree .preOrderTraversal(ret) ;
        System.out.println();
        System.out.println("==============方式二：================");
        List<Integer> list1=binaryTree .preorderTraversal(ret) ;
        System.out.println(list1);
        System.out.println("==============中序遍历================");
        System.out.println("==============方式一：================");
        binaryTree .inOrderTraversal(ret) ;
        System.out.println();
        System.out.println("==============方式二：================");
        List<Integer> list2=binaryTree .inorderTraversal(ret) ;
        System.out.println(list2);
        System.out.println("==============后序遍历================");
        System.out.println("==============方式一：================");
        binaryTree .postOrderTraversal(ret) ;
        System.out.println();
        System.out.println("==============方式二：================");
        List<Integer> list3=binaryTree .postorderTraversal(ret) ;
        System.out.println(list3);
        binaryTree .getSize1(ret) ;
        System.out.println(BinaryTree .size );
        System.out.println(binaryTree.getSize2(ret));
        binaryTree .getLeafSize1(ret) ;
        System.out.println(BinaryTree .leafSize );
        System.out.println(binaryTree.getLeafSize2(ret));
        System.out.println(binaryTree.getKLevelSize(ret, 3));
        System.out.println(binaryTree.getHeight(ret));
        Node cur=binaryTree .find(ret,9);
        System.out.println(cur.val);
    }
}
