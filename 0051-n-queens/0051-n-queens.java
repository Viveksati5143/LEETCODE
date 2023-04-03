class Solution {
    public List<List<String>> solveNQueens(int n) {
        char board[][] = new char[n][n];
        for(char i[] : board) Arrays.fill(i, '.');
        List<List<String>> res = new ArrayList<>();
        queens(0, board, res);
        return res;
    }
    public void queens(int col, char board[][], List<List<String>> res){
        if(col == board.length){
            res.add(count(board));
            return;
        }
        
        for(int row = 0; row < board.length; row++){
            if(isSafe(board, row, col)){
                board[row][col] = 'Q';
                queens(col + 1, board, res);
                board[row][col] = '.';
            }
        }
    }
    public boolean isSafe(char board[][], int row, int col){
        int dRow = row;
        int dCol = col;
        
        while(row >= 0 && col >= 0){
            if(board[row][col] == 'Q') return false;
            row--;
            col--;
        }
        row = dRow;
        col = dCol;
        while(col >= 0){
            if(board[row][col] == 'Q') return false;
            col--;
        }
        row = dRow;
        col = dCol;
        while(col >= 0 && row < board.length){
            if(board[row][col] == 'Q') return false;
            col--;
            row++;
        }
        return true;
    }
    public List<String> count(char board[][]){
        List<String> res = new ArrayList<>();
        for(int i = 0; i < board.length; i++){
            String s = new String(board[i]);
            res.add(s);
        }
        return res;
    }
}