import sun.security.krb5.internal.CredentialsUtil;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

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
    //判断一棵树是否为另一棵树的子树
//给定两个非空二叉树 s 和 t，检验 s 中是否包含和 t 具有相同结构和节点值的子树。
    //判断t是否为s的子树
    public boolean isSubtree(Node s, Node t) {
        if(s==null||t==null){
            return false;
        }
        //都不为空
        //如果s和t相等
        if(isSameTree(s,t) ){
            return true;
        }
        //判断t是否为s的左树的子树,右树的子树
        return isSubtree(s.left,t) || isSubtree(s.right,t);
    }
    //判断一棵树是否为二叉平衡树
    //一棵高度平衡二叉树定义为：一个二叉树每个节点 的左右两个子树的高度差的绝对值不超过1。
    public boolean isBalanced(Node root) {
        if(root==null){
            return true;
        }
        //如果同时满足以下三点，即为平衡二叉树：
        //1.根节点的左右子树的高度差的绝对值不超过1
        //2.它的左树也是平衡二叉树
        //3.它的右树也为平衡二叉树
        int left=isBalancedChild(root.left);
        int right=isBalancedChild(root.right) ;
        return (Math.abs(left-right ) <=1)&&isBalanced(root.left)&&isBalanced(root.right) ;

    }
    // 获取二叉树的高度  左树和右树之间最高的+1
    public int isBalancedChild(Node root){
        if(root==null){
            return 0;
        }
        int leftHeight=isBalancedChild(root.left) ;
        int rightHeight=isBalancedChild(root.right) ;
        return (leftHeight >rightHeight) ?(leftHeight +1):(rightHeight +1);
    }
    //判断一棵树是否为对称二叉树  镜像对称
    public boolean isSymmetric(Node root) {
        if(root==null){
            return true;
        }
           return isSymmetricChild(root.left,root.right);
    }
    public boolean isSymmetricChild(Node p,Node q){
        if(p==null&&q==null){
            return true;
        }
        if(p==null || q==null){
            return false;
        }
        return (p.val==q.val)&&isSymmetricChild(p.left,q.right)&& isSymmetricChild(p.right,q.left);

    }
    // 层序遍历
    public void levelOrderTraversal(Node root){
        if(root==null){
            return;
        }
        Queue<Node> queue=new LinkedList<>();
        queue.offer(root);//让根节点入队
        while(!queue .isEmpty() ){
            Node cur=queue .poll();
            System.out.print(cur.val+" ");
            if(cur.left!=null){
                queue.offer(cur.left);
            }
            if(cur.right!=null){
                queue.offer(cur.right);
            }
        }
        System.out.println();
    }
    //层序遍历 OJ上实现
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> ret=new ArrayList<>() ;
        if(root==null){
            return ret;
        }
        Queue<Node> queue=new LinkedList<>();
        queue.offer(root);//让根节点入队
        while(!queue .isEmpty() ){
            int size=queue .size() ;
            List<Integer> list=new ArrayList<>();
            while(size!=0){
                Node cur=queue .poll();
                list.add(cur.val);
                if(cur.left!=null){
                    queue.offer(cur.left);
                }
                if(cur.right!=null){
                    queue.offer(cur.right);
                }
                size--;
            }
            ret.add(list);
        }
        return ret;
    }
    // 判断一棵树是不是完全二叉树
    public boolean isCompleteTree(Node root){
        if(root==null){
            return true;
        }
        Queue<Node> queue=new LinkedList<>();
        queue.offer(root);//让根节点入队
        while(!queue .isEmpty() ){
            Node cur=queue .poll();
            if(cur!=null) {
                queue.offer(cur.left);
                queue.offer(cur.right);
            }else{
                break;
            }
        }
        while(!queue.isEmpty() ){
            Node ret=queue.poll();
            if(ret!=null){
                return false ;
            }
        }
        return true;
    }
    //根据先序字符串建立一个二叉树
    public int i=0;
    public Node buildBinaryTreeNew(String str){
        if(str==null){
            return null;
        }
        Node tree=null;
        if(str.charAt(i)!='#' ){
            tree=new Node(str.charAt(i));
            i++;
            tree.left=buildBinaryTreeNew(str);
            tree.right =buildBinaryTreeNew(str) ;
        }else{
           i++;
        }
        return tree;
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
    //找出两个节点的最近公共祖先
    public Node lowestCommonAncestor(Node root, Node p, Node q) {
        if(root==null){
            return null;
        }
        if(p==root||q==root){
            return root;
        }
        Node left=lowestCommonAncestor(root.left,p,q);
        Node right=lowestCommonAncestor(root.right,p,q);
        if(left!=null&&right!=null){
            return root;
        }else if(left!=null){
            return left;
        }else if(right!=null){
            return right;
        }
        return null;
    }
    //输入一棵二叉搜索树，将该二叉搜索树转换成一个排序的双向链表。
    //二叉搜索树 左子树《根《右子树的节点值
    //进行中序遍历  可以有序  使用left作为双向链表的前驱，使用right作为双向链表的后继
    public Node Convert(Node pRootOfTree) {
        if(pRootOfTree ==null){
            return null;
        }
        ConvertChild(pRootOfTree );
        while(pRootOfTree .left!=null){
            pRootOfTree =pRootOfTree .left;
        }
        return pRootOfTree ;

    }
    //用以改变二叉树的结构
    public Node prev=null;
    public void ConvertChild(Node pRootOfTree) {
        if(pRootOfTree ==null){
            return ;
        }

        ConvertChild(pRootOfTree .left);
        pRootOfTree .left=prev;
        if(prev!=null){
            prev.right=pRootOfTree ;
        }
        prev=pRootOfTree ;
        ConvertChild(pRootOfTree .right );
    }
    //使用前序遍历结果和中序遍历结果创建一个二叉树
    public int preIndex=0;
    public Node bulidTreeChild(int[]preorder,int[]inorder,int inBegin,int inEnd){
        if(inBegin >inEnd ){
            return null;
        }
        Node root=new Node(preorder[preIndex ]);//创建根节点
        //在中序遍历数组中找到这个节点的下标
        int rootIndex=findIndex(inorder,inBegin,inEnd,preorder[preIndex ]);
        preIndex ++;
        if(rootIndex ==-1){
            return null;
        }
        //创建该节点的左右子树
        root.left=bulidTreeChild(preorder, inorder, inBegin, rootIndex-1 ) ;
        root.right=bulidTreeChild(preorder, inorder, rootIndex +1, inEnd  ) ;
        return root;

    }
    public static int findIndex(int[]inorder,int inBegin,int inEnd,int val){
        for(int i=inBegin ;i<=inEnd ;i++){
            if(inorder [i]==val){
                return i;
            }
        }
        return -1;//没找到
    }
    public Node bulidTree(int[]preorder,int[]inorder){
        if(preorder==null||inorder==null){
            return null;
        }
        if(preorder.length<=0||inorder.length<=0){
            return null;
        }
        return bulidTreeChild(preorder ,inorder,0,inorder.length-1);
    }
//根据中序遍历与后序遍历构建一颗二叉树
public int postIndex =0;
public Node buildTreeChild1(int[]inorder,int[]postorder,int inBegin,int inEnd){
    if(inBegin >inEnd ){
        return null;
    }
    Node root=new Node(postorder [postIndex]);//创建根节点
    //在中序遍历数组中找到这个节点的下标
    int rootIndex=findIndex(inorder,inBegin,inEnd,postorder[preIndex ]);
    postIndex --;
    if(rootIndex ==-1){
        return null;
    }
    root.right=buildTreeChild1(inorder, postorder, rootIndex +1, inEnd ) ;
    root.left=buildTreeChild1(inorder, postorder, inBegin, rootIndex -1) ;

    return root;
}
public Node buildTree1(int[]inorder,int[]postorder){
    if(inorder==null||postorder==null){
        return null;
    }
    if(inorder.length<=0||postorder.length<=0){
        return null;
    }
    postIndex=postorder.length-1;
    return buildTreeChild1(inorder ,postorder,0,inorder.length-1);
    }

    //根据二叉树创建字符串
    public void tree2strChild (Node t,StringBuffer sb){
    if(t==null){
        return;
    }
    sb.append(t.val) ;
    if(t.left==null){
        if(t.right ==null){
            return ;
        }else{
           sb.append("()") ;
        }
    }else{
        sb.append("(") ;
        tree2strChild(t.left,sb) ;//每次创建完了之后拼接一个）
        sb.append(")") ;
    }
    if(t.right==null){
        return;
    }else{
        sb.append("(");
        tree2strChild(t.right,sb);
        sb.append(")");
    }
    }
    public String tree2str(Node t) {
    StringBuffer sb=new StringBuffer() ;
    tree2strChild(t,sb);
    return sb.toString() ;
    }
}
