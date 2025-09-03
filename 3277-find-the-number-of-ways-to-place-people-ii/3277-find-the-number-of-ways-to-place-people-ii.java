class Solution {
    public int numberOfPairs(int[][] points) {
        Arrays.sort(points, (a, b) -> {
            if (a[0] == b[0]) {
                return Integer.compare(b[1], a[1]); 
            }
            return Integer.compare(a[0], b[0]);
        });

        int pairCount = 0;
        int n = points.length;

        // Step 2: Iterate through all points as potential "upper-left" points
        for (int i = 0; i < n; i++) {
            int upperY = points[i][1];   
            int lowerYLimit = Integer.MIN_VALUE;

            // Step 3: Check subsequent points as potential "bottom-right" points
            for (int j = i + 1; j < n; j++) {
                int currentY = points[j][1];

                // Valid pair if currentY is below upperY and above previous lowerYLimit
                if (currentY <= upperY && currentY > lowerYLimit) {
                    pairCount++;
                    lowerYLimit = currentY;

                    // Once we reach the same y as upperY, no more valid points possible
                    if (currentY == upperY) break;
                }
            }
        }

        return pairCount;
    }
}
