class Solution {

    public double find(double x, int n)
    {
        if(n==0) return 1;
        double half=find(x, n/2);
        if(n%2!=0) return x*half*half;
        else return half*half;
    }
    public double myPow(double x, int n) {
        if(n<0) return find(1/x,Math.abs(n));
        return find(x, n);
    }
}