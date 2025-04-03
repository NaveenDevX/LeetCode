class Solution {
    public boolean detectCapitalUse(String word) {
        if(allCaps(word) || allSmall(word) || firstup(word))
        {
            return true;
        }
        return false;
        
    }
    private boolean allCaps(String word)
    {
        int count=0;
        for(int i=0;i<word.length();i++)
        {
            char ch=word.charAt(i);
            if(Character.isUpperCase(ch))
            {
                count++;
            }
        }
        if(word.length()==count)
        {
            return true;
        }
        return false;
    }
    private boolean allSmall(String word)
    {
        int count=0;
        for(int i=0;i<word.length();i++)
        {
            char ch=word.charAt(i);
            if(Character.isLowerCase(ch))
            {
                count++;
            }
        }
        if(word.length()==count)
        {
            return true;
        }
        return false;
    }
    private boolean firstup(String word)
    {
        int count=0;
        for(int i=0;i<word.length();i++)
        {
            char ch=word.charAt(0);
            String sub_string=word.substring(1);
            if(Character.isUpperCase(ch) && allSmall(sub_string))
            {
                return true;
            }
        }
        return false;
    }
}