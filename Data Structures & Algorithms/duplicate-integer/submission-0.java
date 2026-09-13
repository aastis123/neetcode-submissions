class Solution {
    public boolean hasDuplicate(int[] nums) {

        HashSet<Integer> set = new HashSet<>();
        boolean duplicate;
        for(int i : nums)
        {
            duplicate = set.add(i);
            if(duplicate == false)
            {
                return true;
            }
        }

        return false;
        
    }
}