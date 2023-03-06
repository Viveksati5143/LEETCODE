class Solution {
    public int[] twoSum(int[] numbers, int target) {
        for(int i=0;i<numbers.length;i++){
            int start = i + 1;
            int end = numbers.length - 1;
            while(start<=end){
                int mid = start + (end-start)/2;
                int search = target - numbers[i];
                if(numbers[mid]==search) return new int[]{i+1,mid+1};
                else if(numbers[mid]>search) end = mid - 1;
                else start = mid + 1;
            }
        }
        return new int[]{-1,-1};        
    }
}