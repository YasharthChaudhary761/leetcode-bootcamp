class Solution {
    public int[] shuffle(int[] nums, int n) {
        int ans[]=new int[2*n];
        int k=0;
        for(int i=0;i<nums.length;i++)
        {
            for(int j=n;j<nums.length;j++)
            {
                if(j==i+n)
                {
                    ans[k++]=nums[i];
                    ans[k++]=nums[j];
                }
            }
        }
        return ans;
    }
}