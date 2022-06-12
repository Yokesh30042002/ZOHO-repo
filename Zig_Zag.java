/*
SNAKE PATTERN( DONT use MATRIX)
Input Format
N = 5
output Format
     1 2 3 4 5
    10 9 8 7 6
   11 12 13 14 15
  20 19 18 17 16
 21 22 23 24 25

*/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		int n=5;
		int count=1;
		int k,j,i;
		for(i=0;i<n;i++,System.out.println())
		{
		    for(j=0;j<(n-i);j++)
		    {
		        System.out.print("  ");
		    }
	        if(i%2==0)
	        {
	        for(k=0;k<n;k++,count++)
	        {
	            System.out.print(count+"  ");
	        }
	        count--;
	        }
	        else
	        {
	        for(k=0;k<n;k++,count--)
	        {
	            System.out.print(count+"  ");
	        }
	        count++;
	        }
	        count=count+n;
		}
	}
}
