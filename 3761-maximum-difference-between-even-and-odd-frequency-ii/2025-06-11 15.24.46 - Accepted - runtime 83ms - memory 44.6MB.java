class Solution 
{
  public int maxDifference(String s, int k) {
        int n = s.length();
        int ans = Integer.MIN_VALUE;
        for (char a = '0'; a <= '4'; ++a) {
            for (char b = '0'; b <= '4'; ++b) {
                if (a == b) continue;
                int[] bst = new int[4];
                Arrays.fill(bst, Integer.MAX_VALUE);
                int ca = 0, cb = 0, pa = 0, pb = 0, l = -1;
                for (int r = 0; r < n; ++r) {
                    ca += (s.charAt(r) == a) ? 1 : 0;
                    cb += (s.charAt(r) == b) ? 1 : 0;
                    while (r - l >= k && cb - pb >= 2) {
                        int ls = getStatus(pa, pb);
                        bst[ls] = Math.min(bst[ls], pa - pb);
                        ++l;
                        pa += (s.charAt(l) == a) ? 1 : 0;
                        pb += (s.charAt(l) == b) ? 1 : 0;
                    }
                    int rs = getStatus(ca, cb);
                    int rq = rs ^ 0b10;
                    if (bst[rq] != Integer.MAX_VALUE) {
                        ans = Math.max(ans, ca - cb - bst[rq]);
                    }
                }
            }
        }
        return ans;
    }
    private int getStatus(int ca, int cb) {
        return ((ca & 1) << 1) | (cb & 1);
    }
}
