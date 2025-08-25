class Solution {
    private boolean isRepeatedKTimes(char[] src, String pat, int k) {
        char[] p = pat.toCharArray();
        int n = src.length, m = p.length, i = 0;

        while (k-- > 0) {
            int j = 0;
            while (i < n && j < m) {
                if (src[i] == p[j]) j++;
                i++;
            }
            if (j != m) return false;
        }
        return true;
    }

    public String longestSubsequenceRepeatedK(String s, int k) {
        char[] ch = s.toCharArray();
        int n = ch.length;
        int[] f = new int[26];
        for (int i = 0; i < n; i++) f[ch[i] - 'a']++;

        ArrayList<String>[] c = new ArrayList[8];
        c[1] = new ArrayList<>();
        String res = "";

        for (int i = 0; i < 26; i++) {
            if (f[i] >= k) {
                String t = "" + (char) ('a' + i);
                res = t;
                c[1].add(t);
            }
        }

        for (int l = 2; l < 8; l++) {
            c[l] = new ArrayList<>();
            for (String pre : c[l - 1]) {
                for (String suf : c[1]) {
                    String comb = pre + suf;
                    if (isRepeatedKTimes(ch, comb, k)) {
                        res = comb;
                        c[l].add(comb);
                    }
                }
            }
        }
        return res;
    }
}
