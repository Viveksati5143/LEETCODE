class Solution {
    public boolean judgeSquareSum(int c) {
        int start = 0;
        long end = (long)Math.sqrt(c);
        while(start <= end) {
            long sum = start*start + end*end;
            if(sum == c) return true;
            else if(sum > c) end--;
            else start++;
        }
        return false;
    }
}
