class Solution {
    public int[] runningSum(int[] nums) 
    {
        int result[] = new int[nums.length];
        int i=0,sum=0;
        while(i<nums.length)
        {
            sum+=nums[i];
            result[i]=sum;
            i++;
        }
        return result;
        
    }
}
