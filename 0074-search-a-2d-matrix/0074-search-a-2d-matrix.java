class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length;
        int col = matrix[0].length;

        int start=0, end= row*col-1;

        while(start<=end){
            int mid = (start + end)/2;
            int mid_value = matrix[mid/col][mid%col];

            if(mid_value == target) return true;
            else if(mid_value < target) start = mid+1;
                //Should move a bit further, otherwise dead loop.
            else end = mid-1;
        }
        return false;
    }
}