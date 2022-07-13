import java.util.*;

public class Main
{
	public static void main(String[] args) 
	{
    int a[][] = {{1,2},{1,2},{1,2}};
    int b[][] = {{1,1,2},{1,1,1}};
    int row_a = a.length;
    int col_a = a[0].length;
    int row_b = b.length;
    int col_b = b[0].length;
    int cont = 0,i=0,j=0;
    int add_i = 0,add_j =0;
    boolean thresh = true;
    int sum = 0;
    int[][] res= new int[row_a][col_b];
    System.out.println("Col:"+col_b+"row:"+row_a);
    while(thresh)
    {
    if(i == row_a)
    {
        thresh=false;
    }
    else if(cont == row_b)
    {
        j++;
        res[add_i][add_j] = sum;
        add_j++;
        cont = 0;
        sum = 0;
    }
    else if(j == col_b)
    {
        i++;
        j=0;
        add_i++;
        add_j=0;
    }
    else
    {
        sum = sum + (a[i][cont]*b[cont][j]);
        cont++;
    }
	}
	for(int s=0;s<3;s++)
	{
	    for(int n=0;n<3;n++)
	    {
	        System.out.print(res[s][n]+" ");
	    }
	    System.out.println();
	}
	}
}
