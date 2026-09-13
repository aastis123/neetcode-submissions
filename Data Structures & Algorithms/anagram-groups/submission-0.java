class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        List<List<String>> result = new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();

        for(String s : strs)
        {
            int[] count = new int[26];
            for(char c: s.toCharArray())
            {
                count[c - 'a']= count[c-'a'] + 1;
            }

            String key = Arrays.toString(count);
            map.putIfAbsent(key, new ArrayList<String>());
            map.get(key).add(s);
        }

        return new ArrayList<>(map.values());
        
    }
}
