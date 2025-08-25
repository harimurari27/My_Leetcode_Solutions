class Solution {
    public int countConsistentStrings(String a, String[] words) {
        HashSet<Character> s=new HashSet<>();
        for(int i=0;i<a.length();i++) {
            s.add(a.charAt(i));
        }
        int co=0,n=words.length;
        for(int i=0;i<words.length;i++) {
            char c[]=words[i].toCharArray();
            for(int j=0;j<c.length;j++) {
                if(!s.contains(c[j])) {
                    co++;
                    break;
                }                    
            }
        }
        return n-co;
    }
}