class Solution {
    public int maxSubArray(int[] nums) {
        int csum = nums[0];
        int osum = nums[0];        
        for(int i=1;i<nums.length;i++){
            if(csum>=0) csum += nums[i]; 
            else csum = nums[i];
            if(csum > osum) osum = csum;            
        }
        return osum;
    }
}