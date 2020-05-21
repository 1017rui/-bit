import java.util.ArrayList;
import java.util.List;

/**
 * @author 张瑞瑞
 * @date 2020/05/20 22:40
 */
class Node{
    public int val;
    public Node left;
    public Node right;
    public Node(int val){
        this.val=val;
    }
}
public class BinaryTree {
    // 前序遍历  递归实现
    public void preOrderTraversal(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.val+" ");//根
        preOrderTraversal(root.left) ;//左
        preOrderTraversal(root.right) ;//右

    }
    //OJ 上实现前序遍历
    public List<Integer> preorderTraversal(Node root) {
        List<Integer> list=new ArrayList<>();
        if(root==null){
            return list;
        }
        //System.out.print(root.val+" ");//根
        list.add(root.val);
        List<Integer> left=preorderTraversal(root.left) ;//左
        list.addAll(left) ;//把左边的添加到list当中
        List<Integer> right=preorderTraversal(root.right) ;//右
        list.addAll(right) ;//把右边的添加到list当中
        return list;
    }
    // 中序遍历
    public void inOrderTraversal(Node root){
        if(root==null){
            return;
        }
        inOrderTraversal(root.left) ;
        System.out.print(root.val+" ");
        inOrderTraversal(root.right) ;
    }
    //OJ 上实现中序遍历
    public List<Integer> inorderTraversal(Node root) {
        List<Integer> list=new ArrayList<>();
        if(root==null){
            return list;
        }
        List<Integer> left=inorderTraversal(root.left) ;//左
        list.addAll(left) ;//把左边的添加到list当中
        //System.out.print(root.val+" ");//根
        list.add(root.val);
        List<Integer> right=inorderTraversal(root.right) ;//右
        list.addAll(right) ;//把右边的添加到list当中
        return list;
    }
    // 后序遍历
    public void postOrderTraversal(Node root) {
        if (root == null) {
            return;
        }
        postOrderTraversal(root.left);
        postOrderTraversal(root.right);
        System.out.print(root.val + " ");
    }

    //OJ 上实现后序遍历
    public List<Integer> postorderTraversal(Node root) {
        List<Integer> list=new ArrayList<>();
        if(root==null){
            return list;
        }
        List<Integer> left=postorderTraversal(root.left) ;//左
        list.addAll(left) ;//把左边的添加到list当中
        List<Integer> right=postorderTraversal(root.right) ;//右
        list.addAll(right) ;//把右边的添加到list当中
        //System.out.print(root.val+" ");//根
        list.add(root.val);
        return list;
    }
    // 遍历思路-求结点个数
    public static int size = 0;
    public void getSize1(Node root){
        if(root==null){
            return;
        }
        size++;
        getSize1(root.left);
        getSize1(root.right);
    }
    // 子问题思路-求结点个数
    public int getSize2(Node root){
        if(root==null){
            return 0;
        }
        return 1+getSize2(root.left) +getSize2(root.right) ;
    }

    // 遍历思路-求叶子结点个数   左右都为空的节点为叶子节点
    public static int leafSize = 0;
    public void getLeafSize1(Node root){
        if(root==null){
            return;
        }
        if(root.left==null&&root.right==null){
            leafSize++;
        }
        getLeafSize1(root.left) ;
        getLeafSize1(root.right) ;
    }
    // 子问题思路-求叶子结点个数
    public int getLeafSize2(Node root){
        if(root==null){
            return 0;
        }
        if(root.left==null&&root.right==null){
            return 1;
        }
        return getLeafSize2(root.left) +getLeafSize2(root.right) ;

    }
    // 子问题思路-求第 k 层结点个数
    public int getKLevelSize(Node root,int k){
        if(root==null){
            return 0;
        }
        if(k==1){
            return 1;
        }
        return getKLevelSize(root.left,k-1)+getKLevelSize(root.right,k-1) ;

    }
    // 获取二叉树的高度  左树和右树之间最高的+1
   public int getHeight(Node root){
        if(root==null){
            return 0;
        }
        int leftHeight=getHeight(root.left) ;
        int rightHeight=getHeight(root.right) ;

       return (leftHeight >rightHeight) ?(leftHeight +1):(rightHeight +1);

    }
    // 查找 val 所在结点，没有找到返回 null
// 按照 根 -> 左子树 -> 右子树的顺序进行查找
// 一旦找到，立即返回，不需要继续在其他位置查找
   public Node find(Node root, int val){
        if(root==null) {
           return null;
       }
        if(root.val==val){
            return root;
        }
        //去左边找
       Node left=find(root.left, val);
        if(left!=null) {
            return left;
        }
        //去右边找
       Node right=find(root.right, val);
       if( right!=null) {
           return right;
       }
        return null;
    }
    //判断两个二叉树是否相等
    public boolean isSameTree(Node p, Node q) {
        if(p==null&&q==null){
            return true;
        }
        if(p==null || q==null){
            return false;
        }
        //p,q都不为空的情况
        if(p.val==q.val){
           return isSameTree(p.left,q.left)&&isSameTree(p.right ,q.right) ;
        }
        return false;
    }
    //首先手动创建一棵二叉树
    public Node buildBinaryTree(){
        Node A=new Node(1);
        Node B=new Node(2);
        Node C=new Node(3);
        Node D=new Node(4);
        Node E=new Node(5);
        Node F=new Node(6);
        Node G=new Node(7);
        Node H=new Node(8);
        A.left=B;
        A.right=C;
        B.left=D;
        B.right=E;
        C.left=F;
        C.right=G;
        D.left=H;
        return A;
    }
}
