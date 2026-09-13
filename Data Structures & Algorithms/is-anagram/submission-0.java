class Solution {
    public boolean isAnagram(String s, String t) {

        HashMap<Character, Integer> hms = new HashMap<>();
        HashMap<Character, Integer> hmt = new HashMap<>();

        for(int i =0; i<s.length(); i++)
        {
            char c = s.charAt(i);
            hms.put(c, hms.getOrDefault(c, 0) + 1);
        }

        for(int i =0; i<t.length(); i++)
        {
            char c = t.charAt(i);
            hmt.put(c, hmt.getOrDefault(c, 0) + 1);
        }

        return hms.equals(hmt);



    }
}
