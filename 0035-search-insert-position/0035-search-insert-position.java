class Solution {
    public int searchInsert(int[] nums, int target) {
        int s = 0;
        int end = nums.length -1;
        while(s <= end){
            int mid = s + (end - s)/2;
            if(nums[mid] == target ) return mid;
            else if(nums[mid] < target) s = mid+1;
            else end = mid-1;
        }
        return s;        
    }
}