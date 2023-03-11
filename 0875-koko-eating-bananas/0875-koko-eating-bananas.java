class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int start = 1;
        int end = 1000000000;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(canEatInTime(piles,mid,h)) end = mid - 1;
            else start = mid + 1;        
        }
        return start;        
    }
    boolean canEatInTime(int[] piles, int k, int h){
        long hours = 0;
        for(int pile: piles){
            hours += (pile + k - 1) / k;
        }
        return hours <= h;
    }
}