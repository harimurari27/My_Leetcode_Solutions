class Solution {
    public long[] getDistances(int[] arr) {
        long[] res = new long[arr.length];
        Map<Integer, Long> sm = new HashMap<>();
        Map<Integer, Integer> cm = new HashMap<>();
        for (int i = 0; i < arr.length; ++i) {
            int v = arr[i];
            if (!sm.containsKey(v)) {
                sm.put(v, 0L);
                cm.put(v, 0);
            }
            res[i] += i * (long) cm.get(v) - sm.get(v);
            sm.put(v, sm.get(v) + i);
            cm.put(v, cm.get(v) + 1);
        }
        sm = new HashMap<>();
        cm = new HashMap<>();
        int n = arr.length; 
        for (int i = n - 1; i >= 0; --i) {
            int v = arr[i];
            if (!sm.containsKey(v)) {
                sm.put(v, 0L);
                cm.put(v, 0);
            }
            res[i] += (n - i - 1L) * cm.get(v) - sm.get(v);
            sm.put(v, sm.get(v) + (n - i - 1));
            cm.put(v, cm.get(v) + 1);
        }
        return res;
    }
}
