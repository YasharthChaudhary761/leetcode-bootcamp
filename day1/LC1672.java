class Solution {
    public int maximumWealth(int[][] accounts) {
        int max=Integer.MIN_VALUE;
        int n=accounts[0].length;
        for(int i=0;i<accounts.length;i++)
        {
            int sum=0;
            for(int j=0;j<n;j++)
            {
                sum=sum + accounts[i][j];
            }
            max=Math.max(sum, max);
        }
        return max;
    }
}