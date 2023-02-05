class Solution {
    public int nearestValidPoint(int x, int y, int[][] points) {
        int index = -1; 
        for (int i = 0, minimum = Integer.MAX_VALUE; i < points.length; ++i) {
            int dx = x - points[i][0], dy = y - points[i][1];
            if (dx * dy == 0 && Math.abs(dy + dx) < minimum) {
                minimum = Math.abs(dx + dy);
                index = i;
            }
        }
        return index;
    }
}