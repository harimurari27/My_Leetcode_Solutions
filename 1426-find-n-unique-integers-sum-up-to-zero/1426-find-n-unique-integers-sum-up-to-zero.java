class Solution 
{
    public int[] sumZero(int n) 
    {
        int d=0;
        int arr[]=new int[n];
        for(int i=1;i<=n/2;i++)
        {
            arr[d++]=i;
            arr[d++]=-i;
        }
        if(n%2!=0)
        arr[d]=0;
        return arr;
    }
}