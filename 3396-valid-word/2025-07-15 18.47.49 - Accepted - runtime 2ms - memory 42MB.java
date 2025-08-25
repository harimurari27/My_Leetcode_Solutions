class Solution {
    public boolean isValid(String word) 
    {
        int l=word.length();
        if(l<3)
        {
            return false;
        }
        int co=0;
        int v=0;
        for(char c:word.toCharArray())
        {
            if(Character.isLetter(c))
            {
                if("aeiouAEIOU".indexOf(c)!=-1)
                {
                    v++;
                }
                else
                {
                    co++;
                }
            }
            else if(!Character.isDigit(c))
            {
                return false;
            }
        }
        return v>=1&&co>=1;
    }
}