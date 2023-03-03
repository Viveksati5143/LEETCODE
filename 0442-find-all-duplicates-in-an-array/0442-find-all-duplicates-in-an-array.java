class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        int i = 0;
        while(i<nums.length){
            int correct = nums[i] - 1;
            if(nums[i]!=nums[correct]) swap(nums,i,correct);
            else i++;
        }
        
        List<Integer> res = new ArrayList<>();
        for(int index = 0; index < nums.length; index++){
            if(nums[index]!= index+1) res.add(nums[index]); //since cyclic sort so it should be equal
        } //index+1 coz nums starts with 1 not 0
        return res;
    }
    
    void swap(int[] arr, int first, int last){
        int temp = arr[first];
        arr[first] = arr[last];
        arr[last] = temp;
    }
}