class Solution {
    public int[] minOperations(String boxes) {
        int ahead=0, behind=0, n=boxes.length();
        int[] res = new int[n];
        for(int i=0;i<n;i++){
            if(boxes.charAt(i)=='1'){
                ahead++;
                res[0]+=i;
            }
        }   
        
        if(boxes.charAt(0)=='1'){
            ahead--;
            behind++;
        }
        
        for(int i=1;i<n;i++){
            res[i]+=res[i-1]-ahead+behind;
            if(boxes.charAt(i)=='1'){
                ahead--;
                behind++;
            }
        }        
        return res;      
    }
}