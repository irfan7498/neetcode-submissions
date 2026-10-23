class Solution {
    int ROWS , COLS;
    int [][] dirs = {
        {0,1},
        {1,0},
        {0,-1},
        {-1,0}
    };
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        List<List<Integer>> res = new ArrayList<>();
        ROWS = heights.length - 1;
        COLS = heights[0].length - 1;
        boolean[][] p = new boolean[ROWS+1][COLS+1];
        boolean[][] a = new boolean[ROWS+1][COLS+1];

        //iterating over ROWs wise ^ 
        for(int i = 0 ; i <= ROWS ; i++){
            helper(heights, i , 0 , 0, p);
            helper(heights, i , COLS, 0 ,a);
        }
        //iterating over cols wise -> 
        for(int i = 0 ; i <= COLS ; i++){
            helper(heights, 0 , i,0, p);
            helper(heights, ROWS, i, 0, a);
        }

        for(int i = 0 ; i <= ROWS ; i++){
            for(int j = 0 ; j <= COLS; j++){
                if(a[i][j] && p[i][j]){
                    
                    res.add(new ArrayList<>(List.of(i, j)));
                }
            }
        }
        return res;
    }
    void helper(int[][] grid , int i , int j, int cur ,boolean[][] check){
        
        if(i <0 || j <0 || i > ROWS || j > COLS || grid[i][j] < cur || check[i][j]){
            return ;
        }

        check[i][j] = true;
        for(int[] dir : dirs){
            int nr = i + dir[0];
            int nc = j + dir[1];
            helper(grid, nr , nc , grid[i][j], check);
        }
    }
}
