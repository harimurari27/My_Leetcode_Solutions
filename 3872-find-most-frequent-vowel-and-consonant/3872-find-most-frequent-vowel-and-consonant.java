class Solution {
    public int maxFreqSum(String str) 
    {
         //str = str.toLowerCase();
        Map<Character, Integer> vowelFreq = new HashMap<>();
        Map<Character, Integer> consonantFreq = new HashMap<>();
        Set<Character> vowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));
        for (char ch : str.toCharArray()) {
            if (Character.isLetter(ch)) {  // Only alphabets
                if (vowels.contains(ch)) {
                    vowelFreq.put(ch, vowelFreq.getOrDefault(ch, 0) + 1);
                } else {
                    consonantFreq.put(ch, consonantFreq.getOrDefault(ch, 0) + 1);
                }
            }
        }
        char mostFreqVowel = 0;
        int maxVowelCount = 0;
        for (var entry : vowelFreq.entrySet()) {
            if (entry.getValue() > maxVowelCount) {
                maxVowelCount = entry.getValue();
                mostFreqVowel = entry.getKey();
            }
        }

        char mostFreqConsonant = 0;
        int maxConsonantCount = 0;
        for (var entry : consonantFreq.entrySet()) {
            if (entry.getValue() > maxConsonantCount) {
                maxConsonantCount = entry.getValue();
                mostFreqConsonant = entry.getKey();
            }
        }
        return maxVowelCount+maxConsonantCount;

    }
}