class Solution {
    public int areaOfMaxDiagonal(int[][] d) 
    {
       int ds=0,ma=0;
       for(int i=0;i<d.length;i++)
       {
         int l=d[i][0];
         int w=d[i][1];
         int mds=l*l+w*w;
         int ba=l*w;
         if(mds>ds)
         {
            ds=mds;
            ma=ba;
         }
         else if(mds==ds)
         ma=Math.max(ma,ba);
       }
       return ma; 
    }
}