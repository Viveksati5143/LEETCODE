class Solution {
    public int[] leftRigthDifference(int[] nums) {
        int leftSum = 0, rightSum = 0;
        for(int num: nums) rightSum += num;
        for(int i=0;i<nums.length;i++){
            leftSum += nums[i];
            rightSum -= nums[i];
            nums[i] = Math.abs(rightSum - (leftSum-nums[i]));
        }
        return nums;
    }
}