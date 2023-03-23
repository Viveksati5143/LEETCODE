class Solution {
    public int largestAltitude(int[] gain) {
        int start = 0, max = 0;
        for(int i=0;i<gain.length;i++){
            start += gain[i];
            if(start>max) max = start;
        }
        return max;
    }
}