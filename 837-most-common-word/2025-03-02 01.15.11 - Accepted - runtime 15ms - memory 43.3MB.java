class Solution {
    public String mostCommonWord(String paragraph, String[] banned) 
    {
        paragraph = paragraph.toLowerCase().replaceAll("[^a-zA-Z]", " ");

         List bannedList = Arrays.asList(banned);

         String[] words = paragraph.split(" ");

         HashMap<String, Integer> numOfWords = new HashMap<>();

         int maxNum = 0;
         String m= "";

         for (String s : words)
         {
        	 if (!s.equals(""))
        	 {
        		 if (numOfWords.get(s) == null)
                 {
                     numOfWords.put(s, 1);
                 }
                 else numOfWords.put(s, numOfWords.get(s) + 1);
        	 }
             
         }    
         for (Map.Entry<String, Integer> set : numOfWords.entrySet()) 
         {
             int value = set.getValue();
             String key = set.getKey();
             if (value > maxNum && !bannedList.contains(key))
             {
                 maxNum = value;
                 m = key;
             }
         }

         return m;
    }
}