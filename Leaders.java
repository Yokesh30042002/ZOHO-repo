/*
Input: n = 6
A[] = {16,17,4,3,5,2}
Output: 17 5 2
Explanation: The first leader is 17 
as it is greater than all the elements
to its right.  Similarly, the next 
leader is 5. The right most element 
is always a leader so it is also 
included.

Example 2:
Input:
n = 5
A[] = {1,2,3,4,0}
Output: 4 0
*/


import java.util.*;
public class Main
{
	public static void main(String[] args) {
		int[] arr = {16,17,4,3,5,2};
		int n = 6;
		ArrayList<Integer> Result = new ArrayList<Integer>();
        for(int i=0;i<n;i++)
        {
        boolean flag = true;
         for(int j=i;j<n;j++)
         {
          if(arr[i]<arr[j])
          {
              flag=false;
              break;
          }
         }
            if(flag)
            {
                Result.add(arr[i]);
            }
        }
        System.out.println(Result);
	}
}
