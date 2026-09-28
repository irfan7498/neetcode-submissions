class Solution {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]> minHeap = new PriorityQueue<>(
            (a,b) -> {
            
            int dis1 = a[0] * a[0] + a[1] * a[1];
            int dis2 = b[0] * b[0] + b[1] * b[1];

            return Integer.compare(dis2, dis1);
            }
        );
        int[][] res = new int[k][2];
        for(int[] num: points){
            
            minHeap.offer(num);
            if(minHeap.size() > k){
                minHeap.poll();
            }
        }
        int i = 0;
        while(!minHeap.isEmpty()){
            res[i++] = minHeap.poll();
        }
        
        return res;
    }
}
