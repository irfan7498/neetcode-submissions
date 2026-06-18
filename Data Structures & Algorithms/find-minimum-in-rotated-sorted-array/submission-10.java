class Solution {
    public int findMin(int[] nums) {
        int l = 0 , r = nums.length - 1;
        int mid, min = nums[0] ;

        while(l <= r){
            if ( nums[l] <= nums[r]){
                min = Math.min(min , nums[l]); 
                break;
            }
            mid = (l + r)/2;
            min = Math.min(min , nums[mid]);

            if (nums[l] <= nums[mid]){ //meaning left side is sorted ;
                l = mid + 1;
            } 
            else{
                r = mid - 1;
            }
        }
        return min;
    }
}
