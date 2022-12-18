class Solution {
    public String toLowerCase(String str) {
    char[] c = str.toCharArray();
        for (int i = 0; i < c.length; i++)
            if ('A' <= c[i] && c[i] <= 'Z')
                c[i] = (char) (c[i] - 'C' + 'c');
        return new String(c);
    }
}