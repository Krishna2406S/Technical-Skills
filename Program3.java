/*Question: Given an integer array A of size N, 
in one second you can increase the value of any element by 1.
Find the minimum time in seconds to make all elements of the array equal.

Eg.: A=[2, 4, 1, 3] 
-> Output: 6

steps:
1. find max element in the array
2. for every element , calculate how much it needs to be increase to reach the maximum.
3. sum of all those difference.

time=0
time=time+(max+arr[i])
 */
import java.util.Scanner;
public class Program3{
    public static void main(String[] args) {
        int max=0;
        int time=0;
        Scanner sc =new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter "+n+" elements:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            if(arr[i]>max){
                max=arr[i];
            }
        }
        for (int i=0;i<n;i++){
            time=time+(max - arr[i]);
        }
        System.out.println("Minimum time required: "+time);
        sc.close();
    }
}