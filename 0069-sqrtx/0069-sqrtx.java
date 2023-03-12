class Solution {
    public int mySqrt(int x) {
        int start = 1;
        int end = x;
        while(start<=end){
            int mid = start + (end-start)/2;
            long res = (long)mid * mid;
            if(res==x) return mid;
            if(x<res) end = mid - 1;
            else start = mid + 1;
        }
        return end;        
    }
}