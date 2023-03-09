class Solution {
    public int findMin(int[] nums) {
        int start = 0, end = nums.length-1;
        while(start< end-1){
            int mid = start + (end-start)/2;
            if(nums[mid]<nums[end]) end = mid;
            else if(nums[mid]>nums[end]) start = mid;
            else end--;
        }
        return Math.min(nums[start],nums[end]);
    }
}