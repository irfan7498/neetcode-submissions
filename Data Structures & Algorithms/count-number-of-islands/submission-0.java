class Solution {
    int islands = 0 ;
    public int numIslands(char[][] grid) {
        int ROWS = grid.length;
        int COLS = grid[0].length;

        for(int i = 0 ; i < ROWS ; i ++){
            for(int j = 0 ; j < COLS ; j++){
                if(grid[i][j] == '1'){
                    islands++;
                    dfs(grid, i , j);
                }
            }
        }
        return islands;
    }
    public void dfs(char[][] grid , int i , int j ){
            if(i < 0 || j < 0 || i >=grid.length || j>= grid[0].length){
                return ;
            }
            if(grid[i][j] == '0'){
                return;
            }
            grid[i][j] = '0';
            //right 
            dfs(grid, i, j+1);
            dfs(grid, i, j-1);
            dfs(grid, i+1, j);
            dfs(grid, i-1, j);
            return ;
    }
}
