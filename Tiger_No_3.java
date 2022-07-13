import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{
	    String s = "Hello this is Hemanth from America.";
	    int n = s.length();
	    int i=0;
	    int j;
	    System.out.print(n+" / ");
	    String max="";
	    while(i<n-1)
	    {
	        String c = "";
	        if((int)s.charAt(i)==32)
	        {
	            i++;
	        }
	        else
	        {
	        for(j=i;(int)s.charAt(j)!=32&&j<(n-1);j++)
	        {
	            c = c+s.charAt(j);
	        }
	        if(max.length()<(j-i))
	        {
	            max=c;
	        }
	        i=j;
	        }
	    }System.out.print(max+" ");
	}
}
