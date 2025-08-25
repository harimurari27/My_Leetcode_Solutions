class Solution {
    public int numRabbits(int[] answers) 
    {
        int n=answers.length;
        int a=0;
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            hm.put(answers[i],hm.getOrDefault(answers[i],0)+1);
        }
        for(Map.Entry<Integer,Integer> e:hm.entrySet())
        {
            int nm=e.getKey();
            int f=e.getValue();
            while(f>0)
            {
                a+=(nm+1);
                f-=(nm+1);
            }

        }
        return a;
    }
}