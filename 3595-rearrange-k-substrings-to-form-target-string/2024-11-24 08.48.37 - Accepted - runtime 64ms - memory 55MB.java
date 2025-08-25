class Solution {
    public boolean isPossibleToRearrange(String s, String t, int k) {
        int n = s.length();
        if (n % k != 0) {
            return false;
        }
        
        int segmentLength = n / k;
        
        Map<String, Integer> substringCountS = new HashMap<>();
        Map<String, Integer> substringCountT = new HashMap<>();

        for (int i = 0; i < n; i += segmentLength) {
            String substring = s.substring(i, i + segmentLength);
            substringCountS.put(substring, substringCountS.getOrDefault(substring, 0) + 1);
        }

        for (int i = 0; i < n; i += segmentLength) {
            String substring = t.substring(i, i + segmentLength);
            substringCountT.put(substring, substringCountT.getOrDefault(substring, 0) + 1);
        }

        return substringCountS.equals(substringCountT);
    }
}
