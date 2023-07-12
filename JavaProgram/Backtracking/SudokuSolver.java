package JavaProgram.Backtracking;

/*
 * Problem statement :-  Write a program for Sudoku solver.
 */

public class SudokuSolver {
	
	public static boolean solveSudoku(char[][] board) {
	    for (int i = 0; i < 9; i++) {
	      for (int j = 0; j < 9; j++) {
	        if (board[i][j] == '.') {

	          for (char c = '1'; c <= '9'; c++) {
	            if (isValid(board, i, j, c)) {
	              board[i][j] = c;

	              if (solveSudoku(board))
	                return true;
	              else
	                board[i][j] = '.';
	            }
	          }

	          return false;
	        }
	      }
	    }
	    return true;
	  }

	  public static boolean isValid(char[][] board, int row, int col, char c) {
	    for (int i = 0; i < 9; i++) {
	      if (board[i][col] == c)
	        return false;

	      if (board[row][i] == c)
	        return false;

	      if (board[3 * (row / 3) + i / 3][3 * (col / 3) + i % 3] == c)
	        return false;
	    }
	    return true;
	  }

	  public static void main(String[] args) {

	   char[][] board= {
	                    {'.', '5', '2', '.', '.', '6', '.', '.', '.'},
	                    {'1', '6', '.', '9', '.', '.', '.', '.', '4'},
	                    {'.', '4', '9', '8', '.', '3', '6', '2', '.'},
	                    {'4', '.', '.', '.', '.', '.', '8', '.', '.'},
	                    {'.', '8', '3', '2', '.', '1', '5', '9', '.'},
	                    {'.', '.', '1', '.', '.', '.', '.', '.', '2'},
	                    {'.', '9', '7', '3', '.', '5', '2', '4', '.'},
	                    {'2', '.', '.', '.', '.', '9', '.', '5', '6'},
	                    {'.', '.', '.', '1', '.', '.', '9', '7', '.'}
	                    };
	    solveSudoku(board);

	    for (int i = 0; i < 9; i++) {
	      for (int j = 0; j < 9; j++)
	        System.out.print(board[i][j] + " ");
	      System.out.println();
	    }
	  }

}
