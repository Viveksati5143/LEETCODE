class Solution {
    public int maxSubArray(int[] nums) {
        int lsum=nums[0], csum=nums[0];
        for(int i=1;i<nums.length;i++){
            if(csum>=0) csum+=nums[i];
            else csum = nums[i];
            if(csum>lsum) lsum=csum;
        }
        return lsum;
    }
}