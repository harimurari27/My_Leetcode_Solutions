class Solution
 {
    public boolean reportSpam(String[] message, String[] bannedWords)
     {
        int c=0;
        Set<String> ss=new HashSet<>(Arrays.asList(bannedWords));
        for(String word:message)
        {
            if(ss.contains(word))
            {
                c++;
            }
            if(c>=2)
            {
                return true;
            }
        }
        return false;
    }
}