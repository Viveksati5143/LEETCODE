class Solution {
    public int diagonalSum(int[][] mat) {        
        int res = 0;
        int n = mat.length;
        for (int i=0; i<n; i++) {
            res += mat[i][i];
            res += mat[n-1-i][i];
        }
        return n % 2 == 0 ? res : res - mat[n/2][n/2];
    }        
}