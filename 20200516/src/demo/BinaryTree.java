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
        Node left=find(root.left,val);
       if(left!=null){//不为空说明找到了，即刻返回。
           return left;
       }

        //3.否则去右边找
        Node right=find(root.right,val);
        if(right!=null){//不为空说明找到了，即刻返回。
            return right ;
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
        Queue<Node >queue=new LinkedList<>();
        queue.offer(root) ;//将根节点入队
        while(!queue.isEmpty() ){
            Node cur=queue.poll() ;//弹出队头元素
            System.out.print(cur.val+" ");//并进行打印
            if(cur.left!=null){//如果cur左不为空把它入队
                queue .offer(cur.left ) ;
            }
            if(cur.right!=null){//如果cur右不为空把它入队
                queue.offer(cur.right) ;
            }
        }
        //一旦队列为空说明二叉树已经层序遍历完了。
        System.out.println();
    }
    //层序遍历  放到一个list中
    public List<List<Character>> levelOrder(Node root) {
        List<List<Character >> ret=new ArrayList<>() ;
        if(root==null){
            return ret;
        }
        Queue<Node> queue=new LinkedList<>() ;
        queue.offer(root) ;
        while(!queue.isEmpty() ){
            List<Character > list=new ArrayList<>() ;
            int size=queue .size() ;
            while(size>0){
                Node cur=queue .poll() ;
                list.add(cur.val);
                if(cur.left!=null){
                    queue.offer(cur.left);
                }
                if(cur.right!=null){
                    queue.offer(cur.right) ;
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
        Queue<Node> queue=new LinkedList<>() ;
        queue.offer(root);
        while(!queue.isEmpty() ){
            Node cur=queue.poll();
            if(cur!=null){
                queue.offer(cur.left) ;
                queue.offer(cur.right);
            }else{//如果弹出元素为空，立即跳出这个循环。
                break;
            }
        }
        //判断当前队列里面是否全为空
        while(!queue.isEmpty() ){
            Node ret=queue.poll() ;
            if(ret!=null){
                return false ;
            }
        }
        return true;
    }
    // 前序遍历  非递归实现
    public void preOrderTraversalNor(Node root) {
        if (root == null) {
            return ;
        }
        Stack<Node> stack=new Stack<>();
        Node cur=root;
       while(cur!=null||!stack.isEmpty()){
           while(cur!=null ){
               stack.push(cur);
               System.out.print(cur.val+" ");
               cur=cur.left;
           }
           //cur为空，
           Node top=stack.pop();
           cur=top.right;
       }
        System.out.println();
    }
    // 中序遍历  非递归实现
    public void inOrderTraversalNor(Node root){
        if (root == null) {
            return;
        }
        Stack<Node> stack=new Stack<>();
        Node cur=root;
        while(cur!=null||!stack.isEmpty() ){
            while(cur!=null){
                stack.push(cur);
                cur=cur.left;
            }
            Node top=stack.pop();
            System.out.print(top.val+" ");
            cur=top.right;
        }
        System.out.println();

    }
    // 后序遍历 非递归实现
    public void postOrderTraversalNor(Node root){
        if(root==null){
            return ;
        }
        Stack<Node> stack=new Stack<>();
        Node cur=root;
        Node prev=null;
        while(cur!=null||!stack.isEmpty() ){
            while(cur!=null){
                stack.push(cur);
                cur=cur.left;
            }
            cur=stack.peek();
           if(cur.right==null ||cur.right ==prev ){
               //此时需要打印cur
               System.out.print(cur.val+" ");
               stack.pop();
               prev=cur;
               cur=null;
           }
           else{
               cur=cur .right;
           }
        }
        System.out.println();
    }
//OJ上的二叉树创建
    int i=0;
    public Node buildTree(String str){
        Node root=null;
        if(str.charAt(i)!='#' ){
            root=new Node(str.charAt(i) );
            i++;
            root.left=buildTree(str);
            root.right=buildTree(str) ;
        }else{
            i++;
        }
        return root;
    }
    //将二叉搜索树转化为有序的顺序节点。
    public Node prev=null;
    public void ConvertChild(Node pRootOfTree){
        if(pRootOfTree ==null){
            return;
        }
        ConvertChild(pRootOfTree .left) ;
        //System.out.println();
        pRootOfTree.left=prev;
        if(prev!=null){
            prev.right=pRootOfTree ;
        }
        prev=pRootOfTree ;
        ConvertChild(pRootOfTree .right) ;
    }
    public Node Convert(Node pRootOfTree) {
        if(pRootOfTree ==null){
            return null;
        }
        ConvertChild(pRootOfTree );//改变结构
        Node head=pRootOfTree ;
        while(head.left!=null){
            head=head.left;
        }
        return head;

    }
    /*public Node buildTree(){
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
    */

}
