
class Solution {
    public int maxGoodNumber(int[] nums)
     {
           String[] binaryStrings = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            binaryStrings[i] = Integer.toBinaryString(nums[i]);
        }

        Arrays.sort(binaryStrings, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                // Compare concatenated results
                return (b + a).compareTo(a + b);
            }
        });
        StringBuilder concatenatedBinary = new StringBuilder();
        for (String binary : binaryStrings) {
            concatenatedBinary.append(binary);
        }
        return Integer.parseInt(concatenatedBinary.toString(), 2);
    }
}