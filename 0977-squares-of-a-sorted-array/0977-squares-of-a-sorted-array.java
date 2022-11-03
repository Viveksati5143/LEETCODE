class Solution {
    public int[] sortedSquares(int[] nums) {
        //Brute Force
//         for(int i=0;i<nums.length;i++)
//         {
//             nums[i]=(nums[i]*nums[i]);
//         }
//         Arrays.sort(nums);
//         return nums;        
//     }
// }
        int left = 0;
        int right = nums.length -1;
        int index = nums.length- 1;
        int result[] = new int [nums.length];
        while(left<=right)
        {
            if(Math.abs(nums[left])>Math.abs(nums[right]))
            {
                result[index] = nums[left] * nums[left];
                left++;
            }
            else
            {
                result[index] = nums[right] * nums[right];
                right--;
            }
            index--;
        }
        return result;
    }
};