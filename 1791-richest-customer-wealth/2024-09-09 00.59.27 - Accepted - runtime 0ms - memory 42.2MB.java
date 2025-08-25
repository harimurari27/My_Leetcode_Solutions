class Solution {
    public int maximumWealth(int[][] accounts)
     {
        int res=Integer.MIN_VALUE;
        for(int i=0;i<accounts.length;i++)
        {
            int s=0;
            for(int j=0;j<accounts[i].length;j++)
            {
                s+=accounts[i][j];
            }
            if(s>res)
            {
                res=s;
            }
        }
        return res;
    }
}