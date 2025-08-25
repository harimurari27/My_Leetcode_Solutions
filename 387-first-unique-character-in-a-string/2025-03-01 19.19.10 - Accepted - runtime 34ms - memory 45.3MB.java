class Solution {
    public int firstUniqChar(String s)
     {
        int n=s.length();
        HashMap<Character,Integer> h=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            h.put(s.charAt(i),h.getOrDefault(s.charAt(i),0)+1);
        }
        for(int i=0;i<n;i++)
        {
            if(h.get(s.charAt(i))==1)
            {
                return i;
            }
        }
        return -1;

    }
}