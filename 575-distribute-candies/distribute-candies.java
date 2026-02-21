class Solution {
    public int distributeCandies(int[] candyType) {
        int type = candyType.length/2;
        HashSet<Integer> set= new HashSet<>();
        for(int num : candyType)
        {
            if(!set.contains(num))
            {
                set.add(num);
            }
        }
        if(type<set.size())
        {
            return type;
        }
        return set.size();
    }
}