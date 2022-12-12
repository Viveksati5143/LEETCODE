class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
	Arrays.sort(nums1);
	Arrays.sort(nums2);
	int top = 0;
	int bottom = 0;
	List<Integer> res = new ArrayList<>();

	while (true){
		if (top >= nums1.length || bottom >= nums2.length) break;
		if (nums1[top] == nums2[bottom]){
			res.add(nums1[top]);
			top ++;
			bottom ++;
		}
		else if (nums1[top] < nums2[bottom]) top ++;
		else if (nums1[top] > nums2[bottom]) bottom ++;
	}
        int[] ans = new int[res.size()];
        for (int i = 0; i < res.size(); i++) ans[i] = res.get(i);
        return ans;
    }
}