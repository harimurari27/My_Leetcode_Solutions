class Solution 
{
    public int maxSumDistinctTriplet(int[] x, int[] y) 
    {
        Map<Integer, Integer> map = new HashMap<>();
        int n = x.length;
        for (int i = 0; i < n; i++) 
        {
            int a = x[i], b = y[i];
            map.put(a, Math.max(map.getOrDefault(a, 0), b));
        }
        if (map.size() < 3) return -1;
        List<Integer> vals = new ArrayList<>(map.values());
        vals.sort(Collections.reverseOrder());
        return vals.get(0) + vals.get(1) + vals.get(2);
    }
}
