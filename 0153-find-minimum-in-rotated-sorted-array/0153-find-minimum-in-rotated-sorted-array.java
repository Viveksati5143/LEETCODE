class Solution {
    public int findMin(int[] arr) {
        int start = 0;
        int end = arr.length-1;
        while(start<end-1){
            int mid = start + (end-start)/2;
            // if(mid>start && arr[mid]>arr[mid+1]) return arr[mid+1];
            // // if(mid<end && arr[mid-1]>arr[mid]) return arr[mid];
            // // if(mid>start && arr[mid]>=arr[start]) start = mid + 1;
            // else end = mid - 1;     
            if(arr[mid]>arr[end]) start = mid;
            else end = mid;
        }
        if (arr[start] > arr[end]) return arr[end]; 
        return arr[start];
    }
}