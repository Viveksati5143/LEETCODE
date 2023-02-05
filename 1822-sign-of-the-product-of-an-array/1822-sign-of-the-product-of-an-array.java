class Solution {
    public int arraySign(int[] nums) {
        int product=1;
        for(int i: nums){
            if(i==0) return 0;
            if(i<0) product = -product;
        }
        return product;
    }
}