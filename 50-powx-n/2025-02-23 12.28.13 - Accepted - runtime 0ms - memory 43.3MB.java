class Solution {
    public double myPow(double x, int n)
     {
        if(n==0) return 1;
        double a=1.0;
        long p=n;
        if(p<0)
        {
           x=1/x;
           p=-p;
        }
        while(p>0)
        {
            if(p%2==1)
            {
                a*=x;
            }
           x*=x;
           p/=2;
     }
     return a;
    }
}