class Solution {
    public int maxBottlesDrunk(int numBottles, int numExchange) {
        int a = numBottles;
        int b = numBottles;
        while(b >= numExchange){
            a++;
            b-= numExchange;
            b++;
            numExchange++;
        }
        return a;

        
    }
}