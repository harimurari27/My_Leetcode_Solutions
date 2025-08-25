class Solution
    {
    public int minDeletion(String s, int k) {
        Map<Character, Integer> f = new HashMap<>();
        for (char c : s.toCharArray())
            f.put(c, f.getOrDefault(c, 0) + 1);
        
        if (f.size() <= k) return 0;

        List<Integer> vals = new ArrayList<>(f.values());
        Collections.sort(vals);

        int del = 0;
        for (int i = 0; i < f.size() - k; i++)
            del += vals.get(i);
        
        return del;
    }
}
