class Solution 
{
    public int countSquares(int[][] matrix) 
    {
        int m=matrix.length;
        int n=matrix[0].length;
        int t=0;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                int ms=Math.min(m-i,n-j);
                for(int s=1;s<=ms;s++)
                {
                    if(iv(matrix,i,j,s))
                    t++;
                    else
                    break;
                }
            }
        }
        return t;
    }
    private boolean iv(int matrix[][],int r,int c,int s)
    {
        for(int i=r;i<r+s;i++)
        {
            for(int j=c;j<c+s;j++)
            {
                if(matrix[i][j]==0)
                 return false;
            }
        }
        return true;
    }
}