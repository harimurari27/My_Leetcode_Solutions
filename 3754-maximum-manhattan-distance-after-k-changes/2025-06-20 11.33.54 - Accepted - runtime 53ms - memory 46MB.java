class Solution {
    public int maxDistance(String str, int k) 
    {
        int n = 0, e = 0, w = 0, s = 0, a = 0;
        for (char c : str.toCharArray()) 
        {
            if (c == 'N') n++;
            else if (c == 'S') s++;
            else if (c == 'E') e++;
            else w++;
            int k1 = k;
            int ns = Math.abs(n - s);
            int ew = Math.abs(e - w);
            int mn = Math.min(n, s);
            int u1 = Math.min(mn, k1);
            k1 -= u1;
            ns += u1 * 2;
            int me = Math.min(e, w);
            int u2 = Math.min(me, k1);
            ew += u2 * 2;
            a = Math.max(a, ns + ew);
        }
        return a;
    }
}
