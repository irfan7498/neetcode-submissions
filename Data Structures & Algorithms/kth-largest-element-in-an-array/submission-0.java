class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> min = new PriorityQueue<>((a,b) -> Integer.compare(a,b));

        for(int num : nums){
            min.offer(num);
            if(min.size() > k ){
                min.poll();
            }
        }

        return min.peek();
    }
}