class Solution {
    public int lengthOfLastWord(String s) 
    {
       int l=s.length();
       int c=0;
       int i=l-1;
        while (i >= 0 && s.charAt(i) == ' ') {
            i--;
        }
         while (i >= 0 && s.charAt(i) != ' ') {
            c++;
            i--;
        }
        return c;
    }
}