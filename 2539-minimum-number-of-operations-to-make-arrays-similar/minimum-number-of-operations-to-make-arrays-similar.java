class Solution {
    public long makeSimilar(int[] nums, int[] target) {
        long ans=0;
        ArrayList<Integer> o1= new ArrayList<>();
        ArrayList<Integer> e1= new ArrayList<>();
        for(int num : nums)
        {
            if(num % 2 ==1)
            {
                o1.add(num);
            }
            else{
                e1.add(num);
            }
        }
        Collections.sort(o1);
        Collections.sort(e1);

        ArrayList<Integer> o2= new ArrayList<>();
        ArrayList<Integer> e2= new ArrayList<>();
        for(int num : target)
        {
            if(num % 2 ==1)
            {
                o2.add(num);
            }
            else{
                e2.add(num);
            }
        }
        Collections.sort(o2);
        Collections.sort(e2);

        for(int i=0;i<o1.size();i++)
        {
            if(o1.get(i)>o2.get(i))
            {
                ans+= (o1.get(i)-o2.get(i))/2;
            }
        }
        for(int i=0;i<e1.size();i++)
        {
            if(e1.get(i)> e2.get(i))
            {
                ans+=(e1.get(i)-e2.get(i))/2;
            }
        }
        return ans;

    }
}