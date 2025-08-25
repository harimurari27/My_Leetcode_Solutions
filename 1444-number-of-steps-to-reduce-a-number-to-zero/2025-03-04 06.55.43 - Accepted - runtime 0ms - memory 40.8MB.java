class Solution {
    public int numberOfSteps(int num) 
    {
        return h(num,0);
    }
    private int h(int num,int s)
    {
        if(num==0)
        {
            return s;
        }
        if(num%2==0)
        {
            return h(num/2,s+1);
        }
        return h(num-1,s+1);
    }
}