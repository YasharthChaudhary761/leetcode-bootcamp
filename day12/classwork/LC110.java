/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int height(TreeNode root)
    {
        if(root==null) return 0;
        int left_height=height(root.left);
        int right_height=height(root.right);
        if(left_height==-1) return -1;
        if(right_height==-1) return -1;

        if(Math.abs(right_height-left_height)>1) return -1;

        return Math.max(left_height, right_height)+1;
    }


    public boolean isBalanced(TreeNode root) {
        int ans=height(root);
        if(ans==-1) return false;
        return true;
    }
}


/**
    public int height(TreeNode root)
    {
        if(root==null) return 0;
        int leftHeight=height(root.left);
        int rightHeight=height(root.right);
        return Math.max(rightHeight, leftHeight)+1;
    }
    public boolean isBalanced(TreeNode root) {
        if(root==null) return true;
        int leftHeight=height(root.left);
        int rightHeight=height(root.right);

        if(Math.abs(leftHeight-rightHeight)>1) return false;
        return isBalanced(root.left) && isBalanced(root.right);
    }
 */

/**
     public int height(TreeNode root)
    {
        if(root==null) return 0;
        int leftHeight=height(root.left);
        int rightHeight=height(root.right);
        return Math.max(height(root.left), height(root.right))+1;
    }
    public boolean isBalanced(TreeNode root) {
        if(root==null) return true;
        int leftHeight=height(root.left);
        int rightHeight=height(root.right);

        if(Math.abs(leftHeight-rightHeight)>1) return false;
        return isBalanced(root.left) && isBalanced(root.right);
    }

 */