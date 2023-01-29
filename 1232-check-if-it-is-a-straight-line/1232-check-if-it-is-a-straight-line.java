class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
        int x0 = coordinates[0][0], y1 = coordinates[0][1],
            x1 = coordinates[1][0], xy1 = coordinates[1][1];    
        
        int dx = x1-x0, dy = xy1-y1;
        for(int[] res: coordinates){
            int x = res[0], y=res[1];
            if(dx*(y-xy1)!= dy*(x-x1)) return false;
        }
        return true;
    }
}