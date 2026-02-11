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
        int i, max, secondMax;
        Scanner sc =new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n=sc.nextInt();

        int[] arr=new int[n];
        System.out.println("Enter "+n+" elements:");
        for(i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }    
        
        
    }
}