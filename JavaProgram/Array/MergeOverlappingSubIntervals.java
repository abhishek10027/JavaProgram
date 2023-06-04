package JavaProgram.Array;

/*Problem Statement: Merge all the overlapping intervals and return an array of non-overlapping intervals.*/

import java.util.*;

public class MergeOverlappingSubIntervals {
	public static List<List<Integer>> mergeOverlappingIntervals(int[][] arr) {
        int n = arr.length; // size of the array
        //sort the given intervals:
        Arrays.sort(arr, new Comparator<int[]>() {
            public int compare(int[] a, int[] b) {
                return a[0] - b[0];
            }
        });

        List<List<Integer>> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            
            if (list.isEmpty() || arr[i][0] > list.get(list.size() - 1).get(1)) {
                list.add(Arrays.asList(arr[i][0], arr[i][1]));
            }
            
            else {
                list.get(list.size() - 1).set(1,
                                            Math.max(list.get(list.size() - 1).get(1), arr[i][1]));
            }
        }
        return list;
    }

    public static void main(String[] args) {
        int[][] arr = {{1,4},{4,5}};
        List<List<Integer>> list = mergeOverlappingIntervals(arr);
        System.out.print("The merged intervals are: \n");
        for (List<Integer> i : list) {
            System.out.print("[" + i.get(0) + ", " + i.get(1) + "] ");
        }
        System.out.println();
    }

}
