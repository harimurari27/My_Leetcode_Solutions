class Solution 
{
    public int maxSumDivThree(int[] nums) 
    {
        int s=0;
        List<Integer> l1=new ArrayList<>();
        ArrayList<Integer> l2=new ArrayList<>();
        for(int i:nums)
        {
           s+=i;
           if(i%3==1)
           l1.add(i);
           if(i%3==2)
           l2.add(i); 
        } 
        if(s%3==0)
        return s;
        Collections.sort(l1);
        Collections.sort(l2);
        int r=s%3;
        int ans=0;
        if(r==1)
        {
        int r1=l1.size()>0?l1.get(0):Integer.MAX_VALUE;
        int r2=l2.size()>1?(l2.get(0)+l2.get(1)):Integer.MAX_VALUE;
        ans=s-Math.min(r1,r2);
        }
        else
        {
        int r1=l2.size()>0?l2.get(0):Integer.MAX_VALUE;
        int r2=l1.size()>1?(l1.get(0)+l1.get(1)):Integer.MAX_VALUE;
        ans=s-Math.min(r1,r2);
        }
        return ans==Integer.MAX_VALUE?0:ans;

        
    }
}