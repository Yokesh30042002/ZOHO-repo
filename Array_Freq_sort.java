/*Frequency Sorting
  Given an array of integers arrange them in the descending order of their frequencies
  Sample Input
              11
              1 2 3 1 1 1 3 2 4 4 2
  Sample Output
              1 1 1 1 2 2 2 3 3 4 4*/







import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
        //int a[] = {2,2,2,3,3,4,4,1,1,1,1};
        //int a[] = {9,9,9,9,1,2,5,2,5,6,7,8,5};
        //int a[] = { 1, 2, 3, 34, 34, 2, 1, 34, 1, 1, 1 };
        int a[] = { 2, 2, 2, 2, 5, 5, 5, 5, 5, 5, 67, 67, 67, 67, 67};
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i=0;i<a.length;i++)
        {
            if(!map.containsKey(a[i]))
            {
                map.put(a[i],freq(a,a[i]));
            }
        }
        int n=map.size();int j=0;
        int[][] k = new int[2][n];
        for(Map.Entry<Integer,Integer> e:map.entrySet())
        {
            k[0][j] = e.getKey();
            k[1][j++]=e.getValue();
        }
        frq_sort(k,n);
        print_arr(k,n);
        }
    public static void frq_sort(int[][] k,int n)
    {
        for(int i=0;i<n;i++)
        {
        for(int s=0;s<n;s++)
        {
            if(k[1][i]>k[1][s])
            {
                int temp1 = k[1][i];k[1][i] = k[1][s];k[1][s] = temp1;
                int temp2 = k[0][i];k[0][i] = k[0][s];k[0][s] =temp2;
            }
        }
        }
    }
    public static int freq(int[] a,int key)
    {
        int count = 0;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]==key)
            {
                count++;
            }
        }
        return count;
    }
    public static void print_arr(int[][] k,int n)
    {
        for(int s=0;s<n;s++)
        for(int j=0;j<k[1][s];j++)
        System.out.print(k[0][s]+" ");
    }
}
