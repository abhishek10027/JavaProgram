package JavaProgram.HeapPrograms;

/*
 * Problem statement :- Find the k-closest points from the origin.
 */

import java.util.*;

public class KClosestPointsToOrigin {
	
	static int[][] kclosestpoint(int [][] points,int K){
		
		if(points==null){
            return null;
        }
		int n=points.length;
		int [][]result=new int[K][2];
		
		
		PriorityQueue<int[]>pq=new PriorityQueue<>((x,y)->(x[0]*x[0]*x[1]*x[1])-(y[0]*y[0]*y[1]*y[1]));
		
		for(int i=0; i<n;i++) {
            pq.add(points[i]);
            if(pq.size()>K){
                pq.remove();
            }
        }
        
       
        
        for(int i=0;i<K;i++){
            result[i] = pq.remove();
            
        }
        return result;
    
}

	public static void main(String[] args) {
		int points[][] = { { 3, 3 },
                { 5, -1 },
                { -2, 4 } };

		int K = 2;

		int[][] closestPoints = kclosestpoint(points, K);
	    for (int[] point : closestPoints) {
	        System.out.print(Arrays.toString(point));
	    }
	}

}
