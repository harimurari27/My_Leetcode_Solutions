class Solution {
    public boolean isHappy(int n)
     {
        if(n==1||n==7) return true;
        else if(n<10) return false;
        else
        {
        int s=0;
        while(n>0)
        {
            int t=n%10;
            s+=t*t;
            n/=10;
        }
        return isHappy(s);
    }
}
}