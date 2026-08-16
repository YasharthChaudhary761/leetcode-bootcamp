class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int l=0, r=0;
        int n=nums.length;
        HashSet<Integer> set=new HashSet<>();
        while(r<n)
        {
            if(Math.abs(l-r)>k)
            {
                set.remove(nums[l]);
                l++;
            }
            if(set.contains(nums[r])) return true;
            set.add(nums[r]);
            r++;
        }
        return false;
    }
}