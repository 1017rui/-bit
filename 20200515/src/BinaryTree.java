/**
 * @author 张瑞瑞
 * @date 2020/05/15 18:32
 */
class Node{
    public char  val;
    public Node left;//左孩子
    public Node right;//右孩子

    public Node(char val) {
        this.val = val;
    }
}
public class BinaryTree {
    //手动创建一棵二叉树
    public Node buildTree(){
        Node A=new Node('A');
        Node B=new Node('B');
        Node C=new Node('C');
        Node D=new Node('D');
        Node E=new Node('E');
        Node F=new Node('F');
        Node G=new Node('G');
        Node H=new Node('H');
        A.left=B;
        A.right=C;
        B.left=D;
        B.right=E;
        E.right=H;
        C.left=F;
        C.right=G;

        return A;
    }
    // 前序遍历
   public void preOrderTraversal(Node root){
        if(root==null){
            return ;
        }
       System.out.print(root.val+" ");
       preOrderTraversal( root.left);
       preOrderTraversal( root.right);

    }
    // 中序遍历 左根右
    public void inOrderTraversal(Node root)
    {
        if(root==null){
            return;
        }
        inOrderTraversal(root.left);
        System.out.print(root.val+" ");
        inOrderTraversal(root.right);



    }
    // 后序遍历 左右根
    public void postOrderTraversal(Node root){
        if(root==null){
            return;
        }
        postOrderTraversal(root.left);
        postOrderTraversal(root.right);
        System.out.print(root.val+" ");
    }
    // 遍历思路-求结点个数 以前序遍历
    public static int size = 0;
    public void getSize1(Node root){
        if(root==null){
            return ;
        }
        size++;
        getSize1( root.left);
        getSize1( root.right);

    }
    // 子问题思路-求结点个数 左树的节点个数+右数的节点个数+本身
    public int getSize2(Node root){
        if(root==null){
            return 0;
        }
        int num1=getSize2(root.left) ;
        int num2=getSize2(root.right) ;
        return num1+num2+1;
    }
    // 遍历思路-求叶子结点个数
    static int leafSize = 0;
    public void getLeafSize1(Node root){
        if(root==null){
            return ;
        }
        if(root.left==null&&root.right==null) {
            leafSize ++;
        }else{
            getLeafSize1(root.left);
            getLeafSize1(root.right);
        }
    }
    // 子问题思路-求叶子结点个数  左树的叶子节点+右树的叶子节点
    public int getLeafSize2(Node root){
        if(root==null){
            return 0;
        }
        if(root.left==null&&root.right==null) {//如果左右节点为空，即为叶子节点
            return 1;
        }

      return getLeafSize2(root.left ) +getLeafSize2(root.right) ;
    }
}
