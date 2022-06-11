/*
First maximum and First minimum and so on
Given an array and arrange it with  rst maximum and  rst minimum and second maximum and second minimum and so on without using sorting and second array
        Input Format
                Input will have size and the values
                
       Output Format
                Print the required output
       Constraints
                1<=size<=1000
Sample Input
15
5 15 10 25 55 35 75 45 95 50 70 40 60 90 3
Sample Output
95 3 90 5 75 10 70 15 60 25 55 35 50 40 45*/


import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
		ArrayList<Integer> a = new ArrayList<Integer>();
		for(int i=0;i<n;i++)
		a.add(sc.nextInt());
		int or_size=a.size();
		for(int i=0;i<or_size;i++)
		{
		    if(i%2==0)
		    {
		        System.out.print(Collections.max(a)+" ");
		        a.remove(a.indexOf(Collections.max(a)));
		    }
		    else
		    {
		        System.out.print(Collections.min(a)+" ");
		        a.remove(a.indexOf(Collections.min(a)));
		    }
		}
	}
}



