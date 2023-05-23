class Solution {
    public int minStartValue(int[] nums) {
        if (nums == null) {
            throw new IllegalArgumentException("Input array is null");
        }

        int min = 0;
        int sum = 0;

        for (int n : nums) {
            sum += n;
            min = Math.min(min, sum);
        }
        return 1 - min;
    }
}