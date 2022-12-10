class Solution {
    public int maximumWealth(int[][] accounts) {
        int w = 0;
        for(int i=0;i<accounts.length;i++){
            int w2 = 0;        
            for(int j=0;j<accounts[i].length;j++){
                w2 += accounts[i][j];
                }
            w = Math.max(w,w2);
            }
        return w; 
    }
}