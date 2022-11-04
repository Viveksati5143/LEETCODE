int removeDuplicates(int* nums, int numsSize){
     int InsertIndex = 1;
        for(int i=1;i<numsSize;i++){
            if(nums[i-1]!= nums[i]){     
                nums[InsertIndex] = nums[i];     
                InsertIndex++;
            }
        }
        return InsertIndex;
}