class Solution {
    public String processStr(String s) {
        StringBuilder r = new StringBuilder();
        for (char ch : s.toCharArray()) {
            if (ch >= 'a' && ch <= 'z') {
                r.append(ch);
            } else if (ch == '*') {
                if (r.length() > 0) r.deleteCharAt(r.length() - 1);
            } else if (ch == '#') {
                r.append(r.toString());
            } else if (ch == '%') {
                r.reverse();
            }
        }
        return r.toString();
    }
}
