class Solution {
    public int maxSubArray(int[] nums) {
        int ans=0,max=Integer.MIN_VALUE;
        int n=nums.length;
        for(int i=0;i<n;i++)
        {
            ans=ans+nums[i];
            if(ans>max)
            {
                max=ans;
            }
            if(ans<0) ans=0;
            
        }
        return max;      
    }
}