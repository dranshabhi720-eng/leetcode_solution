class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();
        
        for (int i = 0; i < nums.length; i++) {
            // Agar element already set mein hai, toh Duplicate mil gaya within distance k
            if (set.contains(nums[i])) {
                return true;
            }
            
            // Set mein current element add karo
            set.add(nums[i]);
            
            // Sliding window ka size maximum 'k' maintain karo
            if (set.size() > k) {
                set.remove(nums[i - k]);
            }
        }
        
        return false;
    }
}
