class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) 
    {
        int n=fruits.length;
        boolean ba[]=new boolean[n];
        int up=0;
        for(int i=0;i<n;i++)
        {
            boolean p=false;
            for(int j=0;j<n;j++)
            {
                if(!ba[j]&&baskets[j]>=fruits[i])
                {
                    ba[j]=true;
                    p=true;
                    break;
                }
            }
            if(!p)
            up++;
        }
        return up;
    }
}