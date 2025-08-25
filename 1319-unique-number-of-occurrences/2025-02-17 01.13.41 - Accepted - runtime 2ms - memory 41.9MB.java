class Solution {
    public boolean uniqueOccurrences(int[] arr) 
    {
        HashMap<Integer,Integer> m=new HashMap<>();
        int n=arr.length;
        for(int num:arr)
        {
            m.put(num,m.getOrDefault(num,0)+1);
        }
        HashSet<Integer> o=new HashSet<>();
        for(int k:m.values())
        {
            if(!o.add(k))
            {
                 return false;
            }
        }
        return true;
    }
}