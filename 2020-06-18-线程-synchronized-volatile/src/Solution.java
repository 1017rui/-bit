/**
 * @author 张瑞瑞
 * @date 2020/06/19 11:27
 */

class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;
    }
}
public class Solution {

    public void MirrorChild(TreeNode leftTree,TreeNode rightTree){
        if(leftTree==null || rightTree==null){
            return;
        }
        int tmp=leftTree.val;
        leftTree.val=rightTree.val;
        rightTree.val=tmp;

        MirrorChild(leftTree.left,rightTree.right);
        MirrorChild(leftTree.right,rightTree.left);
    }
    public void Mirror(TreeNode root) {
        if(root==null){
            return;
        }
        MirrorChild(root.left,root.right);

    }
}
