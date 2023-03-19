class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
	Arrays.sort(nums1);
	Arrays.sort(nums2);
	int start = 0;
	int end = 0;
	List<Integer> res = new ArrayList<>();

	while(true){
		if(start >= nums1.length || end >= nums2.length) break;
		if(nums1[start] == nums2[end]){
			res.add(nums1[start]);
			start ++;
			end ++;
		}
		else if(nums1[start] < nums2[end]) start ++;
		else if(nums1[start] > nums2[end]) end ++;
    }
        int[] ans = new int[res.size()];
        for (int i=0; i<res.size(); i++) ans[i] = res.get(i);
        return ans;
    }
}