class Solution {
    public boolean checkPrimeFrequency(int[] nums) {
        Map<Integer,Integer> map= new HashMap<>();
        for(int num : nums){
            map.put(num, map.getOrDefault(num,0)+1);
        }
        for(int n: map.values()){
            if(Prime(n)) return true;
        }
        return false;
    }
       public boolean Prime(int n){
        if(n<2) return false;
        for(int i=2 ;i*i<=n;i++){
            if(n%i==0) return false;
        }
        return true;     
       } 
}