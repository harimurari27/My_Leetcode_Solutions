class Solution 
{
    public List<String> getLongestSubsequence(String[] words, int[] g) 
    {
        int s=g[0];
        List<String> ans=new ArrayList<>();
        ans.add(words[0]);
        for(int i=1;i<words.length;i++)
        {
            if(g[i]!=s)
            {
                ans.add(words[i]);
                s=g[i];
            }
        }
        return ans;
    }
}