import java.util.*;
import java.io.*;
class demo
 {
   public static void main(String args[])throws IOException
    {
    	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    	//int n=Integer.parseInt(br.readLine());
    	//System.out.println(fun(n));
    	String s=br.readLine();
    	System.out.println(fun(s));
    }

static String fun(String s)
   {
	if(s.length()==1)
		return s;
	return fun(s.substring(1,s.length()))+s.charAt(0);
	
   }
}

/* description
Suppose Input: Adam
Function calling--->
             fun("dam")+'A'
             fun("am")+'d'
             fun("m")+'a'
             "m"
 Since it's a recursion function so called function will store in stack memory like this
   |         "m"         |
   |     fun("m")+'a'    |
   |     fun("am")+'d'   |
   |     fun("dam")+'A'  |
   |_____________________|
   
   */

