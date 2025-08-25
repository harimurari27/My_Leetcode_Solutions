class Solution {
    public String firstPalindrome(String[] words) 
    {
        for(int i=0;i<words.length;i++)
        {
        StringBuilder sb=new StringBuilder(words[i]);
        if(sb.reverse().toString().equals(words[i]))
        {
            return words[i];
        }
        }
        return "";
    }
}