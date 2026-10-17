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
        int dist = 0;
        while(!q.isEmpty()){
            int sz = q.size();

            for(int i = 0 ; i < sz ; i++){
                int[] cur = q.poll(); 
                int r = cur[0];
                int c = cur[1];
                grid[r][c] = dist;
                 
                
                for(int[] dir : dirs){
                    int a = r+dir[0];
                    int b = c+dir[1];
                    if(a>=ROWS || b>=COLS || a<0 || b<0 || grid[a][b] != Integer.MAX_VALUE){
                        continue;
                    }
                    else{
                        grid[a][b] = dist+1;
                        q.offer(new int[]{a, b});
                    }
                }
            }
            dist++;
        }

    }
}
