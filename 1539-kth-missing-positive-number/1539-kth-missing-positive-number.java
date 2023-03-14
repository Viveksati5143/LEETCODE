class Solution {
    public int findKthPositive(int[] nums, int k) {
        int start = 0;
        int end = nums.length;
        while(start<end){
            int mid = start + (end - start)/2;
            if(nums[mid]-mid-1<k) start = mid + 1;
            else end = mid;
        }
        return start + k;        
    }
}
