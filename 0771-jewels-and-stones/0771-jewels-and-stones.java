class Solution {
     public int numJewelsInStones(String jewels, String stones){
        int res = 0;
        Set ans = new HashSet();
        for(char j: jewels.toCharArray()) ans.add(j);
        for(char s: stones.toCharArray()) if(ans.contains(s)) res++;
        return res;
    }
}