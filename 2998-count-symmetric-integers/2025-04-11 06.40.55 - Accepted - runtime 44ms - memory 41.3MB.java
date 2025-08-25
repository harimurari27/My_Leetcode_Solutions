class Solution {
    public static boolean isSymmetric(int num, int len) {
        int sum1 = 0, sum2 = 0;
        while (num != 0) {
            if (len > 0)
                sum1 += num % 10;
            else
                sum2 += num % 10;
            len--;
            num /= 10;
        }
        return sum1 == sum2;
    }

    public int countSymmetricIntegers(int low, int high) {
        int c = 0;
        for (int i = low; i <= high; i++) {
            int n = (int) Math.log10(i) + 1;
            if (n % 2 == 0 && isSymmetric(i, n / 2))
                c++;
        }
        return c;
    }
}