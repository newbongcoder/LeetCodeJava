class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int result[]=new int[nums.length];
        
        for(int i=0;i<result.length;i++)
        {
            for(int j=0;j<result.length;j++)
            {
                if(nums[i]>nums[j])
                {
                    result[i]++;
                }
            }
        }
        return result;
        
    }
}
