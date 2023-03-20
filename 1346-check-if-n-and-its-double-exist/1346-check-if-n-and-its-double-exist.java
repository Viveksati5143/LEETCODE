class Solution {
    public boolean checkIfExist(int[] arr) {
        Arrays.sort(arr);
        // int start = 0;
        // int end = arr.length;
        // // while(arr[start]<=2){
        // while(start<end){
        //     int mid = start + (end-start)/2;
        //     // while(arr[start]==2){
        //         if(arr[start]!=arr[mid] && arr[start]*arr[mid]==arr[end-1]) return true;
        //         else if(arr[start]*arr[mid]<arr[end-1]) end--;
        //         else mid++;
        //     if(arr[start]==arr[end] || arr[start]==arr[mid]) return false;
        //     }
        //     // start++;
        // // }
        // return false;
        int zeroCount = 0;
        for (int x : arr){
            if (x != 0){
                if(binarySearch(x*2, arr)) return true;
            }
            else zeroCount++;
        }
        return zeroCount >= 2;
    }
    
    public boolean binarySearch(int x, int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        while(start <= end){
            int mid = start + (end-start)/2;
            if(nums[mid] < x) start = 1 + mid;
            else if(nums[mid] > x) end = mid - 1;
            else return true;
        }
        return false;
    }
}