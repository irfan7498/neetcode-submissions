class Solution {
    public int leastInterval(char[] tasks, int n) {
        int[] count = new int[26];
        for(char a : tasks){
               count[a - 'A'] += 1;
        }
        PriorityQueue<Integer> max = new PriorityQueue<>((a,b) -> Integer.compare(b,a));
        for(int f : count){
            if(f>0){
                max.offer(f);
            }
        }
        Queue<int[]> q = new LinkedList<>();
        int time = 0 ;

        while(!q.isEmpty() || !max.isEmpty()){
            time++;
            if(max.isEmpty()){
                time = q.peek()[1];
            } else{
                int cnt = max.poll() -1;
                if(cnt>0){
                    q.add(new int[]{cnt, time+n});
                }
            }

            if(!q.isEmpty() && q.peek()[1] == time){
                max.add(q.poll()[0]);
            }

        }
        return time;
    }
}
