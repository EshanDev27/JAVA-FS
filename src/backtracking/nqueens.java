package backtracking;

import java.util.ArrayList;
import java.util.List;

public class nqueens {
    public static void main(String[] args) {
        List<List<String>> arr = new ArrayList<>();
        System.out.println(backtrack(4));
    }

    public static List<List<String>> backtrack(int n){
        List<List<String>> ans = new ArrayList<>();
        char[][] board = new char[n][n];

        helper(board, ans, 0);

        return ans;
    }

    private static void helper(char[][] board, List<List<String>> ans, int row) {
        if(row == board.length){
            saveBoard(board, ans);
            return;
        }
        for (int col = 0; col < board.length; col++) {
            if(isSafe(row, col, board)){
                board[row][col] = 'Q';
                helper(board, ans, row + 1);
                board[row][col] = '.';
            }
        }
    }

    private static boolean isSafe(int row, int col, char[][] board) {
        //horizontal
        for (int i = 0; i < board.length; i++) {
            if(board[row][i] == 'Q'){
                return false;
            }
        }

        //vertical
        for(int j=0; j<board.length; j++) {
            if(board[j][col] == 'Q') {
                return false;
            }
        }

        //upper left
        int r = row;
        for(int c=col; c>=0 && r>=0; c--, r--) {
            if(board[r][c] == 'Q') {
                return false;
            }
        }

        //upper right
        r = row;
        for(int c=col; c<board.length && r>=0; r--, c++) {
            if(board[r][c] == 'Q') {
                return false;
            }
        }

        //lower left
        r = row;
        for(int c=col; c>=0 && r<board.length; r++, c--) {
            if(board[r][c] == 'Q') {
                return false;
            }
        }

        //lower right
        for(int c=col; c<board.length && r<board.length; c++, r++) {
            if(board[r][c] == 'Q') {
                return false;
            }
        }
        return true;
    }

    private static void saveBoard(char[][] board, List<List<String>> ans) {
        String row = "";
        List<String> newboard = new ArrayList<>();

        for (int i = 0; i < board.length; i++) {
            row = "";
            for (int j = 0; j < board.length; j++) {
                if(board[i][j] == 'Q'){
                    row += 'Q';
                }else{
                    row += '.';
                }
            }
        newboard.add(row);
        }
        ans.add(newboard);
    }
}