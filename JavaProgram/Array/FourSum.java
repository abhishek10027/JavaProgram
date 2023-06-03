package JavaProgram.Array;

/* Problem Statement:Our task is to find unique quads that add up(sum of four element) to give a target value.*/

import java.util.*;
public class FourSum {
	public static List<List<Integer>> fourSum(int[] arr, int target) {
        int n = arr.length; 
        List<List<Integer>> list = new ArrayList<>();
        
        Arrays.sort(arr);
        
        for (int i = 0; i < n; i++) {
            
            if (i > 0 && arr[i] == arr[i - 1]) continue;
            for (int j = i + 1; j < n; j++) {
                
                if (j > i + 1 && arr[j] == arr[j - 1]) continue;

                // 2 pointers:
                int k = j + 1;
                int l = n - 1;
                while (k < l) {
                    long sum = arr[i];
                    sum += arr[j];
                    sum += arr[k];
                    sum += arr[l];
                    if (sum == target) {
                        List<Integer> temp = new ArrayList<>();
                        temp.add(arr[i]);
                        temp.add(arr[j]);
                        temp.add(arr[k]);
                        temp.add(arr[l]);
                        list.add(temp);
                        k++;
                        l--;

                        // skip the duplicates:
                        while (k < l && arr[k] == arr[k - 1]) k++;
                        while (k < l && arr[l] == arr[l + 1]) l--;
                    } else if (sum < target) k++;
                    else l--;
                }
            }
        }

        return list;
    }

    public static void main(String[] args) {
        int[] arr = {4, 3, 3, 4, 4, 2, 1, 2, 1, 1};
        int target = 6;
        List<List<Integer>> result = fourSum(arr, target);
        
        System.out.println("The quadruplets are: ");
        for (List<Integer> i : result) {
            System.out.print("[");
            for (int element : i) {
                System.out.print(element + " ");
            }
            System.out.print("] ");
        }
        System.out.println();
    }
}
