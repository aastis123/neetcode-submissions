class Solution {
    public int longestConsecutive(int[] nums) {

        HashMap<Integer, Boolean> explored = new HashMap<>();
        for(int num : nums)
        {
            explored.put(num,Boolean.FALSE);
        }

        int maxlength = 0;

        for(int num : nums)
        {
            int current = 1;

            //check in forward direction first
            int next = num + 1;
            while(explored.containsKey(next) && !explored.get(next))
            {
                current++;
                explored.put(next,Boolean.TRUE);
                next++;
            }

            //check in backward direction now
            int prev = num-1;
            while(explored.containsKey(prev) && !explored.get(prev))
            {
                current++;
                explored.put(prev,Boolean.TRUE);
                prev--;
            }

            maxlength = Math.max(current, maxlength);
        }

        return maxlength;
        
    }
}
