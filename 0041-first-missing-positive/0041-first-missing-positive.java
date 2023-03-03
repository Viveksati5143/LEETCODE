class Solution {
    public int firstMissingPositive(int[] nums) {
        int i = 0;
        while(i<nums.length){
            int correct = nums[i] - 1;
            if(nums[i]>0 && nums[i]<=nums.length && nums[i]!=nums[correct]) swap(nums,i,correct);
            else i++;
        }
        
        for(int index = 0; index < nums.length; index++){
            if(nums[index]!= index + 1) return index + 1;//since cyclic sort so it should be equal
        } //index+1 coz nums starts with 1 not 0
        return nums.length + 1;
    }
    
    void swap(int[] arr, int first, int last){
        int temp = arr[first];
        arr[first] = arr[last];
        arr[last] = temp;
    }
}