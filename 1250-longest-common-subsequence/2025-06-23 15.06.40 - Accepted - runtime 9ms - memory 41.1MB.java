class Solution {
    public int longestCommonSubsequence(String t1, String t2) 
    {
        int dp[]=new int[t1.length()];
         int l=0;
         for(char c:t2.toCharArray())
         {
            int cl=0;
            for(int i=0;i<dp.length;i++)
            {
                if(cl<dp[i])
                cl=dp[i];
                else if(c==t1.charAt(i))
                {
                    dp[i]=cl+1;
                    l=Math.max(l,cl+1);
                }
            }
         }
         return l;
    }
}