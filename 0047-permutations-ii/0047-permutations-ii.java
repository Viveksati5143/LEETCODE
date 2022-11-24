class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {   
        List<List<Integer>> res = new ArrayList<>(); //Powerset 
        Arrays.sort(nums);
        Permutations(nums,new ArrayList(),res, new boolean[nums.length]);
        return res;
    }    
    void Permutations(int[] nums,List<Integer> curr,List<List<Integer>> res,boolean [] used){
        if(curr.size()==nums.length) res.add(new ArrayList(curr));//[]
        else{
            for(int n=0;n<nums.length;n++){//1,2,3
                if(used[n] || n > 0 && nums[n] == nums[n-1] && !used[n - 1]) continue;
                used[n]=true;
                curr.add(nums[n]);
                Permutations(nums,curr,res,used);//-----
                used[n]=false;
                curr.remove(curr.size()-1);
            }
        }       
    }
}