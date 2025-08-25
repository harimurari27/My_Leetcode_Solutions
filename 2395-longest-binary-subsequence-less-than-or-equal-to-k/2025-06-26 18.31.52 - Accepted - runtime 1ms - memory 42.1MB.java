class Solution {
    public int longestSubsequence(String s, int k) {
        int r = 0;
        long cur = 0;
        for(int i = s.length() - 1; i >= 0; --i) {
            char c = s.charAt(i);
            if(c == '0') {
                r++;
            } else if(r < 31 && cur + (1L << r) <= k) {
                cur += 1L << r;
                r++;
            }
        }
        return r;
    }
}