package demo;


import java.util.*;

/**
 * @author 张瑞瑞
 * @date 2020/05/16 21:50
 * 二叉树
 */
class Node{
    public char val;
    public Node left;//左孩子
    public Node right;//右孩子

    public Node(char val) {
        this.val = val;
    }
}
public class BinaryTree {
    // 前序遍历  递归实现
    public void preOrderTraversal(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.val+" ");
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);

    }
    // 中序遍历
    public void inOrderTraversal(Node root){
        if(root==null){
            return;
        }
        inOrderTraversal(root.left);
        System.out.print(root.val+" ");
        inOrderTraversal(root.right);
    }
    // 后序遍历
    public void postOrderTraversal(Node root){
        if(root==null){
            return;
        }
        postOrderTraversal(root.left);
        postOrderTraversal(root.right);
        System.out.print(root.val+" ");
    }
    // 遍历思路-求结点个数
    static int size = 0;
    public void getSize1(Node root){
        if(root==null){
            return;
        }
        //节点不为空 size++
        size++;
        getSize1(root.left);
        getSize1(root.right);

    }
    // 子问题思路-求结点个数
   public  int getSize2(Node root){
        if(root==null){
            return 0;
        }
        //左树结点个数+右树结点个数+自己本身
        return getSize2(root.left) +getSize2(root.right) +1;
    }
    // 遍历思路-求叶子结点个数
    static int leafSize = 0;
    public void getLeafSize1(Node root){
        if(root==null){
            return;
        }
        if(root.left==null&&root.right==null){
            leafSize++;
        }else {
            getLeafSize1(root.left);
            getLeafSize1(root.right);
        }
    }
    // 子问题思路-求叶子结点个数
    public int getLeafSize2(Node root){
        if(root==null){
            return 0;
        }
        if(root.left==null&&root.right==null) {
            return 1;
        }
        return getLeafSize2(root.left) +getLeafSize2(root.right) ;
    }
    // 子问题思路-求第 k 层结点个数== 左树的k-1层+右树的k-1层
    public int getKLevelSize(Node root,int k){
        if(root==null){
            return 0;
        }else if(k==1){
            return 1;
        }else{
           return  getKLevelSize(root.left,k-1)+getKLevelSize(root.right,k-1);
        }
    }
    //获得二叉树的高度   左树和右树相比的最大高度+1
    public int getHeight(Node root){
        if(root==null){
            return 0;
        }
        int leftHeight=getHeight(root.left);
        int rightHeight=getHeight(root.right);
        return leftHeight >rightHeight ?leftHeight +1:rightHeight +1;
    }
    // 查找 val 所在结点，没有找到返回 null
  // 按照 根 -> 左子树 -> 右子树的顺序进行查找
  // 一旦找到，立即返回，不需要继续在其他位置查找
    public Node find(Node root, char val){
        if(root==null){
            return null;
        }
        //1.判断根节点是否是查找的数字val
        if(root.val ==val) {
            return root;
        }
        //2.左边   递归-》当左边全部递归完成之后 判断返回值是否为空

       if(find(root.left,val)!=null){
           return find(root.left,val);
       }
        //3.右边
        if(find(root.right,val)!=null){
            return find(root.right,val);
        }
        return null;
    }
    //判断两个二叉树是否相同
    public boolean isSame(Node p,Node q){
        if((p==null&&q!=null)||(p!=null&&q==null)){
            return false;
        }
        if(p==null&&q==null){
            return true;
        }
        if(p.val ==q.val){//根节点相同
            return isSame(p.left,q.left)&&isSame(p.right,q.right) ;
        }
        return false;
    }
    //判断t是否为s的子树
    public boolean isSubtree(Node s, Node t) {
        if(s == null || t == null) {
            return false;
        }
        //判断t树是不是s树的本身
        if(isSame(s,t) ){
            //如果是说明t树是s树的字数
            return true;
        }
        //否则，判断s树的左树，右树 是不是t树的子树
        return isSubtree(s.left,t)||isSubtree(s.right,t);
    }
    //判断一个数是否为平衡二叉树
    public boolean isBalanced(Node root) {
        if(root==null){
            return true;
        }
        int leftHeight=maxDepth(root.left );
        int rightHeight=maxDepth(root.right );
        return Math.abs(leftHeight -rightHeight) <=1&&isBalanced(root.left)&&isBalanced(root.right);
       /* if(maxDepth(root.left )-maxDepth(root.right) <=1||maxDepth(root.right )-maxDepth(root.left)<=1){
        if(isBalanced(root.left)&&isBalanced(root.right) ) {
            return true;
        }
    }
    return false;*/
    }
    //求深度
    public int maxDepth(Node root) {
        if(root == null) {
            return 0;
        }
        int leftHeight = maxDepth(root.left);
        int rightHeight = maxDepth(root.right);
        return leftHeight >  rightHeight? leftHeight+1 :
                    rightHeight+1;
        }
        //层序遍历
    public void levelOrderTraversal(Node root){
        if(root==null){
            return ;
        }
        Queue<Node> queue=new LinkedList<>();
        queue .offer(root);
       while(!queue.isEmpty() ) {
           Node cur = queue.poll();
           System.out.print(cur.val + " ");
           if(cur.left!=null) {
               queue.offer(cur.left);
           }
           if(cur.right!=null) {
               queue.offer(cur.right);
           }
       }
        System.out.println();
    }
    public List<List<Character >> levelOrder(Node root) {
        List<List<Character >> ret = new LinkedList<>();
        if(root == null) return ret;
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            //1、求当前队列的大小  size
            int size=queue .size();
            //2、while(size > 0)  -->控制当前每一层的数据个数
            List <Character > list=new ArrayList<>() ;
            while(size>0){
                Node cur = queue.poll();
                list.add(cur.val);

                if(cur.left!=null) {
                    queue.offer(cur.left);
                }
                if(cur.right!=null) {
                    queue.offer(cur.right);
                }
                size--;
            }
            ret.add(list);
        }

        return ret;
    }

    // 判断一棵树是不是完全二叉树
    public boolean isCompleteTree1(Node root){
        if(root==null||root.left==null&&root.right==null){
            return true;
        }
        if(root.left==null){
            return false;
        }
        return isCompleteTree1(root.left)&&isCompleteTree1(root.right) ;
    }
    // 前序遍历  非递归写法
    void preOrderTraversal1(Node root){

    }
    // 中序遍历  非递归写法
    void inOrderTraversal1(Node root){
        if(root==null){
            return;
        }
        Stack<Character > stack=new Stack<>();
       while(root!=null){
           while(root!=null){
               stack.push(root.val);
               root=root.left;
           }
           char top=stack.pop();

       }


    }
    // 后序遍历  非递归写法
    void postOrderTraversal1(Node root){

    }
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
        return A;//返回头节点

    }
}
