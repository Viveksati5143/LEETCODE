class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
	int[] res = new int[nums1.length];

	Stack<Integer> s = new Stack<>();
	HashMap<Integer, Integer> map = new HashMap<>();

	for(int n: nums2){
        while(!s.isEmpty() && n > s.peek()){
            map.put(s.pop(), n);
		}
		s.add(n);
	}
	int i = 0;
	for(int n : nums1) res[i++] = map.getOrDefault(n, -1);
	return res;
    }
}