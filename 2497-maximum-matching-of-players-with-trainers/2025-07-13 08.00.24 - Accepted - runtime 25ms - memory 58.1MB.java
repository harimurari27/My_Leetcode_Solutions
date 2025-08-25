class Solution {
    public int matchPlayersAndTrainers(int[] players, int[] trainers) {
        Arrays.sort(trainers);
        Arrays.sort(players);
        int count = 0;
        int i = 0;
        int length = trainers.length;
        for (int player : players) {
            while (i < length && trainers[i] < player) {
                i++;
            }
            if (i++ == length) {
                return count;
            } else {
                count++;
            }
        }
        return count;
    }
}