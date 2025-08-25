import java.util.*;
class Solution {
    public int mostWordsFound(String[] sentences) 
    {
        int max=0;
        //StringTokenizer st;
        for(int i=0;i<sentences.length;i++)
        {
            StringTokenizer st=new StringTokenizer(sentences[i]);
            if(st.countTokens()>max)
            {
                max=st.countTokens();
            }
        }
        return max;
    }
}