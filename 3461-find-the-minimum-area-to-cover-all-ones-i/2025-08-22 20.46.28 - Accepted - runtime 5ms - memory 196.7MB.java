class Solution {
    public int minimumArea(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int minr=m,maxr=0;
        int minc=n,maxc=0;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(grid[i][j]==1)
                {
                    minr=Math.min(minr,i);
                    maxr=Math.max(maxr,i);
                    minc=Math.min(minc,j);
                    maxc=Math.max(maxc,j);
                }
            }
        }
        return (maxr-minr+1)*(maxc-minc+1);
    }
}