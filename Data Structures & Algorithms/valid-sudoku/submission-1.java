class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int i = 0; i < board.length; i++){   
            Set<Character> set = new HashSet<>();
            for(int j = 0 ; j < board.length; j++){
                if(board[i][j] == '.') continue;
                if(set.contains(board[i][j])) return false;
                else set.add(board[i][j]);
            }
        }

        for(int i = 0; i < board.length; i++){   
            Set<Character> set = new HashSet<>();
            for(int j = 0 ; j < board.length; j++){
                if(board[j][i] == '.') continue;
                if(set.contains(board[j][i])) return false;
                else set.add(board[j][i]);
            }
        }

        for(int i = 0 ; i < board.length; i+=3){
            for(int j = 0 ; j < board.length; j+=3){
                if(!validSq(i , j, 3, board)) return false;
            }
        }
        return true;

    }

    boolean validSq(int rowIdx, int colIdx , int size, char [][] board){
        Set<Character> set = new HashSet<>();
        for(int i = rowIdx ; i < rowIdx + size; i++){
            for(int j = colIdx; j < colIdx + size; j++){
                if(board[i][j] == '.') continue;
                if(set.contains(board[i][j])) return false;
                else set.add(board[i][j]);
            }
        }
        return true;
    }
}
