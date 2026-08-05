class Solution {

    public void reverse(int nums[], int l, int r)
    {
        while(l<r)
        {
            int temp=nums[l];
            nums[l]=nums[r];
            nums[r]=temp;
            l++;
            r--;
        }
    }
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        k=k%n;
        reverse(nums, n-k,n-1);
        reverse(nums, 0, n-k-1);
        reverse(nums, 0, n-1);
        System.out.println(nums);
    }
}

/**
    int n=nums.length;
        k=k%n;
        //temp me store kro
        int temp[]=new int[k];
        for(int j=0;j<k;j++)
        {
           temp[j]=nums[n-k+j];
        }

        //shifting
         for(int i=n-k-1;i>=0;i--)
        {
            nums[i+k]=nums[i];
        }

        //storing temp value to nums
        for(int i=0;i<k;i++)
        {
            nums[i]=temp[i];
        }
        System.out.println(nums);
 */