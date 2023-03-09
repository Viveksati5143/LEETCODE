class Solution {
    public int[] fairCandySwap(int[] alice, int[] bob) {
        int A = 0, B = 0;
        for(int i=0;i<alice.length;i++) A += alice[i]; 
        for(int j=0;j<bob.length;j++) B += bob[j]; 
        int diff = (A-B)/2;
        Arrays.sort(alice);
        for(int num:bob){
            if(binarySearch(alice,num+diff) != -1) return new int[]{num+diff,num};
        }
        return null;
    }
    int binarySearch(int[] arr,int target){ 
        int s=0, e=arr.length-1;
        
        while(s<=e){
            int mid = s+ (e-s)/2;
            if(arr[mid]==target) return mid;
            else if(arr[mid]<target) s=mid+1;
            else e=mid-1;            
        }
        return -1;
    }
}