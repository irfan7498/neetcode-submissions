class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> indArr = new HashMap<>();
        
        for(int i = 0 ; i < nums.length; i++){
            indArr.put( nums[i], i );
        }

        for(int i =0 ; i < nums.length; i++){
            int diff = target - nums[i]; 
            Integer ind = indArr.get(diff);
            if  ( ind == null || ind == i ){
                continue;
            }  
            else{
                return new int[]{i, ind};
            }
        }
        return new int[]{0, 0};
    }
}
