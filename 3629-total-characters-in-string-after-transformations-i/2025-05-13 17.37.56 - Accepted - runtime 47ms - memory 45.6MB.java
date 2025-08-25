class Solution 
{
    public int lengthAfterTransformations(String s, int t) 
    {
        int[] f = new int[26];
        int m = 1000000007;
        for (int i = 0; i < s.length(); i++) 
        {
            f[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < t; i++) 
        {
            int x = f[25];
            for (int j = 25; j >= 1; j--) 
            {
                f[j] = f[j - 1];
            }
            f[0] = x;
            f[1] = (f[1] + x) % m;
        }
        int res = 0;
        for (int i = 0; i < 26; i++) 
        {
            res = (res + f[i]) % m;
        }
        return res;
    }
}
