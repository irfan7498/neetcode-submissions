class Solution {
    int ROWS, COLS;
    int[][] dirs = {
        {0,1},
        {1,0},
        {0,-1},
        {-1,0}
    };
    public void solve(char[][] board) {
        ROWS = board.length -1;
        COLS = board[0].length -1;

        for(int i = 0 ; i <= ROWS; i++){
            for(int j = 0 ; j <= COLS ; j++){
                if(i == 0 || j == 0 || i == ROWS || j == COLS){
                    if(board[i][j] == 'O'){
                        helper(board, i , j);
                    }
                }
            }
        }
        
        for(int i = 0 ; i <= ROWS; i++){
            for(int j = 0 ; j <= COLS ; j++){
                if (board[i][j] == 'V'){
                    board[i][j] = 'O';
                }
                else{
                    board[i][j] = 'X';
                }
            }
        }
    }
    void helper(char[][] grid, int i , int j){
        
        if (i <0 || j < 0 || i > ROWS || j > COLS || grid[i][j] == 'V' || grid[i][j] == 'X') {
            return ;
        }
        grid[i][j] = 'V';
        for(int[] dir : dirs){
            helper(grid, i + dir[0] , j + dir[1]);
        }
    }
}
