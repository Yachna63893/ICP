package ICP.Day3;

public class Word_Search {
    class Solution {
    public boolean exist(char[][] board, String word) {
        int row = board.length;
        int col = board[0].length;
        boolean[][] visited= new boolean[row][col];
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                if(word.charAt(0)==board[i][j] && searchword(i,j,0,word,board,visited)){
                    return true;
                }
            }
        }
        return false;
    }
    public static boolean searchword(int i, int j , int idx, String word, char[][] board, boolean[][] visited){
        if(idx==word.length()){
            return true;
        }
        if(i<0 || i>=board.length|| j<0 || j>=board[0].length || word.charAt(idx)!=board[i][j] || visited[i][j]){
            return false;
        }
        visited[i][j] = true;
        if(
            searchword(i+1,j,idx+1,word,board,visited) ||
            searchword(i-1,j,idx+1,word,board, visited) ||
            searchword(i,j+1,idx+1,word,board, visited) ||
            searchword(i,j-1,idx+1,word,board, visited)){
            return true;
        }
        visited[i][j] = false;

        return false;
    }
}
}
