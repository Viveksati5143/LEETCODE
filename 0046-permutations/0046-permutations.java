class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>(); //Powerset       
        Permutations(nums,new ArrayList(),res);
        return res;
    }
    
    void Permutations(int[] nums,List<Integer> curr,List<List<Integer>> res){
        if(curr.size()==nums.length) res.add(new ArrayList(curr));//[]
        else{
            for(int n=0;n<nums.length;n++){//1,2,3
                if(curr.contains(nums[n])) continue;
                curr.add(nums[n]);
                Permutations(nums,curr,res);//-------
                curr.remove(curr.size()-1);
            }
        }       
    }
}