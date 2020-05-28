/**
 * @author 张瑞瑞
 * @date 2020/05/28 19:55
 * 二叉搜索树
 */
public class BinarySearchTree {
    public static class Node{
        public int val;
        public Node left;
        public Node right;

        public Node(int val) {
            this.val = val;
        }
    }
    public Node root=null;
    //每次插入都是插入到叶子节点。
    public boolean insert(int val) {
        Node node = new Node(val);
        if (root == null) {
            root = node;
            return true;
        }
        Node cur = root;
        Node parent = null;
        while (cur != null) {
            if (cur.val == val) {
                return false;
            } else if (cur.val > val) {
                parent = cur;
                cur = cur.left;
            } else {
                parent = cur;
                cur = cur.right;
            }
        }
        //cur为空，插入
        if (parent.val > val) {
            parent.left = node;
        } else {
            parent.right = node;
        }
        return true;
    }
    public void preOrder(Node root){
        if(root==null){
            return;
        }
        System.out.println(root.val+" ");
        preOrder(root.left) ;
        preOrder(root.right) ;

    }
    public void inOrder(Node root){
        if(root==null){
            return;
        }
        inOrder(root.left) ;
        System.out.println(root.val+" ");
        inOrder(root.right) ;

    }
    //查找节点
    public Node search(int val){
        Node cur=root;
        while(cur!=null){
            if(cur.val==val){
                return cur;
            }else if(cur.val<val){
                cur=cur.right;
            }else{
                cur=cur.left;
            }
        }
        return null;
    }
    public boolean remove(int key){
        Node cur=root;
        Node parent=null;
        while(cur!=null){
            if(cur.val==key){
              removeNode(parent ,cur);
              return true;
            }else if(key<cur.val){
                parent =cur;
                cur=cur.left;
            }else{
                parent =cur;
                cur=cur.right;
            }
        }
        return true;
    }
    public void removeNode (Node parent,Node cur){

    if(cur.left==null){
        if(cur==root){
            root=cur.right;
        }else if(cur==parent .left){
            parent.left=cur.right ;
        }else{
            parent .right=cur.right ;
        }
    }else if(cur.right==null){
        if(cur==root){
            root=cur.left;
        }else if(cur==parent .left){
            parent.left=cur.left ;
        }else{
            parent .right=cur.left ;
        }
    }else{

    }
    }
}
