/**
 * @author 张瑞瑞
 * @date 2020/05/26 14:53
 */
public class Test {
    public static void main(String[] args) {
        Tree tree=new Tree();
        Node root=tree.create() ;
        int result=tree.sumRootToLeaf(root);
        System.out.println(result);
        int num=tree.diameterOfBinaryTree(root) ;
        System.out.println(num);
    }
}
