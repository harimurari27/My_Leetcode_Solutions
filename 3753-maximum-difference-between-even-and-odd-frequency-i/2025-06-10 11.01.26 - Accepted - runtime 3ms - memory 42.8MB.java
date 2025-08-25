class Solution 
{
    public int maxDifference(String s) 
    {
        Map<Character,Integer> hm=new HashMap<>();
        for(char ch:s.toCharArray())
        {
            hm.put(ch,hm.getOrDefault(ch,0)+1);
        }
        int em=Integer.MAX_VALUE;
        int om=Integer.MIN_VALUE;
        for(int i:hm.values())
        {
            if(i%2==0)
            em=Math.min(em,i);
            else
            om=Math.max(om,i);
        }
        return om-em;
    }
}
