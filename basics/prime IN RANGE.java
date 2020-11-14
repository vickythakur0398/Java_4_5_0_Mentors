import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
	public static void main (String[] args)
	{
	    Scanner scn = new Scanner(System.in);
	    
	    int test = scn.nextInt();
	      for(int x = 0; x< test ; x++)
	  {
	  
	    int a = scn.nextInt();
	    int b = scn.nextInt();
	    
	    for(int i= a ; i<= b; i++)
	    {
	        boolean res = isPrime(i);
	        if(res == true)
	        {
	            System.out.print(i+ " "  );
	        }
	    }
	    System.out.println();
	    
	    
	 }   // check a no. is prime or not
	    // check if a no. is 
	}
	
	public static boolean isPrime(int N)
	{
	    if(N == 1)
	    {
	        return false;
	    }
	    
	    for(int i = 2; i<= Math.sqrt(N) ; i++)
	    {
	        if(N % i==0)
	        {
	            return false;
	        }
	    }
	    
	    return true;
	    
	}
	
	
	 
}
