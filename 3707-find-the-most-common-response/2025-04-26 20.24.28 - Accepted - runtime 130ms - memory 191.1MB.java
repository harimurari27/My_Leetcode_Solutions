class Solution 
{
    public String findCommonResponse(List<List<String>> res) {
        Map<String, Integer> map = new HashMap<>();
        for (List<String> day : res) {
            Set<String> set = new HashSet<>(day);
            for (String s : set) {
                map.put(s, map.getOrDefault(s, 0) + 1);
            }
        }
        String ans = null;
        int max = 0;
        for (Map.Entry<String, Integer> e : map.entrySet()) {
            String s = e.getKey();
            int cnt = e.getValue();
            if (cnt > max || (cnt == max && (ans == null || s.compareTo(ans) < 0))) {
                ans = s;
                max = cnt;
            }
        }
        return ans;
    }
}
