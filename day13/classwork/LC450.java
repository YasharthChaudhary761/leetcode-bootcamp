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

    public TreeNode find(List<Integer> ans, int l, int r)
    {
        if(l>r) return null;
        int m=l+(r-l)/2;

        TreeNode node=new TreeNode(ans.get(m));

        node.left=find(ans, l, m-1);
        node.right=find(ans, m+1, r);

        return node;
    }

   public void inorder(TreeNode root, List<Integer> ans)
   {
        if(root==null) return;

        inorder(root.left, ans);
        ans.add(root.val);
        inorder(root.right, ans);
   }

    public TreeNode deleteNode(TreeNode root, int key) {
        ArrayList<Integer> ans=new ArrayList<>();
        inorder(root, ans);
        ans.remove(Integer.valueOf(key));
        int n=ans.size();
        return find(ans,0,n-1);
    }
}



/**
      public TreeNode findLastRight(TreeNode root)
    {
        if(root.right==null) return root;
        return findLastRight(root.right);
    }

    public TreeNode find(TreeNode root)
    {
        if(root.left==null) return root.right;
        else if(root.right==null) return root.left;
        else
        {
            TreeNode rightChild=root.right;
            TreeNode lastRight=findLastRight(root.left);
            lastRight.right=rightChild;
            return root.left;
        }

    }

    public TreeNode deleteNode(TreeNode root, int key) {
        if(root==null) return null;
        if(root.val==key) return find(root);

        TreeNode dummy=root;
        while(root!=null)
        {
            if(root.val>key)
            {
                if(root.left!=null && root.left.val==key)
                {
                    root.left=find(root.left);
                    break;
                }
                else root=root.left;
            }

            else
            {
                if(root.right!=null && root.right.val==key)
                {
                    root.right=find(root.right);
                    break;
                }
                else root=root.right;
            }
        }
        return dummy;
    }
 */