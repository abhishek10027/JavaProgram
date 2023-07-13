package JavaProgram.Backtracking;

/*
 * Problem Statement: Given an undirected graph and a number m, 
 * 												determine if the graph can be colored with at most m colors 
 * 												such that no two adjacent vertices of the graph are colored with the same color.
 */

import java.util.*;
public class M_Coloring {
	public static boolean graphColoring(List < Integer > [] G, int[] color, int i, int C) {
        int n = G.length;
        if (coloring(i, G, color, n, C) == true) return true;
        return false;
    }
    private static boolean Safe(int node, List < Integer > [] G, int[] color, int n, int col) {
        for (int it: G[node]) {
            if (color[it] == col) return false;
        }
        return true;
    }
    private static boolean coloring(int node, List < Integer > [] G, int[] color, int n, int m) {
        if (node == n) return true;

        for (int i = 1; i <= m; i++) {
            if (Safe(node, G, color, n, i)) {
                color[node] = i;
                if (coloring(node + 1, G, color, n, m) == true) return true;
                color[node] = 0;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int N = 4, M = 3;
        List < Integer > [] E = new ArrayList[N];
        for (int i = 0; i < N; i++) {
            E[i] = new ArrayList < > ();
        }
        E[0].add(1);
        E[1].add(2);
        E[2].add(3);
        E[3].add(0);
        E[0].add(2);
        int[] color = new int[N];
        boolean ans = graphColoring(E, color, 0, M);
        if (ans == true) {
            System.out.println("Output :- 1");
            System.out.println("It is possible to colour the given graph using "+ M+" colours.");
            
        }
        
        else {
            System.out.println("0");
            System.out.println("It is not possible to colour the given graph using"+ M+"colours.");
        }
    }

}
