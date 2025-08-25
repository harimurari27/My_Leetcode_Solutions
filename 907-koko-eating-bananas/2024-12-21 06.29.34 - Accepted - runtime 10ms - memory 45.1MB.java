class Solution {
    public int minEatingSpeed(int[] piles, int h) 
    {
        int n=maximum(piles);
        int l=1;
        int r=n;
        int ans=Integer.MAX_VALUE;
        while(l<=r)
        {
            long hr=0;
            int mid=(l+r)/2;
            for(int i=0;i<piles.length;i++)
            {
                hr+=(long)(piles[i]+mid-1)/mid;
            }
            if(hr<=h)
            {
                ans=Math.min(ans,mid);
                r=mid-1;
            }
            else
            {
                l=mid+1;
            }
        }
        return ans;
    }
     static int maximum(int arr[])
     {
        int max=-1;
        for(int i:arr)
        {
            if(max<i)
            {
                max=i;
            }
        }
        return max;
     }
    }
