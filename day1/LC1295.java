class Solution {
    public boolean isEven(int x)
    {
        int count=0;
        while(x!=0)
        {
            count++;
            x=x/10;
        }
        if(count%2==0) return true;
        return false;
    }
    public int findNumbers(int[] nums) {
        int even_count=0;
        for(int i=0;i<nums.length;i++)
        {
            if(isEven(nums[i])==true) even_count++;
        }
        return even_count;
    }
}