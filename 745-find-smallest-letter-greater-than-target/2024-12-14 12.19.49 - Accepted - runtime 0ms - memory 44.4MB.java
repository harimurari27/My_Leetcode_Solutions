class Solution {
    public char nextGreatestLetter(char[] letters, char target) 
    {
        return bs(letters,target);
    }
    private char bs(char[] letters,char target)
    {
        int l=0,h=letters.length-1;
        char a=letters[0];
        while(l<=h)
        {
            int m=l+(h-l)/2;
            if(letters[m]>target)
            {
                a=letters[m];
                h=m-1;
            }
            else
            {
                l=m+1;
            }
        }
        return a;
    }
}