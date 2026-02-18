/*Ques.:
wap to find sum of frame elements of a matrix.

Algorithms:
1. Start
2. Read number of rows and columns from user.
3. create matrix using new int[rows][columns]
4. Read elements of matrix from user using nested loop.
5. Use nested loop to find sum of frame elements of matrix.
6. Print the sum of frame elements.
7. Stop

 */
import java.util.Scanner;
public class Program13 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter the number of columns: ");
        int columns = sc.nextInt();

        int [][] matrix = new int[rows][columns];
        System.out.println("Enter matrix elements: ");
        for (int i = 0; i < rows; i++){
            for (int j=0; j < columns; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        int sum=0;

        for (int i = 0; i < rows; i++){
            for (int j=0; j < columns; j++){
                if (i==0 || i==rows-1 || j==0 || j==columns-1){
                    sum+=matrix[i][j];
                }
            }
        }
        System.out.println("the sum of frame elements is:"+sum);
        sc.close();
    }
}
