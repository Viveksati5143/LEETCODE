class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList();//result        
        res.add(new ArrayList());
        for(int n : nums){//1 2 3
            int i= res.size();
            for(int j=0;j<i;j++){
            List<Integer> temp = new ArrayList(res.get(j));//[]
            temp.add(n);//[1]
            res.add(temp);//[][1]
            }            
        }
    return res;
    }
}