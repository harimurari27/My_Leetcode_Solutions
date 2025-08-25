class Solution {
    public String simplifyPath(String path) {
        String[] c = path.split("/");
        Stack<String> st = new Stack<>();
        for (String comp : c) {
            if (comp.equals("") || comp.equals(".")) {
                continue;
            }
            if (comp.equals("..")) {
                if (!st.isEmpty()) {
                    st.pop();
                }
            } else {
                st.push(comp);
            }
        }
        StringBuilder sb = new StringBuilder();
        while (!st.isEmpty()) {
            sb.insert(0, "/" + st.pop());
        }
        return sb.length() == 0 ? "/" : sb.toString();        
    }
}