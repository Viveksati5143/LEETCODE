class Solution {
    public int heightChecker(int[] heights) {
        int[] sol =  Arrays.copyOf(heights, heights.length);
        Arrays.sort(heights);
        int res = 0;
        for(int i=0;i<heights.length;i++){
            if(heights[i]!=sol[i]) res++;    
        }
        return res;
    }
}