class Solution {
    public int numOfSubarrays(int[] arr) 
    {
       int s=0,e=1,o=0,r=0,mod=1000000007;
       for(int n:arr)
       {
         s+=n;
         if(s%2==0)
         {
            e++;
            r=(r+o)%mod;
         }
         else
         {
            o++;
            r=(r+e)%mod;
         }
       }
      return r;
    }
}