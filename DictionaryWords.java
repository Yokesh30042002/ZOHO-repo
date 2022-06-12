/*

*/
import java.util.*;
public class Main
{
    
	public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	 ArrayList<String> Dict = new ArrayList<String>();
	 int n =sc.nextInt();
	 for(int i=0;i<n;i++)
	 {
	     String s = sc.next();
	     if(!Dict.contains(s))
	     Dict.add(s);
	 }
	 Collections.sort(Dict);
	 for(int i=0;i<Dict.size();i++)
	 {
	     for(int j=0;j<Dict.size();j++)
	     {
	         String l = Dict.get(i)+Dict.get(j);
	         if(Dict.contains(l))
	         {
	             Dict.remove(i);
	             Dict.remove(j);
	         }
	     }
	 }
	 print_arr(Dict);
	}
	public static void print_arr(ArrayList<String> Dict)
	{
	 Scanner sc = new Scanner(System.in);
	 String st = sc.next();
	 System.out.println(Dict);
	 ArrayList<String> Str = new ArrayList<String>();
	 for(int i=st.length()-1;i>=0;i--)
	 {
	     String c = "";
	     int t = i;
	     while(!Dict.contains(c)&&t<st.length())
	     {
	         c=st.charAt(t)+c;
	         t--;
	     }
	     Str.add(c);
	     i=t+1;
	 }
	 for(int i=Str.size()-1;i>=0;i--)
	 System.out.print(Str.get(i)+" ");
	}
}
