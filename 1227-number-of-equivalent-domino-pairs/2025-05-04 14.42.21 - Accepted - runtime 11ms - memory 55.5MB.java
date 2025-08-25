class Solution {
    public int numEquivDominoPairs(int[][] dominoes) {
        Map<Integer, Integer> count = new HashMap<>();
        int a = 0;
        for (int[] d : dominoes) {
            int x = Math.min(d[0], d[1]);
            int y = Math.max(d[0], d[1]);
            int key = (x << 4) | y;
            count.put(key, count.getOrDefault(key, 0) + 1);
        }
        for (int c : count.values()) {
            a += c * (c - 1);
        }
        return a/2;
    }
}