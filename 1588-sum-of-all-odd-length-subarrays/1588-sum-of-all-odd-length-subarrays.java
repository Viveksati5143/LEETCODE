class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int sum = 0;
        int n = arr.length;
        
        for (int i = 0; i < n; i++) {
            int end = i + 1;
            int start = n - i;
            int totalSubarrays = end * start;
            int oddSubarrays = totalSubarrays / 2;
            if (totalSubarrays % 2 == 1) oddSubarrays++;
            sum += oddSubarrays * arr[i];
        }        
        return sum;
    }
}