/*Ques.:
Given an array elements, 
check if there exists a pair (i,j) such that A[i] + A[j] = k, and i!= j,
note: i and j are indices of the array and k is the given sum.
Eg.:,
Arr=[3,-2,1,4,3,6,8]; k=10
i=3 and j=5
A[i]+A[j]=4+6=10
 */
import java.util.Scanner;
public class Program5{
    public static void main(String[] args) {
        int i , j, k;
        boolean exists=false;
        Scanner sc =new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n=sc.nextInt();

        int[] arr=new int[n];
        System.out.println("Enter "+n+" elements:");
        for(i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }    
        System.out.print("Enter the sum k: ");
        k=sc.nextInt();

        for (i=0;i<=n-1;i++){
            for (j=i+1;j<=n-1;j++){
                if(i!=j && arr[i]+arr[j]==k){
                    System.out.println("Yes, a pair exists whose sum is "+k);
                    return;
                }
            }
        }
        System.out.println("No, a pair does not exist whose sum is "+k); 
    }
}