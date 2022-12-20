class Solution {
    public int mostWordsFound(String[] sentences) {
        int count=0;
        for(int i=0; i<sentences.length; i++) {
            count = Math.max(count,(sentences[i].split(" ")).length);
        }
        return count;
    }
}