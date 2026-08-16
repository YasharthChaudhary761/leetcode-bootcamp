class Solution {
    public void find(char[] s, int l, int r)
    {
        if(l>=r) return;
            find(s,l+1,r-1);
            char temp=s[l];
            s[l]=s[r];
            s[r]=temp;
        
    }
    public void reverseString(char[] s) {
        int l=0;
        int n=s.length-1;
        int r=n;
        find(s,l,r);
    }
}