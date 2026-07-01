class Solution {
    public String alphabetBoardPath(String target) {
        StringBuilder sb = new StringBuilder();
        int p = 0, q = 0;
        for(char ch : target.toCharArray()){
            int p1 = (ch-'a') / 5;
            int q1 = (ch -'a') % 5;
            while(q1<q)
            {
                q--;
                sb.append('L');
            }
            while(p1<p)
            {
                p--;
                sb.append('U');
            }
            while(p1>p){
                p++;
                sb.append('D');
            }
            while(q1>q){
                q++;
                sb.append('R');
            }          
            sb.append('!');
        }

        return sb.toString();
    }
}