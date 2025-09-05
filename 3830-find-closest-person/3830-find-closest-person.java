class Solution {
    public int findClosest(int a, int b, int c) {
        int distA = Math.abs(a - c);
        int distB = Math.abs(b - c);
        if (distA < distB) return 1;
        else if (distB < distA) return 2;
        else return 0;
    }
}