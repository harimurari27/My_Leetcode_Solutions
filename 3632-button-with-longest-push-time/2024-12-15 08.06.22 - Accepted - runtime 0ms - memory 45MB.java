class Solution {
    public int buttonWithLongestTime(int[][] events) {
        int l = events.length;
        int longestDuration = events[0][1];
        int buttonIndex = events[0][0];
        
        for (int i = 1; i < l; i++) {
            int duration = events[i][1] - events[i - 1][1];
            if (duration > longestDuration || (duration == longestDuration && events[i][0] < buttonIndex)) {
                longestDuration = duration;
                buttonIndex = events[i][0];
            }
        }
        
        return buttonIndex;
    }
}
