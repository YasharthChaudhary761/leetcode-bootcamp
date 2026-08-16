class Solution {
    private int[] dp;
    public int find(int n)
    {
        if(n<=2) return n;
        if(dp[n]!=0) return dp[n];
        int ans=find(n-1)+find(n-2);
        dp[n]=ans;
        return ans;
    }
    public int climbStairs(int n) {
        dp=new int[n+1];
        return find(n);
    }
}