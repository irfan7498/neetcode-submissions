class Solution {
    public int search(int[] nums, int target) {
     int l = 0 , r = nums.length - 1 ;

     while(l <= r){
        int mid = (r + l)/ 2;

        if (nums[mid] == target){
            //normal binary search
            return mid;
        }
        
        if (nums[l] <= nums[mid]){
            if (target > nums[mid] || target < nums[l]){
                l = mid + 1;
            }
            else{
                r = mid -1 ;
            }
        }
        else{
            if ( target < nums[mid] || nums[r] < target ){
                r = mid - 1; 
            }
            else{
                l = mid + 1; 
            }
        } 
     }   
     return -1;
    }
}
