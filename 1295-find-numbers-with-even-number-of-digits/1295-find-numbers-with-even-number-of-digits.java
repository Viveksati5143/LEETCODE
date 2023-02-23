class Solution {
    public int findNumbers(int[] nums) {
        int count, res=0;
        for(int i=0;i<nums.length;i++){
            count = 0;
            while(nums[i]!=0){
                nums[i] /= 10;
                count++;
            }
            if(count %2==0) res++;
        }
        return res;
    }
}