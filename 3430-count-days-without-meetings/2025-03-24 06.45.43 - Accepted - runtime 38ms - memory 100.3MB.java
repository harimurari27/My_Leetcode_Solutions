class Solution {
    public int countDays(int days, int[][] meetings) {
        Arrays.sort(meetings, (a, b) -> Integer.compare(a[0], b[0]));

        int r = 0;
        int lastmeet = 0;
        for(int[] i : meetings){
            if(lastmeet < i[0])
                r+= i[0] - lastmeet - 1;
            lastmeet = lastmeet > i[1] ? lastmeet : i[1];
        }
        if(lastmeet <= days)
            r += days - lastmeet;
        
        return r;
    }
}