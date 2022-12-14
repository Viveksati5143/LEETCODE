class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set ans = new HashSet();
        for (int i=0; i<9; ++i) {
        for (int j=0; j<9; ++j) {
            if (board[i][j] != '.') {
                String b = "(" + board[i][j] + ")";
                if (!ans.add(b + i) || !ans.add(j + b) || !ans.add(i/3 + b + j/3)) return false;
                }
            }
        }
        return true;
    }
}