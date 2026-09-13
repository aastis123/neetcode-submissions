class Solution {
    public int majorityElement(int[] nums) {

        Map<Integer,Integer> map = new HashMap<>();
        int result = 0;

        for(int i: nums)
        {
            if(map.containsKey(i) && map.get(i)>nums.length/2)
            {
                return i;
            }

            else{
                map.put(i, map.getOrDefault(i,0) + 1);
            }
        }

        for(Map.Entry<Integer,Integer> entry : map.entrySet())
        {
            if(entry.getValue()>nums.length/2)
            result =  entry.getKey();
        }

        return result;
        
    }
}