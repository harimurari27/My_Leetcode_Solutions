class Solution {
    public char findTheDifference(String s, String t) {
        HashMap<Character,Integer> m=new HashMap<>();
        char f='a';
        for(int i=0;i<s.length();i++){
            if(m.containsKey(s.charAt(i))){
                m.put(s.charAt(i),m.get(s.charAt(i))+1);
            }
            else{
                m.put(s.charAt(i),1);
            }
        }
        for(int i=0;i<t.length();i++){
            char c=t.charAt(i);
            if(m.containsKey(c)){
                if(m.get(c)>0){
                  m.put(c,m.get(c)-1);
                }
                else{
                    f=c;  
                }
            }
            else{
              f=c;  
            }
        }
       return f ;
    }
}