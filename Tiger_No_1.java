/*https://youtu.be/0Y0Ocxf8FuI*/

import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{
	    //int[] a = {1,-1,3,7,8,0,2,5,6};
	    //int[] a = {3,7,-1,8,9,10};
	    //int[] a = {2, 3, 7,1, 6, 8, -1, -10, 15};
	    int[] a = {2, 3, 7,1, 6, 8, -1, -10,-19,-30,23,9,15};
	    int n = a.length;
	    Arrays.sort(a);
	    System.out.println(Arrays.toString(a));
	    int i=0;
	    while(i<n)
	    {
	        int diff = a[i+1]-a[i];
	        boolean cond = a[i]>0 && a[i+1]>0; 
	        if(diff==1)
	        {
	            i++;
	           continue;
	        }
	        else if(cond)
	        {
	            System.out.println(a[i]+1);
	            break;
	        }
	        else
	        {
	            i++;
	        }
	    }
	}
}

