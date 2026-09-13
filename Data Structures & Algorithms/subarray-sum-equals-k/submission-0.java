class Solution {
    public int subarraySum(int[] nums, int k) {

        Map<Integer, Integer> map = new HashMap<>();
        map.put(0,1);
        int result = 0;
        int prefix = 0;

        for(int i : nums)
        {
                prefix = prefix + i;
                if(map.containsKey(prefix-k))
                {
                    result = result + map.get(prefix-k);

                }

                map.put(prefix, map.getOrDefault(prefix,0) + 1);
        }

        return result;
        
    }
}