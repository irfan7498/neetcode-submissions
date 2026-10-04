class Solution {
    int maxArea = 0;
    int area = 0 ;
    public int maxAreaOfIsland(int[][] grid) {

        int ROWS = grid.length;
        int COLS = grid[0].length;

        for(int i = 0 ; i < ROWS ; i++){

            for(int j = 0 ; j < COLS ; j++){
                
                if(grid[i][j] == 1){
                    area = 0 ;
                    dfs(grid, i , j);
                    maxArea = Math.max(maxArea, area);
                }
            }
        }
        return maxArea;
    }
    public void dfs(int[][] grid, int i , int j ){
        if(i < 0 || j < 0 || i >= grid.length || j >= grid[0].length){
            return;
        }
        if(grid[i][j] == 0){
            return ;
        }
        area++ ;
        grid[i][j] = 0;
        dfs(grid, i , j+1);
        dfs(grid, i , j-1);
        dfs(grid, i+1 , j);
        dfs(grid, i-1, j);
        return ;
    }
}
