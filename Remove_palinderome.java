/*Remove palindrome words
               
               string should contains only the words are not palindrome
               Sample Input Sample Output
               Input Format
                     Input is a string  : Malayalam is my mother tongue 
               Output Format
                     is my mother tongue
Print the altered string*/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String[] str = s.split(" ",5);
		for(String a: str)
		{
		    if(!isPal(a))
		    System.out.print(a+" ");
		}
	}
	public static boolean isPal(String a)
	{
	    int i = 0;
	    int j = a.length()-1;
	    a = a.toLowerCase();
	    while(i<j)
	    {
	        if((a.charAt(i++)!=a.charAt(j--)))
	        {
	            return false;
	        }
	    }
	    return true;
	}
}
