class Solution {
    public String restoreString(String s, int[] indices) {
        char[] res = s.toCharArray();
        for (int i = 0; i < indices.length; i++) {
            res[indices[i]] = s.charAt(i);
        }
        return new String(res);
    }
}