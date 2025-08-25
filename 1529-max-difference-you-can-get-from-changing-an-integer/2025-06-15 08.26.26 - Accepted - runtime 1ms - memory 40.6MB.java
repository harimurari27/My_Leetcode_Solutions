class Solution {
    public int maxDiff(int num) {
        String s = Integer.toString(num), x = "", y;
        char d = 0;
        for (char ch : s.toCharArray()) if (ch != '9') { d = ch; x = s; break; }
        if (!x.isEmpty()) x = x.replace(d, '9'); else x = s;
        if (s.charAt(0) != '1') {
            y = s.replace(s.charAt(0), '1');
        } else {
            y = s;
            for (int i = 1; i < s.length(); ++i) {
                char ch = s.charAt(i);
                if (ch != '0' && ch != '1') {
                    y = y.replace(ch, '0');
                    break;
                }
            }
        }
        return Integer.parseInt(x) - Integer.parseInt(y);
    }
}
