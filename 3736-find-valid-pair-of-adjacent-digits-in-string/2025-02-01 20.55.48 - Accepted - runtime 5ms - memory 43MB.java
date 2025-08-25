class Solution {
    public String findValidPair(String s) {
        int[] fre= new int[10];
        for (char ch : s.toCharArray()) {
            fre[ch - '0']++;
        }
        for (int i = 0; i < s.length() - 1; i++) {
            char first = s.charAt(i);
            char second = s.charAt(i + 1);
            if (first != second && fre[first - '0'] == first - '0' 
                && fre[second - '0'] == second - '0') {
                return "" + first + second;
            }
        }
        return "";
    }
}