/*
Check if a number is a power of another number
Given two positive numbers x and y, check if x is a power of y or not.
Examples :
Input: x = 100, y = 5
Output: True
*/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		if(Powerof(x,y))
		{
		    System.out.print("TRUE");
		}
		else
		{
		    System.out.print("FALSE");    
		}
	}
	public static boolean Powerof(int x,int y)
	{
	    int pro = 1;
	    while(pro!=x&&pro<x)
	    {
	        pro=pro*y;
	        if(pro==x)
	        return true;
	    }
	    return false;
	}
}
