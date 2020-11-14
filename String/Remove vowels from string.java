/*
Given a string, remove the vowels from the string.

Example 1:

Input: S = "welcome to geeksforgeeks"
Output: wlcm t gksfrgks
Explanation: Ignore vowels and print other
characters 
Example 2:

Input: S = "what is your name ?"
Output: wht s yr nm ?
Explanation: Ignore vowels and print other
characters 
Your task:
Your task is to complete the function removeVowels() which takes a single string as input and returns the modified string. You need not take any input or print anything.


*/

// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String s = read.readLine();
            
            Solution ob = new Solution();
            String result = ob.removeVowels(s);
            
            System.out.println(result);
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution {
    String removeVowels(String S) {
        // code here
        String str = "";
        for(int i =0; i< S.length(); i++)
        {
            if(S.charAt(i) != 'a' && S.charAt(i) != 'e' && S.charAt(i) != 'i'  && S.charAt(i) != 'o' && S.charAt(i) != 'u')
            {
                str = str + S.charAt(i);
            }
        }
        
            return str;
    }
}
