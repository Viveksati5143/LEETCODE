class Solution {
    public char findTheDifference(String s, String t) {
        int CC = t.charAt(s.length());
        
        for(int i=0;i<s.length();++i){
            CC -= (int)s.charAt(i);
            CC += (int)t.charAt(i); 
        }
        return (char)CC;
    }
}