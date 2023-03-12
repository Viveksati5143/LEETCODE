class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        
        int m = arr1.length, n = arr2.length, count = 0;        
        Arrays.sort(arr2);
        
        for(int i=0;i<m;i++){
            
            int start = 0, end = n-1, x = arr1[i]-d, y = arr1[i]+d;
            
            while(start<=end){
                int mid = start + (end-start)/2;
                if(arr2[mid]<x) start = mid + 1;
                else if(arr2[mid]>y) end = mid - 1;
                else {
                    count++;
                    break;
                }
            }            
        }
        return m-count;        
    }
}