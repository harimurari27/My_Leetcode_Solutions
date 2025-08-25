class Solution {
    public long putMarbles(int[] weights, int k) {
        if (k == 1) {
            return 0;
        }
        List<Integer> pairSums = new ArrayList<>();
        for (int i = 0; i < weights.length - 1; i++) {
            pairSums.add(weights[i] + weights[i + 1]);
        }
        Collections.sort(pairSums);
        long min = 0, max = 0;
        for (int i = 0; i < k - 1; i++) {
            min += pairSums.get(i);
            max += pairSums.get(pairSums.size() - 1 - i);
        }
        return max - min;
    }
}