class Solution {

    public long kMirror(int base, int count) {
        long sum = 0;
        for (int len = 1; ; ++len) {
            int s = (int) Math.pow(10, (len - 1) / 2);
            int e = (int) Math.pow(10, (len + 1) / 2);
            for (int x = s; x < e; x++) {
                long p = x;
                for (int y = len % 2 == 0 ? x : x / 10; y > 0; y /= 10) {
                    p = p * 10 + y % 10;
                }
                String b = Long.toString(p, base);
                if (isPalindrome(b.toCharArray())) {
                    sum += p;
                    if (--count == 0) {
                        return sum;
                    }
                }
            }
        }
    }

    private boolean isPalindrome(char[] arr) {
        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            if (arr[i] != arr[j]) {
                return false;
            }
        }
        return true;
    }
}
