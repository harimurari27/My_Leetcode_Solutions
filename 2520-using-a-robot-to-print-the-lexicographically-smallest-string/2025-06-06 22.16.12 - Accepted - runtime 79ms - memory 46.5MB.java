class Solution 
{
    public String robotWithString(String s) 
    {
        int n = s.length();
        int[] f = new int[26];
        for (char c : s.toCharArray()) 
        {
            f[c - 'a']++;
        }
        StringBuilder r = new StringBuilder();
        Deque<Integer> st = new ArrayDeque<>();
        for (char c : s.toCharArray()) 
        {
            int x = c - 'a';
            f[x]--;
            st.push(x);
            while (!st.isEmpty() && !sm(st.peek(), f)) 
            {
                r.append((char) (st.pop() + 'a'));
            }
        }
        return r.toString();
    }
    private boolean sm(int t, int[] f) 
    {
        for (int i = 0; i < t; i++) 
        {
            if (f[i] > 0) return true;
        }
        return false;
    }
}
