import java.util.List;

/**
 * @author 张瑞瑞
 * @date 2020/05/20 22:39
 */
public class TestDemo {
    public static void main(String[] args) {
        BinaryTree binaryTree =new BinaryTree() ;
        Node ret=binaryTree .buildBinaryTree();
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
        Node cur=binaryTree .find(ret,5);
        System.out.println(cur.val);
        System.out.println("===========层序遍历===========");
        binaryTree .levelOrderTraversal(ret);
        System.out.println(binaryTree .isCompleteTree(ret) );
        List<List<Integer>> list=binaryTree .levelOrder(ret);
        System.out.println(list);
        //Node A=new Node(3);
        //Node B=new Node(7);
        Node p=ret.left.right;
        Node q=ret.left.left.left;
        Node ret1=binaryTree.lowestCommonAncestor(ret, p, q);
        System.out.println(ret1.val);

    }
}
