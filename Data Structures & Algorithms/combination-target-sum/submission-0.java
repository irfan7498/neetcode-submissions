class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> res = new ArrayList<>();
        bt(0,0, nums , target , new ArrayList<>(), res);
        return res;
    }
    public void bt(int index ,int sum, int[] nums, int target, List<Integer> cur , List<List<Integer>> res){
        if( sum == target){
            res.add(new ArrayList<>(cur));
            return;
        }
        if(sum > target){
            return ;
        }
        for(int i = index ; i < nums.length; i++){
            cur.add(nums[i]);
            sum = sum + nums[i];
             bt(i,sum , nums , target , cur, res);
             sum = sum - nums[i];
            cur.remove(cur.size() -1);
        }
    }
}
