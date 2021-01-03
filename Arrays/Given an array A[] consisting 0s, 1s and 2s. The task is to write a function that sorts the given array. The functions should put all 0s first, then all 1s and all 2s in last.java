*
Given an array A[] consisting 0s, 1s and 2s. The task is to write a function that sorts the given array. The functions should put all 0s first, then all 1s and all 2s in last.

Given an array of size N containing only 0s, 1s, and 2s; sort the array in ascending order.


Example 1:

Input: 
N = 5
arr[]= {0 2 1 2 0}
Output: 0 0 1 2 2
Explanation: 0s 1s and 2s are segregated 
into ascending order.
 

Example 2:

Input: 
N = 3
arr[] = {0 1 0}
Output: 0 0 1
Explanation: 0s 1s and 2s are segregated 
into ascending order.

Your Task:
You don't need to read input or print anything. Your task is to complete the function sort012() that takes array and n as input parameters and sorts the array in-place. 


Expected Time Complexity: O(n)
Expected Auxiliary Space: O(1)

 
*

// { Driver Code Starts
//Initial template for Java

import java.io.*;
import java.util.*;

class GFG {
    
 // } Driver Code Ends








//User function template for Java

public static void sort012(int arr[], int n){
    // code here
    int a  = 0;
    int aa = 0;
    int b  = 0;
    int bb = 1;
    int c  = 0;
    int cc = 2;
    for(int i = 0; i< arr.length; i++)
    {
        if(arr[i] == 0)
        {
            a++;
        }
        if(arr[i] == 1)
        {
            b++;
        }
        if(arr[i] == 2)
        {
            c++;
        }
    }
    
    int i = 0;
    while(a>0)
    {
        arr[i++] = 0;
        a--;
    }
     while(b>0)
    {
        arr[i++] = 1;
        b--;
    }
     while(c>0)
    {
        arr[i++] = 2;
        c--;
    }
    
   
}



// { Driver Code Starts.

    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
        while(t-->0){
            int n = Integer.parseInt(br.readLine().trim());
            int arr[] = new int[n];
            String inputLine[] = br.readLine().trim().split(" ");
            for(int i=0; i<n; i++){
                arr[i] = Integer.parseInt(inputLine[i]);
            }
            sort012(arr, n);
            StringBuffer str = new StringBuffer();
            for(int i=0; i<n; i++){
                str.append(arr[i]+" ");
            }
            System.out.println(str);
        }
    }
}

  // } Driver Code Ends
