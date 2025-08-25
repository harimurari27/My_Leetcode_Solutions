class Solution 
{
    public String answerString(String word, int numFriends) 
    {
        if (numFriends == 1) return word;
        int n = word.length();
        int m = n - numFriends + 1;
        int a = 0, b = 1;
        while (b < n) 
        {
            int c = 0;
            while (b + c < n && word.charAt(a + c) == word.charAt(b + c)) c++;
            if (b + c < n && word.charAt(a + c) < word.charAt(b + c)) 
            {
                int t = a;
                a = b;
                b = Math.max(b + 1, t + c + 1);
            } else 
            {
                b += c + 1;
            }
        }
        String s = word.substring(a);
        return s.length() <= m ? s : s.substring(0, m);
    }
}
