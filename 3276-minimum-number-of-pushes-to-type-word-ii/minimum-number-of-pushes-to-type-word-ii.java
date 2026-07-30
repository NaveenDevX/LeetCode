class Solution {
    public int minimumPushes(String word) {
        int [] arr = new int[26];
        for(char ch : word.toCharArray())
        {
            arr[ch-'a']++;
        }
        Arrays.sort(arr);

        int res = 0;
        int curr=0;
        for(int i=25;i>=0 && arr[i]>0;i--)
        {
            res += arr[i] * ((curr/8)+1);
            curr++;
        }

        return res;
    }
}