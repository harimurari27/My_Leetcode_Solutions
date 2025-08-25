class Solution {
    public String sortString(String s) {
        int[] a = new int[26];
        for (int i = 0; i < s.length(); i++)
            a[s.charAt(i) - 'a']++;
        StringBuilder sb = new StringBuilder();
        while (sb.length() < s.length()) {
            for (int i = 0; i < 26; i++) {
                if (a[i] > 0) {
                    sb.append((char) ('a' + i));
                    a[i]--;
                }
            }
            for (int i = 25; i >= 0; i--) {
                if (a[i] > 0) {
                    sb.append((char) ('a' + i));
                    a[i]--;
                }
            }
        }
        return sb.toString();
    }
}
