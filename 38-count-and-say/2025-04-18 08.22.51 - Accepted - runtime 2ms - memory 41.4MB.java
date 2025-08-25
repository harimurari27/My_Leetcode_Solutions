class Solution {
    public String countAndSay(int n) {
     if(n==1)return "1";
     String p=countAndSay(n-1);
     int q=p.length();
     StringBuilder sb=new StringBuilder();
     int c=1;
     for(int i=1;i<q;i++){
        if(p.charAt(i) == p.charAt(i-1)){
            c++;
        }
        else{
            sb.append(c).append(p.charAt(i-1));
            c=1;
        }
     }   
     sb.append(c).append(p.charAt(q-1));
     return sb.toString();
    }
}