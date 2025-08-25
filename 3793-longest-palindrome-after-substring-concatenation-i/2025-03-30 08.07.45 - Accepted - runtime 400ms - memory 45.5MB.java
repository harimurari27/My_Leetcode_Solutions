class Solution {
    public int longestPalindrome(String s, String t) {
        int m = 0; 
        for (int i = 0; i <= s.length(); i++) {
            for (int j = i; j <= s.length(); j++) {
                String subS = s.substring(i, j);
                for (int k = 0; k <= t.length(); k++) {
                    for (int l = k; l <= t.length(); l++) {
                        String subT = t.substring(k, l);
                        String combined = subS + subT;
                        if (isPalindrome(combined)) {
                            m = Math.max(m, combined.length());
                        }
                    }
                }
            }
        }
        return m;
    }
    private boolean isPalindrome(String str) {
        int l = 0, r = str.length() - 1;
        while (l < r) {
            if (str.charAt(l) != str.charAt(r)) {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}
