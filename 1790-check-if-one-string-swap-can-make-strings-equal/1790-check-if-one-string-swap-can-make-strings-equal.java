class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        int[] s1Array = new int[26];
        int[] s2Array = new int[26];
        int res = 0;
        for(int i = 0;i<s1.length();i++) {
            char x = s1.charAt(i);
            char y = s2.charAt(i);
            if(x != y) res++;
            if(res > 2) return false;
            s1Array[x -'a']++;
            s2Array[y -'a']++;
      }
      return Arrays.equals(s1Array, s2Array);
    }
}