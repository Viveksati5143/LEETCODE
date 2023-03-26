class Solution {
    public int pivotInteger(int n) {
        int leftSum = 0;
        int sum = n*(n+1)/2;

        for(int i=1; i<=n; i++){
            leftSum += i;
            int rightSum = sum - leftSum + i;
            if (leftSum == rightSum) return i;
        }
        return -1;
    }
}