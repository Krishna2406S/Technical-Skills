/* Ques: Given an array , count number of elements having at least one element greater than itself.

Pseudo Code:
1. Iterate and find the MAX of the array.
2. Iterate and get the number of elements which are not equal to MAX.
 */

import java.util.Scanner;

public class Program1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        int count = 0;
        int max = arr[0];
        for (int i = 0; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        for (int i = 0; i < n; i++) {
            if (arr[i] < max) {
                count++;
            }
        }
        System.out.println("Count: " + count);
        
        sc.close();
    }
}
