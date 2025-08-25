class Solution {
    public String smallestPalindrome(String str) {
        int[] count = new int[26];
        for (char c : str.toCharArray()) {
            count[c - 'a']++;
        }

        StringBuilder part = new StringBuilder();
        String center = "";

        for (int i = 0; i < 26; i++) {
            if (count[i] % 2 == 1) {
                center = String.valueOf((char)(i + 'a'));
            }
            for (int j = 0; j < count[i] / 2; j++) {
                part.append((char)(i + 'a'));
            }
        }

        String left = part.toString();
        String right = part.reverse().toString();

        return left + center + right;
    }
}
