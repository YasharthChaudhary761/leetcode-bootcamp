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
    int sum=0;
    boolean ans=false;
    public void path_sum(TreeNode root, int targetSum, int sum)
    {
        if(root==null) return;
        sum=sum+root.val;
        
        if(root.left==null && root.right==null)
        {
            if(sum==targetSum)
            {
                ans=true;
                return;
            }
        }

        path_sum(root.left, targetSum, sum);
        path_sum(root.right, targetSum, sum);
        return;
    }
    public boolean hasPathSum(TreeNode root, int targetSum) {
        // if(root==null) return false;

        path_sum(root, targetSum, sum);
        
        return ans;
    }
}