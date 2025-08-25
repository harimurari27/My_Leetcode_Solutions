class Solution 
{
    public int minimumDeletions(String word, int k) 
    {
        int[] f = new int[26];
        for (int i = 0; i < word.length(); i++) 
        {
            f[word.charAt(i) - 'a']++;
        }
        int res = Integer.MAX_VALUE;
        for (int i = 0; i < 26; i++) 
        {
            if (f[i] == 0) continue;
            int d = 0;
            int b = f[i];
            for (int j = 0; j < 26; j++) 
            {
                if (f[j] == 0 || i == j) continue;
                int c = f[j];
                if (c < b) 
                {
                    d += c;
                } else if (c - b > k) {
                    d += c - b - k;
                }
            }
            res = Math.min(res, d);
        }
        return res;
    }
}
