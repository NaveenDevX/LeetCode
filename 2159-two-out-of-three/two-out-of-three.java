class Solution {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        List<Integer> ans = new ArrayList<>();
        HashSet<Integer> n1= new HashSet<>();
        HashSet<Integer> n2 = new HashSet<>();
        HashSet<Integer> n3= new HashSet<>();
        for(int i=0;i<nums1.length;i++)
        {
            n1.add(nums1[i]);
            
        }
        for(int i=0;i<nums2.length;i++)
        {
            if(n1.contains(nums2[i]))
            {
               n3.add(nums2[i]);
            }
            n2.add(nums2[i]);
        }
        for(int i=0;i<nums3.length;i++)
        {
            if(n1.contains(nums3[i]) || n2.contains(nums3[i]))
            {
                n3.add(nums3[i]);
            }
        }
        for(int a: n3)
        {
            ans.add(a);
        }
       return ans;
        
    }
}