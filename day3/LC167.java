class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int n=numbers.length;
        ArrayList<Integer> ans=new ArrayList<>();
        int l=0, r=n-1;
        int sum=0;
        int result[]=new int[2];
        while(l<r)
        {
            sum=numbers[l]+numbers[r];
            if(sum==target)
            {
                result[0]=l+1;
                result[1]=r+1;
                break;
            }

            if(sum > target) r--;
            if(sum < target) l++;
        }
        return result;
    }
}