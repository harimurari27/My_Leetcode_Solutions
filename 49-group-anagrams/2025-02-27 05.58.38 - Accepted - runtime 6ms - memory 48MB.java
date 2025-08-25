class Solution 
{
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> m = new HashMap<>();
        
        for (String word : strs) {
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String sortedWord = new String(chars);
            
            if (!m.containsKey(sortedWord)) {
                m.put(sortedWord, new ArrayList<>());
            }
            
            m.get(sortedWord).add(word);
        }
        
        return new ArrayList<>(m.values());
    }
}
