class Solution {
    public int[] beautifulArray(int n) {
        int[] res = new int[n]; 
        if (n == 1) {
            res[0] = 1;
            return res;
        }
        int[] r = beautifulArray(n / 2);
        int[] l = beautifulArray((n + 1) / 2);

        for (int i = l.length; i < n; i++) {
            res[i] = r[i - l.length] * 2;
        }
        for (int i = 0; i < l.length; i++) {
            res[i] = l[i] * 2 - 1;
        }
        return res;
    }
}
