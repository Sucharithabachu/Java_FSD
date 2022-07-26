package Handson;
import java.util.Scanner;
public class LongestIncreasingSubsequence {
    
    public int[] lis(int[] X)
    {        
        int n = X.length - 1;
        int[] M = new int[n + 1];  
        int[] P = new int[n + 1]; 
        int L = 0;
 
        for (int i = 1; i < n + 1; i++)
        {
            int j = 0;
 
            //Linear search applied here. 
                
 
            for (int position = L ; position >= 1; position--)
            {
                if (X[M[position]] < X[i])
                {
                    j = position;
                    break;
                }
            }            
            P[i] = M[j];
            if (j == L || X[i] < X[M[j + 1]])
            {
                M[j + 1] = i;
                L = Math.max(L,j + 1);
            }
        }
 
        int[] result = new int[L];
        int pos = M[L];
        for (int i = L - 1; i >= 0; i--)
        {
            result[i] = X[pos];
            pos = P[pos];
        }
        return result;             
    }
 
   //To get input from the user
    public static void main(String[] args) 
    {    
        Scanner sc = new Scanner(System.in);
       
        //Getting length of array from user
        System.out.println("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n + 1];
        //Enter the elements
        System.out.println("\n Enter the "+ n +" elements: ");
        for (int i = 1; i <= n; i++)
            arr[i] = sc.nextInt();
 
        LongestIncreasingSubsequence obj = new LongestIncreasingSubsequence(); 
        int[] result = obj.lis(arr);      
        //Displaying Result
        System.out.print("\nLongest Increasing Subsequence of the given random numbers: \n ");
        for (int i = 0; i < result.length; i++)
            System.out.print(result[i] +" ");
        System.out.println();
    }
}
