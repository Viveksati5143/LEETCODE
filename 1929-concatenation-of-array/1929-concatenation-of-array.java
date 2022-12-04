class Solution {
    public int[] getConcatenation(int[] nums) {
        // int n = nums.length;
        int[] ans= new int[2*nums.length];
        for(int i=0;i<nums.length;i++) ans[i+nums.length]=ans[i]=nums[i];
        return ans;
    }
}