class Solution {
    public int specialArray(int[] nums) {
        Arrays.sort(nums);
        int start = 0;
        int end = nums.length;

        while(start<end){
            int mid = start + (end-start)/2;
            int count = nums.length - mid;
            if (nums[mid] >= count && (mid==0 || nums[mid-1]<count)) return count;
            else if(nums[mid]<count) start = mid + 1;
            else end = mid;
        }
        return -1;
    }
}