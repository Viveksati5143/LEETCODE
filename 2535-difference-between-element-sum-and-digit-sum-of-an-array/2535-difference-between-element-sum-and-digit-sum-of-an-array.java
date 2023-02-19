class Solution {
    public int differenceOfSum(int[] nums) {
    int x = 0, y = 0;
    for(int i=0;i<nums.length;i++) {
        x += nums[i];
        if (nums[i] >= 10) {
            while (nums[i] > 0) {
                y += nums[i] % 10;
                nums[i] /= 10;
            }
        } 
        else y += nums[i];
    }
    return x - y;
    }
}