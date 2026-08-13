class Solution {

     
    public int find(int n, int k)
    {
        if(k==1) return 0;
        int parent=(k+1)/2; 
        if(k%2==0) return 1-find(n-1, parent);
        return find(n-1, parent);
    }
    public int kthGrammar(int n, int k) {
        return find(n,k);
    }
}