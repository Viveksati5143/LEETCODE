class Solution {
    public int[] fairCandySwap(int[] alice, int[] bob) {
        int A = 0, B = 0;
        for(int i=0;i<alice.length;i++) A += alice[i]; 
        for(int j=0;j<bob.length;j++) B += bob[j]; 
        int diff = (A-B)/2;
        for(int i=0;i<alice.length;i++){
            for(int j=0;j<bob.length;j++){
                if(alice[i]-bob[j]==diff) return new int[]{alice[i],bob[j]};
            }
        }
        return null;
    }
}