/* Ques.:
Given an integer array A of size N,
find and return the product array of the same size 
where the ith element of the product array will be equal to the 
product of all elements divided by the ith element of the array A.


 */
import java.util.Scanner;
public class Program4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int[] proarr = new int[n];
        for (int i = 0; i < n; i++) {
            int product = 1;
            for (int j = 0; j < n; j++) {
                if (i != j) {
                    product *= arr[j];
                }
            }
         proarr[i] = product;
        }
        System.out.println("Product array:");
        for (int i = 0; i < n; i++) {
            System.out.print (proarr[i] + " ");
        }
        sc.close();
    }
}
