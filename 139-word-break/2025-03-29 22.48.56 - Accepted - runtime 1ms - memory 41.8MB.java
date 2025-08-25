import java.util.*;

class Solution {
    public boolean wordBreak(String s, List<String> wd) {
        return recWay1(s, wd);
    }

    boolean recWay2(String s, List<String> wd) {
        Boolean[] m = new Boolean[s.length() + 1];
        return wordBreak2(s, new HashSet<>(wd), 0, m);
    }

    boolean wordBreak2(String s, Set<String> wd, int k, Boolean[] m) {
        int n = s.length();
        if (k == n) return true;

        if (m[k] != null) return m[k];

        for (int i = k + 1; i <= n; i++) {
            String word = s.substring(k, i);
            if (wd.contains(word) && wordBreak2(s, wd, i, m)) {
                return m[k] = true;
            }
        }

        return m[k] = false;
    }

    boolean recWay1(String s, List<String> wd) {
        Boolean[] m = new Boolean[s.length() + 1];
        return wordBreak(s, wd, 0, m);
    }
    
    boolean wordBreak(String s, List<String> wd, int k, Boolean[] m) {
        if (k == s.length()) {
            return true;
        }
        
        if (m[k] != null) {
            return m[k];
        }
        
        for (int i = 0; i < wd.size(); i++) {
            String word = wd.get(i);
            if (s.startsWith(word, k)) {
                if (wordBreak(s, wd, k + word.length(), m)) return m[k] = true;
            }
        }
                   
        return m[k] = false;
    }
}
