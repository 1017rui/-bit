/**
 * @author 张瑞瑞
 * @date 2020/05/26 14:38
 */
class Node{
    public int val;
    public Node left;
    public Node right;
    public Node(int val){
        this.val=val;
    }

}
public class Tree {
    public Node create(){
        Node a1=new Node(1);
        Node a2=new Node(0);
        Node a3=new Node(1);
        Node a4=new Node(0);
        Node a5=new Node(1);
        Node a6=new Node(0);
        Node a7=new Node(1);
        a1.left=a2;
        a1.right=a3;
        a2.left=a4;
        a2.right=a5;
        a3.left=a6;
        a3.right=a7;
        return a1;

    }
    //给定一棵二叉树，上面每得每个节点的值都是0或者1，每一条从根节点到叶子节点的路径都代表一个从最高有效位开始的二进制树
    public  int sumRootToLeaf(Node root) {
        if(root==null){
            return 0;
        }
       return sumRootToLeafChild(root,0);
    }
    public int sumRootToLeafChild(Node root,int result) {
        if(root==null){
            return 0;
        }
        result=(result<<1)+root.val;
        if(root.left==null&&root.right==null){
            return result;
        }
        return sumRootToLeafChild(root.left,result) +sumRootToLeafChild(root.right,result) ;
    }
     public int diameterOfBinaryTree(Node root) {
        if(root==null){
            return 0;
        }
        int left=high(root.left);
        int right=high(root.right);
         if(left!=0&&right!=0){
             return left+right;
         }
         if(left!=0){
             return left+1;
         }
         if(right!=0){
             return right+1;
         }
         return 0;

    }
    public int high(Node root){
        if(root==null){
            return 0;
        }
        int left=high(root.left);
        int right=high(root.right);

        return (left>right)?left+1:right+1;
    }
}
