class Solution 
{
    public List<String> getWordsInLongestSubsequence(String[] w, int[] g) 
    {
        int n = w.length;
        int[] dp = new int[n];
        int[] p = new int[n];
        Arrays.fill(dp, 1);
        Arrays.fill(p, -1);
        for (int i = 0; i < n; i++) 
        {
            for (int j = 0; j < i; j++) 
            {
                if (g[i] != g[j] && w[i].length() == w[j].length() && dist(w[i], w[j]) == 1) 
                {
                    if (dp[j] + 1 > dp[i]) 
                    {
                        dp[i] = dp[j] + 1;
                        p[i] = j;
                    }
                }
            }
        }
        int idx = 0;
        for (int i = 1; i < n; i++) 
        {
            if (dp[i] > dp[idx]) 
            {
                idx = i;
            }
        }
        LinkedList<String> res = new LinkedList<>();
        while (idx != -1) 
        {
            res.addFirst(w[idx]);
            idx = p[idx];
        }
        return res;
    }
    private int dist(String a, String b) 
    {
        int d = 0;
        for (int i = 0; i < a.length(); i++) 
        {
            if (a.charAt(i) != b.charAt(i)) d++;
        }
        return d;
    }
}
