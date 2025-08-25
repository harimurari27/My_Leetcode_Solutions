class Solution {
    public boolean hasSpecialSubstring(String s, int k) {
        for (int i = 0; i <= s.length() - k; i++) {
            char ch = s.charAt(i);
            boolean a = true;
            for (int j = i; j < i + k; j++) {
                if (s.charAt(j) != ch) {
                    a = false;
                    break;
                }
            }
            if (a) {
                if ((i == 0 || s.charAt(i - 1) != ch) && (i + k == s.length() || s.charAt(i + k) != ch)) {
                    return true;
                }
            }
        }
        return false;
    }
}
