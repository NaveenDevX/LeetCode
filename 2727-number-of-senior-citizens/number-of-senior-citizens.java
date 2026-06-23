class Solution {
    public int countSeniors(String[] details) {
        int count = 0;
        int n = details.length;
        List<Integer> list = new ArrayList<>();
        for(String s : details)
        {
            int num = Integer.parseInt(s.substring(11,13));
            list.add(num);
        }
        for(int i : list)
        {
            if(i>60) count++;
        }
        return count;
    }
}