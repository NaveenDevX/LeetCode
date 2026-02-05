class Solution {
    public String reverseVowels(String s) {

        char [] arr= s.toCharArray();
        HashMap<Character, Boolean> map =new HashMap<>();
        map.put('A',true);
        map.put('E',true);
        map.put('I',true);
        map.put('O',true);
        map.put('U',true);
        map.put('a',true);
        map.put('e',true);
        map.put('i',true);
        map.put('o',true);
        map.put('u',true);

        int left =0;
        int right= s.length()-1;

        while(left < right)
        {
            if(!map.containsKey(arr[left]))
            {
                left++;
            }
            else if(!map.containsKey(arr[right]))
            {
                right--;
            }
            else{
                char temp= arr[left];
                arr[left]=arr[right];
                arr[right]=temp;
                left++;
                right--;
            }
        }
        return new String(arr);

    }
}