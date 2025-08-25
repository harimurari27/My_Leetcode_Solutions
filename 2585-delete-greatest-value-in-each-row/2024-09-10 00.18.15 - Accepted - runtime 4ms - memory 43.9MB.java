class Solution {
    public int deleteGreatestValue(int[][] grid) 
    {
        int n=grid.length;
        int sum=0;
        for(int i=0;i<n;i++)
        {
            Arrays.sort(grid[i]);
        }
        for(int i=grid[0].length-1;i>=0;i--)
        {
            int max=0;
            for(int j=0;j<n;j++)
            {
                max=Math.max(max,grid[j][i]);
            }
            sum+=max;
        }
        return sum;
    }
}