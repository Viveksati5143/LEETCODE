class Solution {
    public int findMin(int[] nums) {
        int s = 0, e = nums.length-1;
        while(s<e-1){
            int mid = s + (e-s)/2;
            if(nums[mid]<nums[e]) e = mid;
            else s = mid;
            }
        if(nums[s]<nums[e]) return nums[s];
        return nums[e];
    }
}