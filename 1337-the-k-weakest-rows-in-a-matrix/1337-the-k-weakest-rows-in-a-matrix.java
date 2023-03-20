class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[0]!=b[0] ? b[0]-a[0] : b[1]-a[1]);
        int[] ans = new int[k];
        
        for (int i=0; i<mat.length; i++){
            pq.offer(new int[] {numOnes(mat[i]), i});
            if (pq.size() > k) pq.poll();
        }
        
        while(k>0) ans[--k] = pq.poll()[1];        
        return ans;
    }
    
    private int numOnes(int[] row){
        int start = 0;
        int end = row.length;
        
        while (start < end){
            int mid = start + (end - start)/2;
            
            if(row[mid] == 1) start = mid + 1;
            else end = mid;
        }        
        return start;
    }
}