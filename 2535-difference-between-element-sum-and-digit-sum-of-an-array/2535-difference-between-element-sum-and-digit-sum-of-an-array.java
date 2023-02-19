class Solution {
    public int differenceOfSum(int[] nums) {
    int x = 0, y = 0;
    for(int i=0;i<nums.length;i++) {
        x += nums[i];
        if (nums[i] >= 10) {
            int remaining = nums[i];
            while (remaining > 0) {
                int digit = remaining % 10;
                y += digit;
                remaining /= 10;
            }
        } 
        else y += nums[i];
    }
    return x - y;
    }
}