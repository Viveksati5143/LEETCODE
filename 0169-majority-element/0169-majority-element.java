class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2];
//         for(int i=1;i<nums.length;i++)
//         {
//             int count=0;
//             if(nums[i--]==nums[i]) count++;
//             else continue;
//         }
//         if(count<=1)
//             return count;   
//             return 0;
     }
 }