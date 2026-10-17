class Solution {

    public void islandsAndTreasure(int[][] grid) {
        //using multi source bfs 
        int[][] dirs = {
            {0,1},
            {0,-1},
            {1,0},
            {-1,0},
        };

        int ROWS = grid.length;
        int COLS = grid[0].length;
        Queue<int[]> q = new ArrayDeque<>();
        
        for(int i = 0 ; i < ROWS; i++){
            for(int j = 0 ; j < COLS ; j++){
                if(grid[i][j] == 0){
                    q.offer(new int[]{i, j});
                }
            }
        }
        
        while(!q.isEmpty()){
            int sz = q.size();
            int[] cur = q.poll(); 
            int r = cur[0];
            int c = cur[1];
                
            
            for(int[] dir : dirs){
                int nr = r+dir[0];
                int nc = c+dir[1];
                if(nr>=ROWS || nc>=COLS || nr<0 || nc<0 || grid[nr][nc] != Integer.MAX_VALUE){
                    continue;
                }
                
                grid[nr][nc] = grid[r][c]+1;
                q.offer(new int[]{nr, nc});
            
            }
            
        }

    }
}
