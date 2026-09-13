class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        int[] result = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i =0; i<nums.length; i++)
        {
            int residue = target - nums[i];
            if(map.containsKey(residue))
            {
                result[0]= map.get(residue);
                result[1]= i;
                break;
            }
            else
            {
                map.put(nums[i],i);
            }
        }

        return result;


    }
}
