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
        int a[] = {1,2,5,2,5,6,7,8,5};
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i=0;i<a.length;i++)
        {
            if(!map.containsKey(a[i]))
            {
                map.put(a[i],freq(a,a[i]));
            }
        }
        for(Map.Entry<Integer,Integer> e:map.entrySet())
        {
            for(int i=0;i<e.getValue();i++)
            {
                System.out.print(e.getKey()+" ");
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
}
