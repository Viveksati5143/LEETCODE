class Solution {
    public int maxProfit(int[] P, int F) {
        int len = P.length, b = 0, s = -P[0];
        for (int i = 1; i < len; i++) {
            b = Math.max(b, s + P[i] - F);
            s = Math.max(s, b - P[i]);
        }
        return b;
    }
}