class Solution {
    public int fib(int n) {

        // Tabulation approach of dp + space optimisation
        if(n<=1) return n;
        int dp[]=new int[3];
        dp[0]=0;
        dp[1]=1;

        for(int i=1;i<n;i++)
        {
            dp[2]=dp[0]+dp[1];
            dp[0]=dp[1];
            dp[1]=dp[2];
        }
        return dp[2];
    }

    //       Recursive dp

    // static int[] dp;
    // public int find(int n)
    // {
    //     if(n<=1) return n;
    //     if(dp[n]!=0) return dp[n];
    //     int ans=find(n-1)+find(n-2);
    //     dp[n]=ans;
    //     return ans;
    // }
    // public int fib(int n) {
    //     dp=new int[n+1];
    //     return find(n);
    // }


    /**
         // Tabulation approach of dp
        if(n<=1) return n;
        int dp[]=new int[n+1];
        dp[0]=0;
        dp[1]=1;

        for(int i=2;i<=n;i++)
        {
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n];
     */
}