class Solution {
    public String mergeAlternately(String word1, String word2) {
        int l1 = word1.length(), l2 = word2.length();
        
        char[] res = new char[l1 + l2];
        int p1 = 0, p2 = 0, resP = 0;
        
        while (p1 < l1 || p2 < l2){
            if (p1 < l1) res[resP++] = word1.charAt(p1++);
            if (p2 < l2) res[resP++] = word2.charAt(p2++);
        }
        return new String(res);
    }
}