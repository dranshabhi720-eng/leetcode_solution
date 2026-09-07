class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> seen = new HashSet<>();
        for(int num:nums){
            //agar number phle se set mai hai, toh duplicate mil jayega
            if(!seen.add(num)){
                return true;
            }
        }
        return false;
    }
}