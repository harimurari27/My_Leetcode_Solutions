class Solution 
{
    public int mySqrt(int x)
    {
        int h=x;
       if(x==0||x==1)
       {
        return x;
       }
       else
       {
        int l=1;
        while(l<=h)
        {
            int m=l+(h-l)/2;
            if(m*m==x)
            {
               return m;
            }
            else if((long)m*(long)m>x)
            {
                h=m-1;
            }
            else
            {
                l=m+1;
            }
        }
       }
       return Math.round(h); 
    }
}