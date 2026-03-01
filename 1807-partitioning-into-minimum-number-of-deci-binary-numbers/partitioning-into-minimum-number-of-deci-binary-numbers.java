class Solution {
    public int minPartitions(String n) {
        int max = 0;
        int len = n.length();
        for(int i=0;i<len;i++)
        {
            char ch= n.charAt(i);
            max = Math.max(max, ch-'0');
        }
        return max;
    }
}