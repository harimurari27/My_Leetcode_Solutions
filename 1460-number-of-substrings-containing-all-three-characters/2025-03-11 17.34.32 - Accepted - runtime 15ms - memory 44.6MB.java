class Solution {
    public int numberOfSubstrings(String s) {
        int c = 0;
        int left = 0;
        int[] charCount = new int[3];

        for (int right = 0; right < s.length(); right++) {
            charCount[s.charAt(right) - 'a']++;

            while (charCount[0] > 0 && charCount[1] > 0 && charCount[2] > 0) {
                c += s.length() - right;
                charCount[s.charAt(left) - 'a']--;
                left++;
            }
        }

        return c;
    }
}