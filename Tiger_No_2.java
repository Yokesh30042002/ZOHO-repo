import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{
	    //int[] a = {1,2,3,4,6,7,10};
	    //int[] a = {1,-2,2,3,4,6,7,10};
	    //int[] a = {1,2,3,4,6,7,10};
	    int[] a = {6,7,10,11,13};
	    int i = 0;
	    ArrayList<Integer> result = new ArrayList<Integer>();
	    int n = a.length;
	    Arrays.sort(a);
	    while(i<n-1)
	    {
	        int diff = a[i+1]-a[i];
	        if(diff==1)
	        {
	            i++;
	            continue;
	        }
	        else if(diff>=2)
	        {
	            for(int j=1;j<diff;j++)
	            {
	                result.add(a[i]+j);
	            }
	        }
	        i++;
	    }
	    System.out.println(result);
	}
}
