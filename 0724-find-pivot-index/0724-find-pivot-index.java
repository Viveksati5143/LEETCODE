class Solution {
    public int pivotIndex(int[] nums)
    {
        if(nums.length<1)
            return -1;
        int rsum=0, lsum=0;
        for(int x:nums)
            rsum+=x;
        for(int x=0; x<nums.length; x++)
        {
            rsum-=nums[x];
            if(rsum==lsum)
                return x;
            lsum+=nums[x];
        }
        return -1;
    }
}
// class Solution {
//     public int pivotIndex(int[] nums) {
//         int sum=0,lsum=0,rsum=0,pv=0;
//         for(int i=0;i<nums.length;i++)
//         {
//             sum+=nums[i];
//         }     
//         for(int i=0;i<nums.length;i++)
//         {
//             lsum+=nums[i];
//             rsum+=nums[i];
//             if(pv==lsum && pv==rsum)
//             {
//                 return pv;
//             }
//             else return -1; 
//         }
//         return pivotIndex;
//     }
// }