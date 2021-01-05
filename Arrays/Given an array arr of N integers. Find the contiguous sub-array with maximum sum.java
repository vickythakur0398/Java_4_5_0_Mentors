/*
Given an array arr of N integers. Find the contiguous sub-array with maximum sum.
Example 1:

Input:
N = 5
arr[] = {1,2,3,-2,5}
Output: 9
Explanation: Max subarray sum is 9
of elements (1, 2, 3, -2, 5) which 
is a contiguous subarray.
 

Example 2:

Input:
N = 4
arr[] = {-1,-2,-3,-4}
Output: -1
Explanation: Max subarray sum is -1 
of element (-1)
 

Your Task:
You don't need to read input or print anything. The task is to complete the function maxSubarraySum() which takes arr and N as input parameters and returns the sum of subarray with maximum sum.



*/


// { Driver Code Starts
import java.io.*;

class Array {
    
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
		while(t-->0){
		    //size of array
		    int n = Integer.parseInt(br.readLine().trim());
		    int arr[] = new int[n];
		    String inputLine[] = br.readLine().trim().split(" ");
		    
		    //adding elements
		    for(int i=0; i<n; i++){
		        arr[i] = Integer.parseInt(inputLine[i]);
		    }
		    
		    Kadane obj = new Kadane();
		    
		    //calling maxSubarraySum() function
		    System.out.println(obj.maxSubarraySum(arr, n));
		}
	}
}

// } Driver Code Ends


class Kadane{
    
    // Function to find subarray with maximum sum
    // arr: input array
    // n: size of array
    int maxSubarraySum(int arr[], int n){
        
        // Your code here
        int max = 0;
        for(int i = 0; i < arr.length; i++ )
        {
            for(int j = i; j < arr.length; j++)
            {
                int count = 0;
                for(int k = i ; k<= j ; k++)
                {
                    count+= arr[k];
                }
                
                max = Math.max(count, max);
            }
        }
        return max;
        // System.out.println(max);
        
    }
    
}

