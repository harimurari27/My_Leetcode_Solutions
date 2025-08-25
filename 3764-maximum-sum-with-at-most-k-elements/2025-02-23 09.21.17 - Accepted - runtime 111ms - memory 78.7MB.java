class Solution {
    public long maxSum(int[][] grid, int[] limits, int k) {
        int n=grid.length;
        int m=grid[0].length;
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<n;i++){
            Arrays.sort(grid[i]);
            for(int j=m-1;j>=0;j--){
                if(limits[i]==0) break;
                list.add(grid[i][j]);
                limits[i]--;
                
            }
        }
        Collections.sort(list);
        long s=0;
        for(int i=list.size()-1;i>=0&&k>0;i--){
            s+=list.get(i);
            k--;
        }
        return s;
    }
}