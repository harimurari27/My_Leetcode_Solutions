class Solution {
    public String toLowerCase(String s) 
    {
        char cc[]=s.toCharArray();
        for(int i=0;i<s.length();i++)
        {
            char ch=cc[i];
            if(Character.isUpperCase(ch))
            {
                cc[i]=Character.toLowerCase(ch);
            }
        }
        String ss=new String(cc);
        return ss;
    }
}