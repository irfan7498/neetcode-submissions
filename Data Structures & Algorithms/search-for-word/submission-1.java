// ["C","A","A"],
// ["A","A","A"],
// ["B","C","D"]
class Solution {
    int ROWS , COLS;
    int[][] dirs = {
        {0,1},
        {0,-1},
        {1, 0},
        {-1,0}
    };
    public boolean exist(char[][] board, String word) {
        ROWS = board.length;
        COLS = board[0].length;
        char[] arr = word.toCharArray();
        for(int i = 0 ; i < ROWS; i++){
            for(int j = 0 ; j < COLS ; j++){

                if(arr[0] == board[i][j]){
                    if(dfs(board, arr , i, j , 0)){
                        return true;
                    }
                }
            }
        }

        return false;
    }

    boolean dfs(char[][] board, char[] word, int i , int j ,int next){
        
        if(i < 0 || j <0 || i >= ROWS || j >= COLS || next >= word.length || board[i][j] == '1' || board[i][j] != word[next]){
            return false;
        }
        if(board[i][j] == word[next] && next == word.length -1){
            return true;
        }
        boolean res ;
        char temp = board[i][j];
        board[i][j] = '1';
        for(int[] dir: dirs){
            int ni = i + dir[0];
            int nj = j + dir[1];
            if(dfs(board, word, ni , nj, next+1)){
                return true;
            }
        }
        board[i][j] =temp;
        return false;
    }
}
