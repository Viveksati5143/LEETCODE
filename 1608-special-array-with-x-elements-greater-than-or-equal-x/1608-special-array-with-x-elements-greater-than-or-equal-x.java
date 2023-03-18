class Solution {
    public int specialArray(int[] nums){
        Arrays.sort(nums);
        for(int i = 0; i < nums.length; i++){
            int x = nums.length-i;
            boolean first =  x<=nums[i];
            boolean sec = (i-1<0) || (x>nums[i-1]);
            if(first && sec) return x;
        }
        return -1;
    }
}