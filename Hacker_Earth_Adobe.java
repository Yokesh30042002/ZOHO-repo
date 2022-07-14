import java.util.*;
public class Main
{
		public static void main(String args[] ) throws Exception {
      Scanner sc = new Scanner(System.in);
      String S = sc.next();
      String P = sc.next();
      ArrayList<Integer> result = new ArrayList<Integer>();
      int i=0;
      int word_len = S.length();
      int sub_len = P.length();
      int n=word_len-sub_len;
      while(i<=n)
      {
          String c = "";
          for(int j=i;j<(i+sub_len);j++)
          {
          c=c+S.charAt(j);
          }
          char[] g = c.toCharArray();
          Arrays.sort(g);
          c="";
          for(int k=0;k<g.length;k++)
          {
              c=c+g[k];
          }
          if(c.equals(P))
          {
              result.add(i);
          }
          i++;
      }
      System.out.println(result);
    }
}
