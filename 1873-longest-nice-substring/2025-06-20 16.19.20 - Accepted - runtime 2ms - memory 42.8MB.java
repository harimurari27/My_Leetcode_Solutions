class Solution 
{
    public String longestNiceSubstring(String s) 
    {
        Set<Character> c=new HashSet<>();
        int n=s.length();
        for(int i=0;i<n;i++)
        {
            c.add(s.charAt(i));
        }
        for(int i=0;i<n;i++)
        {
            if(c.contains(Character.toUpperCase(s.charAt(i)))&&c.contains(Character.toLowerCase(s.charAt(i))))
            continue;
            String s1=longestNiceSubstring(s.substring(0,i));
            String s2=longestNiceSubstring(s.substring(i+1));
            return s1.length()>=s2.length()?s1:s2;
        }
        return s;
    }
}