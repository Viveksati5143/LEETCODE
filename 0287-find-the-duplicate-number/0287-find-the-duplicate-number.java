class Solution {
    public int findDuplicate(int[] nums) {
        int i = 0;
        while(i<nums.length){
            int correct = nums[i] - 1;
            if(nums[i]!=nums[correct]) swap(nums,i,correct);
            else i++;
        }
        
        for(int index = 0; index < nums.length; index++){
            if(nums[index]!= index+1) return nums[index]; //since cyclic sort so it should be equal
        }
        return -1;
    }
    
    void swap(int[] arr, int first, int last){
        int temp = arr[first];
        arr[first] = arr[last];
        arr[last] = temp;
    }
}