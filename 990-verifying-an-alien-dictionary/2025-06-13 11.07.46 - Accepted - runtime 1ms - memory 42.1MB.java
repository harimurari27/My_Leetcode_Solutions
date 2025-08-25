class Solution {
    public boolean isAlienSorted(String[] W, String O) {
        Map<Character, Integer> m = new HashMap<>();
        for (int i = 0; i < O.length(); i++)
            m.put(O.charAt(i), i);
        for (int i = 1; i < W.length; i++) {
            String a = W[i - 1], b = W[i];
            for (int j = 0; j < a.length(); j++) {
                if (j == b.length()) return false;
                char x = a.charAt(j), y = b.charAt(j);
                if (m.get(x) < m.get(y)) break;
                if (m.get(x) > m.get(y)) return false;
            }
        }
        return true;
    }
}
