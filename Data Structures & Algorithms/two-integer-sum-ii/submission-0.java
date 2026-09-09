class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] res = new int[2];
        for(int i = 0 ; i < numbers.length ; i++){
            int l = i + 1;
            int h = numbers.length -1 ;
            int x = target - numbers[i];

            while(l <= h){
                int mid = l + (h - l) /2;
                if(numbers[mid] == x ){
                    res[1] = mid +1;
                    res[0] = i + 1;
                    break;
                }     

                else if (numbers[mid] < x){
                    l = mid +1 ;
                }
                else{
                    h = mid - 1;
                }
            }
        }
        return res;
    }
}
