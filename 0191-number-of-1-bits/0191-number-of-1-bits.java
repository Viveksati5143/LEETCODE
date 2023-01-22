public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {        
		int temp = 0;        
		while(n!= 0){
            n &= (n - 1); 
            temp++;
        }		
        return temp;
    }
}