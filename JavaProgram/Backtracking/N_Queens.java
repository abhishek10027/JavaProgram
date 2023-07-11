package JavaProgram.Backtracking;

/*
 * Problem Statement :- The n-queens puzzle is the problem of placing n queens on an n x n chess board such that no two queens attack each other.
						Given an integer n, return all distinct solutions to the n-queens puzzle. 
 */

import java.util.*;
public class N_Queens {
	
	public static List<List<String>> solveNQueens(int n) {
		List<List<String>> result = new ArrayList<>();
        char[][] board = new char[n][n];
        
        //Filled it as empty cells
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++) {
                board[i][j] = '.';
            }
        }
        
        List<int[]> queens = new ArrayList<>();
        dfs(board, 0, queens,result);
        return result;
    }
    
    private static void dfs(char[][] board, int r, List<int[]> queens,List<List<String>> result) {
        //Check if all queens are placed
        if(queens.size() == board.length) {
            //Construct output
            List<String> rows = new ArrayList<>();
            for(char[] row : board) {
                rows.add(new String(row));
            }
            
            result.add(rows);
        }
        
        //Try adding the queen
        for(int c = 0; c < board.length; c++) {
            if(AddQueen(r,c,queens)) {
                board[r][c] = 'Q';
                queens.add(new int[]{r,c});
                dfs(board, r+1, queens,result);
                board[r][c] = '.';
                queens.remove(queens.size()-1);
            }
        }
    }
    
    private static boolean AddQueen(int r, int c, List<int[]> queens) {
        for(int[] q : queens) {
            int dr = Math.abs(r-q[0]);
            int dc = Math.abs(c-q[1]);
            if(dr==0 || dc==0 || dr==dc) return false;
        }
        return true;
    }

	public static void main(String[] args) {
		int N = 4;
        List < List < String >> queen = solveNQueens(N);
        int i = 1;
        for (List < String > it: queen) {
            System.out.println("Arrangement " + i);
            for (String s: it) {
                System.out.println(s);
            }
            System.out.println();
            i += 1;
        }

	}

}
