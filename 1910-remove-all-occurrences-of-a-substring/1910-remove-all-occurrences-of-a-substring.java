class Solution {
    public String removeOccurrences(String s, String part) {
        return skip(s, part);
    }
    
    String skip(String s, String part) {    
        int index = s.indexOf(part);
        if(index == -1) return s;
        return skip(s.substring(0, index) + s.substring(index + part.length()), part);
    }
}