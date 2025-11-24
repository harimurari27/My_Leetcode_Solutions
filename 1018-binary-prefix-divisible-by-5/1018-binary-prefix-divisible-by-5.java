class Solution {
    public List<Boolean> prefixesDivBy5(int[] nums) 
    {
        List<Boolean> l=new ArrayList<>();
        int m=0;
        for(int i:nums)
        {
            m=((m<<1)+i)%5;
            l.add(m==0);
        }
        return l;
    }
}