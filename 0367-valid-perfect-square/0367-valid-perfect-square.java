class Solution {
    public boolean isPerfectSquare(int num) {
        int start = 1;
        int end = num;
        while(start<=end){
            int mid = start + (end-start)/2;
            long res = (long)mid * mid;
            if(res==num) return true;
            if(num<res) end = mid - 1;
            else start = mid + 1;
        }
        return false;
    }
}