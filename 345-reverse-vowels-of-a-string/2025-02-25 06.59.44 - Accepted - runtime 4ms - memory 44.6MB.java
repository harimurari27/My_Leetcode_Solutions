class Solution {
    public String reverseVowels(String s) 
    {
      char arr[]=s.toCharArray();
      HashSet<Character> h=new HashSet<>(Arrays.asList('a','e','i','o','u','A','E','I','O','U'));
      int l=0,r=arr.length-1;
      while(l<r)
      {
        while(l<r&&!h.contains(arr[l]))
        {
            l++;
        }
        while(l<r&&!h.contains(arr[r]))
        {
            r--;
        }
        if(l<r)
        {
            char temp=arr[l];
            arr[l]=arr[r];
            arr[r]=temp;
            l++;
            r--;
        }
      }
      return new String(arr);
    }
}