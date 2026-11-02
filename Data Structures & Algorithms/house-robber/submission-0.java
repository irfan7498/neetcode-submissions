class Solution {
    int[] dp ;
    public int rob(int[] nums) {
        if(nums.length == 1) return nums[0];

        dp = new int[nums.length];
        for(int i =0 ; i < nums.length; i++){
            dp[i] = -1;
        }
        helper(nums, 0);
        helper(nums, 1);

        return Math.max(dp[0],dp[1]);   
    }
    public int helper(int[] nums, int i ){
        if(dp[i] != -1 ) return dp[i];
        if(i+2 >= nums.length){
            dp[i] = nums[i];
            return nums[i];
        }
        int maxSum = 0;

        for(int j = i +2 ; j < nums.length; j++){
            maxSum = Math.max(helper(nums, j), maxSum);
        }
        dp[i] = maxSum + nums[i];
        return dp[i];
    }
}
