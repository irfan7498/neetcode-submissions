class Solution {
    public int findMin(int[] nums) {
        int l = 0 , r = nums.length-1;

        while(l < r){
            if ( nums[l] > nums[r]){
                if (nums[r-1] < nums[r]){
                    r--;
                }
                else{
                    return nums[r];
                }
            }
            else{
                return nums[l];
            }
        }
        return nums[r];
    }
}
