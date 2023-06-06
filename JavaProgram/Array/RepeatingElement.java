package JavaProgram.Array;

/*
 * Problem Statement: The task is to find the repeating numbers which repeats twice in any given array.
 */
public class RepeatingElement {
	static void printRepeating(int arr[])
    {
        int n=arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j])
                    System.out.print(arr[i] + " ");
            }
        }
    }
 
    public static void main(String[] args)
    {
        int arr[] = { 4, 2, 4, 5, 2, 3,9,3,9};
        System.out.println("Repeating Elements are :\n");
        printRepeating(arr);
    }
}
