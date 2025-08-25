class Solution {
   public int maximumRemovals(String s, String p, int[] rem) {
    int l = 0, r = rem.length;
    int[] m = new int[s.length()];
    Arrays.fill(m, rem.length);
    for (int i = 0; i < rem.length; ++i)
        m[rem[i]] = i;
    while (l < r) {
        int x = (l + r + 1) / 2, j = 0;
        for (int i = 0; i < s.length() && j < p.length(); ++i)
            if (m[i] >= x && s.charAt(i) == p.charAt(j))
                ++j;
        if (j == p.length())
            l = x;
        else
            r = x - 1;
    }
    return l;
}

}