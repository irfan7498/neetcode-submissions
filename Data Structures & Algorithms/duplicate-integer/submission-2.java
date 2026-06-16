class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> seen = new HashSet<>();

        for(int w : nums){
            if (seen.contains(w)){
                return true;
            }
            else{
                seen.add(w);
            }
        }
        return false;
    }
}