class Solution {
    public boolean squareIsWhite(String coordinates) {
        int sum = 0;
        for(char ch : coordinates.toCharArray())
        {
            if(Character.isLetter(ch))
            {
                sum += (int)ch;
            }
            else{
                sum += ch-'0';
            }
        }
        return (sum%2==0)? false : true;
    }
}