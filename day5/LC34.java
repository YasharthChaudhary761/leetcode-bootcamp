class Solution {
    public int first(int nums[], int target)
    {
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==target) return i;
        }
        return -1;
    }

    public int last(int nums[], int target)
    {
        for(int i=nums.length-1;i>=0;i--)
        {
            if(nums[i]==target) return i;
        }
        return -1;
    }

    public int[] searchRange(int[] nums, int target) {
        int f=first(nums,target);
        int l=last(nums,target);
        int ans[]=new int[2];
        ans[0]=f;
        ans[1]=l;
        return ans;
    }
}