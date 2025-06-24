// Last updated: 6/25/2025, 3:33:31 AM
class Solution {
    public int firstUniqChar(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for(char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for(int i = 0; i < s.length(); i++) {
            if(map.get(s.charAt(i)) == 1) return i;
        }
        return -1;
    }
}