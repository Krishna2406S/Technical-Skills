/* Ques.: Equilibrium index
--> Given N array elements, count the number of equilibrium index.
An index is said to be an equilibrium index 
if the sum of elements at lower indexes is equal to the sum of elements at higher indexes.


algo:
1. Read the array and find it's length n.
2. Create a prefix sum array and the cumulative sum of the array.
3. initialise count=0
4. calculate the sum of left sum(ls)
if i = =0 then ls=0
else ls=pf[i-1]
5. calculate the sum of right sum(rs)
rs=pf[n-1]-pf[i]
6. compare 
if ls==rs then count++
*/

//Code:
import java.util.Scanner;
public class Program2{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int count=0,ls,rs,i;

        System.out.print("Enter the size of the array: ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter "+n+" elements:");

        for(i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int [] pf = new int[n];
        pf[0]=arr[0];
        for (i=1; i<n;i++){
            pf[i]=arr[i]+pf[i-1];
        }
        for (i=0;i<n;i++){
            if(i==0){
                ls=0;

            }
            else{
                ls=pf[i-1];
            }
            rs=pf[n-1]-pf[i];
            if(ls==rs){
                count++;
            }
        }
        
        System.out.println("Count of equilibrium index: "+count);
        sc.close();

    }
}