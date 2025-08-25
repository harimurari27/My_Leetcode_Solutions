class Solution {
    public boolean wordPattern(String pattern, String s) 
    {
        String words[]=s.split(" ");
        if(pattern.length()!=words.length) return false;
        HashMap<Character,String> h1=new HashMap<>();
        HashSet<String> h2=new HashSet<>();
        for(int i=0;i<pattern.length();i++)
        {
            char c=pattern.charAt(i);
            String w=words[i];
            if(h1.containsKey(c))
            {
                if(!h1.get(c).equals(w))
                {
                    return false;
                }
            }
            else
            {
                if(h2.contains(w))
                {
                    return false;
                }
            }
            h1.put(c,w);
            h2.add(w);
        }
      return true;       
    }
}