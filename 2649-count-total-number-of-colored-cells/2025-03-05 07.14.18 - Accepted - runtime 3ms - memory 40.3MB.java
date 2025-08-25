class Solution {
    public long coloredCells(int n) {
        long s=1; 
        for(int i=2; i<=n; i++){
            s+=(i-1)*4; 
        }
        return s;
    }
}