/*Ques:
You are given an integer array A;
you have to find second largest element in the array A or report that no such element exists.
eg:
arr=[10,20,30,40,50]
result--> 40
*/

import java.util.Scanner;

public class Program6{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] a = new int[n];

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        if (n < 2) {
            System.out.println("Second largest element not possible.");
            return;
        }

        int largest, secondLargest;
        if (a[0] > a[1]) {
            largest = a[0];
            secondLargest = a[1];
        } else {
            largest = a[1];
            secondLargest = a[0];
        }
        for (int i = 2; i < n; i++) {

            if (a[i] > largest) {
                secondLargest = largest;
                largest = a[i];
            }
            else if (a[i] > secondLargest && a[i] != largest) {
                secondLargest = a[i];
            }
        }

        System.out.println("Second largest number is: " + secondLargest);

        sc.close();
    }
}
