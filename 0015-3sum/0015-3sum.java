class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> result = new HashSet<>();
        if (nums.length < 3) return Collections.emptyList();
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++)
        {
            if (i > 0 && nums[i] == nums[i - 1])continue;
            int j=i+1;
            int k=nums.length-1;
            while(j<k)
            {
                int sum=nums[i]+nums[j]+nums[k];
                if(sum==0) result.add(Arrays.asList(nums[i],nums[j++],nums[k--]));
                else if(sum>0)k--;
                else if(sum<0)j++;                
            }
        }  
        return new ArrayList<>(result);
    }
}