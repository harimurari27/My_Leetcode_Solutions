class Solution {
    public int minimumOperations(List<Integer> a) {
        return solve(a, 0, -1);
    }
    public int solve(List<Integer> a, int i, int p) {
        if (i >= a.size()) return 0;
        int x = a.get(i);
        if (x == 1) {
            if (p == -1 || p == 1) return solve(a, i + 1, 1);
            else return 1 + solve(a, i + 1, p);
        } else if (x == 2) {
            if (p == -1 || p == 1)
                return Math.min(solve(a, i + 1, 2), 1 + solve(a, i + 1, 1));
            else if (p == 2)
                return solve(a, i + 1, 2);
            else return 1 + solve(a, i + 1, p);
        } else {
            if (p == -1 || p == 1 || p == 2)
                return Math.min(solve(a, i + 1, 3), 1 + solve(a, i + 1, p));
            else return solve(a, i + 1, p);
        }
    }
}
