/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public TreeNode find(TreeNode root, TreeNode p, TreeNode q)
    {
        if(root==null) return null;
        TreeNode node=root;
        if(root.val==p.val || root.val==q.val)
        {
            return node;
        }

        if(root.val>p.val && root.val>q.val) return find(root.left, p, q);
        if(root.val<p.val && root.val<q.val) return find(root.right, p, q);
        return node;
    }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        return find(root, p, q);
    }
}