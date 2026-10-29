class Solution {
    public String majorityFrequencyGroup(String s) 
    {
        HashMap<Character,Integer> freq=new HashMap<>();
        for(char ch:s.toCharArray())
        {
            freq.put(ch,freq.getOrDefault(ch,0)+1);
        }
        HashMap<Integer,StringBuilder> grp=new HashMap<>();
        for(char ch:freq.keySet())
        {
            int c=freq.get(ch);
            grp.putIfAbsent(c,new StringBuilder());
            grp.get(c).append(ch);
        }
        int bs=0;
        int bf=0;
        for(int fr:grp.keySet())
        {
            int size=grp.get(fr).length();
            if(size>bs||(size==bs&&fr>bf))
            {
                bs=size;
                bf=fr;
            }
        }
        return grp.get(bf).toString();
    }
}