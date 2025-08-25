class Solution {
    public int diagonalSum(int[][] mat) 
    {
        int n=mat.length;
        int s1=0,s2=0;
        for(int i=0;i<mat.length;i++)
        {
            s1+=mat[i][i];
            if(i!=n-i-1)
            {
           s2+=mat[i][n-i-1];
            }
        }
        return s1+s2;
    }
}