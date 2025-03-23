class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>(); 
        int candy = Arrays.stream(candies).max().getAsInt();
        for(int i=0;i<candies.length;i++)
        {
                result.add((candies[i]+extraCandies)>=candy);
        }
        return result;
        
    }
}