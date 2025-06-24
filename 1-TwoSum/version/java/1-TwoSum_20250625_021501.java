// Last updated: 6/25/2025, 2:15:01 AM
class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> Hmap = new HashMap<>();
        for(int i= 0; i<nums.length; i++) {
            int complement = target - nums[i];
            if(Hmap.containsKey(complement)) {
                return new int[] {Hmap.get(complement), i};
            }
            Hmap.put(nums[i], i);
        }
        throw new IllegalArgumentException("no match found");
    
    }
}