class Solution {
    public String restoreString(String s, int[] indices) {
        String[] res = new String[s.length()];
        for (int i = 0; i < indices.length; i++) {
            res[indices[i]] = String.valueOf(s.charAt(i));
        }
        return String.join("", res);
    }
}