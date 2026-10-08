class Solution {
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        helper(nums, 0, new ArrayList<>());
        return res;
    }
    public void helper(int[] nums, int start, List<Integer> arr){
        res.add(new ArrayList<>(arr));
        for(int i = start ; i < nums.length ; i++){
            
            arr.add(nums[i]);
            
            helper(nums,i+1,arr);
            arr.remove(arr.size() -1 );
        }
    } 
}
