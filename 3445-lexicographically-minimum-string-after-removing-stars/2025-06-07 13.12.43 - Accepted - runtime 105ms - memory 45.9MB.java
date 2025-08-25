class Solution {
    public String clearStars(String s) {
        int n = s.length();
        boolean[] rm = new boolean[n]; 
        Stack<Integer>[] stk = new Stack[26]; 
        for (int i = 0; i < 26; i++) {
            stk[i] = new Stack<>();
        }
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            if (ch == '*') {
                for (int j = 0; j < 26; j++) {
                    if (!stk[j].isEmpty()) {
                        int idx = stk[j].pop();
                        rm[idx] = true; 
                        break;
                    }
                }
                rm[i] = true; 
            } else {
                stk[ch - 'a'].push(i); 
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            if (!rm[i] && s.charAt(i) != '*') {
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
}
