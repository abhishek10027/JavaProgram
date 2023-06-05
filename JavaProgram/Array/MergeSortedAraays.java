package JavaProgram.Array;

/*
 Problem statement: Merge two sorted arrays based on their length. 
 */
import java.util.*;
public class MergeSortedAraays {
	public static void merge(long[] arr1, long[] arr2) {
		// length of both array
		int n = arr1.length; 
        int m = arr2.length;

        // Declare 2 pointers:
        int left = n - 1;
        int right = 0;

        // Swap the elements until arr1[left] > arr2[right] is true
        
        while (left >= 0 && right < m) {
            if (arr1[left] > arr2[right]) {
                long temp = arr1[left];
                arr1[left] = arr2[right];
                arr2[right] = temp;
                left--;
                right++;
            } else {
                break;
            }
        }

        // Sort arr1[] and arr2[] 
        Arrays.sort(arr1);
        Arrays.sort(arr2);
    }

    public static void main(String[] args) {
        long[] arr1 = {1, 4,5,6,7};
        long[] arr2 = {2, 3, 9};
        int n = arr1.length; 
        int m = arr2.length;
        
        merge(arr1, arr2);
        System.out.println("The merged arrays are:");
        
        System.out.print("arr1[] = ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr1[i] + " ");
        }
        System.out.print("\narr2[] = ");
        for (int i = 0; i < m; i++) {
            System.out.print(arr2[i] + " ");
        }
        System.out.println();
    }
   }
