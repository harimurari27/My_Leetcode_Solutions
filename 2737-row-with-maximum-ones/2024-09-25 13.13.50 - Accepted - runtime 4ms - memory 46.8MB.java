class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) 
    {
        int n=mat.length;
        int m=mat[0].length;
        int max=0,ind=0;
        for(int i=0;i<n;i++)
        {
            int c=0;
            for(int j=0;j<m;j++)
            {
                if(mat[i][j]==1)
                {
                    c++;
                    if(max<c)
                    {
                       max=c;
                       ind=i;
                    }
                }
            }
        }
        int arr[]={ind,max};
        return arr;
        
    }
}