/*
Cyclically rotate an array by one 
Given an array, cyclically rotate an array by one.

Input:
The first line of input contains an integer T denoting the number of test cases. Then T test cases follow. Each test case contains an integer n denoting the size of the array. Then following line contains 'n' integers forming the array. 

Output:
Output the cyclically rotated array by one.

Constraints:
1<=T<=1000
1<=N<=1000
0<=a[i]<=1000

Example:
Input:
2
5
1 2 3 4 5
8
9 8 7 6 4 2 1 3

Output:
5 1 2 3 4
3 9 8 7 6 4 2 1

*/

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
    static Scanner scn = new Scanner(System.in);
	public static void main (String[] args)
	{
	    int test = scn.nextInt();
	    for(int i = 0; i< test; i++)
	    {
	        int size = scn.nextInt();
	        int arr [] = new int[size];
	        
	        for(int j = 0; j< size; j++)
	        {
	            arr[j] = scn.nextInt();
	            
	           
	        }
	        
	        
	        int arr2 [] = new int [size];
	        
	        int last = arr[arr.length-1];
	        
	        int co = 0;
	        for(int k =1; k< arr.length; k++)
	        {
	            arr2[k] = arr[co++];
	        }
	        
	        
	        arr2[0] = last;
	        
	        
	        for(int m : arr2)
	        {
	            System.out.print(m+ " ");
	        }
	        System.out.println();
	        
	        
	        
	    }
	}
	 
}
