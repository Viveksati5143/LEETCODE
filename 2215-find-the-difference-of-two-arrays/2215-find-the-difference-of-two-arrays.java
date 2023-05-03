class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> a = new HashSet<Integer>();
        Set<Integer> b = new HashSet<Integer>();
        
        for(int i : nums1) a.add(i);
        
        for(int i : nums2) b.add(i);
        
        List<List<Integer>> res = new ArrayList();
        res.add(new ArrayList());
        res.add(new ArrayList());
        for(int i : a){
            if(!b.contains(i)) res.get(0).add(i);
        }
        for(int i : b){
            if(!a.contains(i)) res.get(1).add(i);
        }        
        return res;
    }
}