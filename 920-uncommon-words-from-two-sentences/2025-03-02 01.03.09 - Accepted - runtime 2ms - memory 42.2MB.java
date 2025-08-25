class Solution {
    public String[] uncommonFromSentences(String s1, String s2) 
    {
        String w1[]=s1.split(" ");
        HashMap<String,Integer> h=new HashMap<>();
        for(String w:w1)
        {
            h.put(w,h.getOrDefault(w,0)+1);
        }
        String w2[]=s2.split(" ");
        for(String w:w2)
        {
            h.put(w,h.getOrDefault(w,0)+1);
        }
        ArrayList<String> as=new ArrayList<>();
        for(Map.Entry<String,Integer> entry:h.entrySet())
        {
            if(entry.getValue()==1)
            {
                as.add(entry.getKey());
            }
        }
        return as.toArray(new String[0]);
    }
}