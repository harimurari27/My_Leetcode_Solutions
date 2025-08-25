class Solution {
    public int reverseDegree(String s) {
        int sm = 0;
        for (int i = 0; i < s.length(); i++) {
            int reversedValue = 26 - (s.charAt(i) - 'a');
            sm += reversedValue * (i + 1);
        }
        return sm;
    }
}
