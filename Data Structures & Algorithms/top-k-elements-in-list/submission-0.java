class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        Map<Integer,Integer> map = new HashMap<>();
        List<Integer>[] frequency = new List[nums.length+1];

        for(int i : nums)
        {
            map.put(i , map.getOrDefault(i,0) +1);
        }

for(int key : map.keySet())
{
    int value = map.get(key);
    if(frequency[value] == null)
    frequency[value] = new ArrayList<>();
    frequency[value].add(key);
}

int[] result = new int[k];
int counter=0;

for(int i = frequency.length-1 ; counter<k && i>=0 ; i--)
{
    if(frequency[i]!=null)
    {
        for(Integer integer : frequency[i])
        {
            result[counter++]= integer;
        }
    }
}

return result;

        
    }
}
