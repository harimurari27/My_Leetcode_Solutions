class Solution {
    public List<String> stringSequence(String target) 
    {
 List<String> result = new ArrayList<>();
        StringBuilder current = new StringBuilder();
        char currentChar = 'a';
        for (char ch : target.toCharArray()) {
            if (current.length() == 0) {
                current.append('a');
                result.add(current.toString());
            }
            while (currentChar != ch) {
                currentChar = currentChar == 'z' ? 'a' : (char) (currentChar + 1);
                current.setCharAt(current.length() - 1, currentChar);
                result.add(current.toString());
            }

            if (current.length() < target.length()) {
                current.append('a'); 
                currentChar = 'a';
                result.add(current.toString());
            }
        }
        return result;
    }
}