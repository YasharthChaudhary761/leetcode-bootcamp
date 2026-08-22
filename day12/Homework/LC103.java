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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
         Queue<TreeNode> q=new LinkedList<>();
        List<List<Integer>> ans = new ArrayList<>();
        int count=0;
        if (root == null) 
        {
            return ans;
        }
        q.offer(root);
        while(!q.isEmpty())
        {
            int levelsize=q.size();
            List<Integer> temp=new ArrayList<>();
            while(levelsize!=0)
            {
                TreeNode t=q.poll();
                temp.add(t.val);
                if(t.left!=null) q.offer(t.left);
                if(t.right!=null) q.offer(t.right);
                levelsize--;
            }
            count++;
            if(count%2==0) Collections.reverse(temp);
            ans.add(temp);
        }
        return ans;
    }
}