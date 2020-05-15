/**
 * @author 张瑞瑞
 * @date 2020/05/15 20:01
 */
public class TestDemo {
    public static void main(String[] args) {
        BinaryTree binaryTree =new BinaryTree() ;
        Node boot=binaryTree .buildTree() ;
        binaryTree .postOrderTraversal(boot) ;
        System.out.println();
        binaryTree .getSize1(boot);
        System.out.println(BinaryTree .size );
        binaryTree .getLeafSize1(boot) ;
        System.out.println(BinaryTree .leafSize );

    }
}
