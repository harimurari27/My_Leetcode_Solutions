class Solution {
    public long calculateScore(String[] inst, int[] values) {
        int n = inst.length;
        int i = 0;
        long s = 0;
        boolean[] visited = new boolean[n];
        while (i >= 0 && i < n && !visited[i]) {
            visited[i] = true;
            if (inst[i].equals("add")) {
                s += values[i];
                i++;
            } else if (inst[i].equals("jump")) {
                i+= values[i];
            }
        }
        return s;
    }
}
