class Solution {
    public String freqAlphabets(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = str.length()-1; i >= 0;) {
            int encodedDigit = str.charAt(i) - '0';
            int shift;
            if (encodedDigit >= 1 && encodedDigit <= 9) shift = 1;
            else {
                encodedDigit = (str.charAt(i - 2) - '0') * 10 + (str.charAt(i - 1) - '0');
                shift = 3;
                }
            sb.append((char) ('a' + encodedDigit - 1));
            i -= shift;
        }
        return sb.reverse().toString();
    }
} 