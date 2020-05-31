

/**
 * @author 张瑞瑞
 * @date 2020/05/31 17:20
 */
class MyHashSet {
    class Node{
        public int val;
        public Node left;
        public Node right;
        public Node(int val){
            this.val=val;
        }
    }
    public Node root=null;
    /** Initialize your data structure here. */
    public MyHashSet() {

    }

    public void add(int key) {
        Node node=new Node(key);
        if(root==null){
            root=node;
            return;
        }
        Node cur=root;
        Node parent=null;
        while(cur!=null){
            if(cur.val==key){
                //集合中存放不重复的节点
                return;
            }else if(cur.val>key){
                parent =cur;
                cur=cur.left;
            }else{
                parent =cur;
                cur=cur.right;
            }
        }
        if(parent .val>key){
            parent.left=node;
        }else{
            parent.right=node;
        }

    }

    public void remove(int key) {
        Node cur=root;
        Node parent=null;
        while(cur!=null){
            if(cur.val==key){
                //说明找到了要删除的节点
                removeNode(parent ,cur) ;
            }else if(cur.val>key){
                parent =cur;
                cur=cur.left;
            }else{
                parent =cur;
                cur=cur.right;
            }
        }

    }
    private void removeNode(Node parent,Node cur){
        if(cur.left==null){
            if(cur==root){
                root=cur.right ;
            }else if(cur==parent .left){
                parent.left=cur.right;
            }else{
                parent.right=cur.right;
            }
        }else if(cur.right==null){
            if(cur==root){
                root=cur.left;
            }else if(cur==parent .left){
                parent.left=cur.left;
            }else{
                parent.right=cur.left;
            }

        }else{
            //cur的左右节点都不为空
            //去cur的右树的最左边找到叶子节点为替罪羊节点
            //将cur的val值赋值成为替罪羊节点的val值
            //将替罪羊节点删除
            Node targetParent=cur;
            Node target=cur.right;
            while(target.left!=null){
                targetParent =target ;
                target =target.left;
            }
            //target就是要找的替罪羊节点
            cur.val=target.val;
            if(target ==targetParent .left){
                targetParent .left=target .right;
            }else{
                targetParent .right=target .right;
            }
        }
    }
    /** Returns true if this set contains the specified element */
    public boolean contains(int key) {
        Node cur=root;
        while(cur!=null){
            if(cur.val==key){
                return true;
            }else if(cur.val>key){
                cur=cur.left;
            }else{
                cur=cur.right;
            }
        }
        return false;
    }
}