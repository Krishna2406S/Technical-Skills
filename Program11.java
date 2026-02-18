/* Wap to read and print a user defined matrix and print sum of column elements.

Algorithms:
1. Start
2. Read number of rows and columns from user.
3. create matrix using new int[rows][columns]
4. Read elements of matrix from user using nested loop.
5. Print the matrix using nested loop.
6. Calculate sum of each column elements and print it separately.
7. Stop

 */
import java.util.Scanner;

public class Program11 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter the number of columns: ");
        int columns = sc.nextInt();

        int[][] matrix = new int[rows][columns];

        System.out.println("Enter matrix elements: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("The matrix is:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        
        System.out.println("Sum of column elements:");
        for (int j = 0; j < columns; j++) {
            int sumcolumn = 0;   // reset for each column

            for (int i = 0; i < rows; i++) {
                sumcolumn += matrix[i][j];
            }

            System.out.println("Column " + (j + 1) + " sum = " + sumcolumn);
        }

        sc.close();
    }
}
