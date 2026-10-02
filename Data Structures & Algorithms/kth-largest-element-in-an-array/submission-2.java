class Solution {
    public int findKthLargest(int[] nums, int k) {
        return quickSelect(nums, 0, nums.length-1, nums.length-k );
    }
    public int quickSelect(int[] nums, int left, int right, int k){
        int pivot = nums[right];
        int i = left;
//i is on always on edge of minimum 
        for(int j = left; j<right; j++){
            if(nums[j]<= pivot){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
            }
        }

        int temp = nums[i];
        nums[i] = nums[right];
        nums[right] = temp;

        if(i < k){
            return quickSelect(nums, i+1, right, k);
        }
        else if(i > k ){
            return quickSelect(nums, left, i-1, k);
        }
        else{
            return nums[i];
        }
    }
}
