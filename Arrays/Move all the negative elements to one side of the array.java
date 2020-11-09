/*
Move all negative numbers to beginning and positive to end with constant extra space
Last Updated: 07-11-2020
An array contains both positive and negative numbers in random order. Rearrange the array elements so that all negative numbers appear before all positive numbers.
Examples : 

Input: -12, 11, -13, -5, 6, -7, 5, -3, -6
Output: -12 -13 -5 -7 -3 -6 11 6 5


Note: Order of elements is not important here.



*/









import java.io.*;
import java.util.*;

class GFG {
	public static void main (String[] args) 
	{
	    Scanner scn = new Scanner(System.in);
	    int size = scn.nextInt();
		int arr [] = new int[size];
		for(int i =0; i< size; i++)
		{
		    arr[i] = scn.nextInt();
		    
		}
		
		
		int a = 0;
		int b = arr.length-1;
		while(a <=  b)
		{
		    
		   // int fir =  arr[a];
		   // int las = arr[b];
		     
		     if(arr[a] > 0 && arr[b] < 0)
		     {
		        int temp = arr[a];
		        arr[a] = arr[b];
		        arr[b] = temp;
		        
		        a++;
		        b--;
		        
		      //  System.out.println("vicky" + arr[a]);
		        
		     }
		     
		    else if(arr[a] <0 && arr[b] < 0)
		     {
		        a++; 
		        		    //   System.out.println(a+ " 2last");

		     }
		     
		    else if(arr[a] >0 && arr[b] >0)
		     {
		         b--;
		     }
		     
		     else
		     {
		         a++;
		         b--;
		     }
		     
		     
		      //System.out.println(a+ " last");
		     
		     
		}
		
		
		for(int val : arr)
		{
		    System.out.print(val+ " ");
		}
		
		
		
		
	}
}
