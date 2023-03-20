class Solution {
    public int maxDistance(int[] nums1, int[] nums2) {
     int s1=0,s2=0,res=0,e1=nums1.length,e2=nums2.length;
        while(s1<e1 && s2<e2){
            if(nums1[s1]>nums2[s2]) s1++;
            else res=Math.max(res,s2++-s1);
        }
        return res;   
    }
}