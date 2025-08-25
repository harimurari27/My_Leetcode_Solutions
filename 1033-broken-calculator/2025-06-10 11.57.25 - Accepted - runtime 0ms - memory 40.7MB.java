class Solution {
    public int brokenCalc(int startValue, int target) {
        int a = 0;
        while (startValue < target) {
            if ((target & 1) == 1) {
                target++;
            } else {
                target >>= 1;
            }
            a += 1;
        }
        a += startValue - target;
        return a;
    }
}
