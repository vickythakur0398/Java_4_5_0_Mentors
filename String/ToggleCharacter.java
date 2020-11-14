import java.util.*;
import java.io.*;

class toogle
	{
		public static void main(String args [])
		
		{
			Scanner scn = new Scanner(System.in);
			String str = scn.nextLine();
			System.out.println(togg(str));
		}

		public static String togg(String S)
		
		{
			StringBuilder sb = new StringBuilder(S);
			for(int i = 0; i< sb.length(); i++)
				{
					char ch = sb.charAt(i);
					if(ch >= 'a' && ch <= 'z')
					{
						char upc = (char)('A' + ch - 'a');
						sb.setCharAt(i , upc);
					}
					else if(ch >= 'A' && ch <= 'Z')	
					{
						char lc = (char)('a' + ch - 'A');
						sb.setCharAt(i, lc);
					}
				}

			return sb.toString();	
		}
	}
	
