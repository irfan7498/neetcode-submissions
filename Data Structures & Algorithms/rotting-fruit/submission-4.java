
class Solution {
    public int orangesRotting(int[][] grid) {
        int ROWS = grid.length;
        int COLS = grid[0].length;
        int[][] dirs = {
            {1,0},
            {-1,0},
            {0,1},
            {0,-1}
        };
        int fresh = 0;
    
        Queue<int[]> q = new ArrayDeque<>();
        for(int i = 0 ; i < ROWS ; i++){
            for(int j = 0 ; j < COLS ; j++){
                if(grid[i][j] == 2){
                    q.offer(new int[]{i, j});
                }
                if(grid[i][j] == 1){
                    fresh++;
                }
            }
        }
        int min = 0 ;
        
        while(!q.isEmpty() && fresh > 0){
            int sz = q.size();
            for(int i = 0 ; i < sz ; i++){
                int[] node = q.poll();
                int r = node[0];
                int c = node[1];
                
                for(int[] dir: dirs){
                    int nr = r + dir[0];
                    int nc = c + dir[1];
                    if(nr >= ROWS || nc >= COLS || nr < 0 || nc < 0 || grid[nr][nc] != 1){
                        continue;
                    }else{
                        grid[nr][nc] = 2;
                        q.offer(new int[] { nr , nc});
                        fresh--;
                    }
                }
            }
            min++;
        }
        if(fresh >0 ) return -1 ;
        
        
        return  min;
    }
}
