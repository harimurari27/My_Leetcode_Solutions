class Solution {
    public String minRemoveToMakeValid(String s) {
        int i = 0, j = s.length() - 1;
        String r;
        char[] a = s.toCharArray();
        int c = 0;
        for (int k = 0; k < a.length; k++) {
            if (a[k] == '(')
                c++;
            else if (a[k] == ')') {
                if (c == 0)
                    a[k] = '*';
                else
                    c--;
            }
        }
        for (int k = a.length - 1; k >= 0; k--) {
            if (c > 0 && a[k] == '(') {
                a[k] = '*';
                c--;
            }
        }
        int p = 0;
        for (int k = 0; k < a.length; k++) {
            if (a[k] != '*')
                a[p++] = a[k];
        }
        r = new String(a).substring(0, p);
        return r;
    }
}
