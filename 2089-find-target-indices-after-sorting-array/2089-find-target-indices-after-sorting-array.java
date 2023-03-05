class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        for (int i=0; i<nums.length-1; i++) {
            for (int j=i+1; j>0; j--) {
                if(nums[j] < nums[j-1]) swap(nums, j, j-1);
                else break;
            }
        }        
        List<Integer> res = new ArrayList<>();
        for(int index=0; index<nums.length; index++) if(nums[index]==target) res.add(index); 
        return res;       
    }
    void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}