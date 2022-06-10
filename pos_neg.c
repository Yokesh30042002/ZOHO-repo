/*Input: [2,1,0,-8,-9]
Output: 0.4 , 0.2 , 0.4
Explanation:

First, find the total number of elements in the array = 5
Find the total number of positive numbers=2
Find the total number of neutral numbers=1
(0 is the only neutral number)
Find the total number of negative numbers=2
Output = [ (no of positive number/length of array), (no of neutral numbers/length of array), (no of negative numbers/length of array) ]=[⅖, ⅕, ⅖]=[0.4, 0.2, 0.4]*/

#include<stdio.h>
int main()
{
    //int a[] = {2,1,0,-8,-9};
    int a[] = {1,2,4,-8,-1,0};
    int size = sizeof(a)/sizeof(a[0]);
    int pos=0,neg=0,neu=0;
    
    for(int i=0;i<size;i++)
    {
        if(a[i]>0)
        {
            pos+=1;
        }
        else if(a[i]<0)
        {
            neg+=1;
        }
        else
        {
            neu+=1;
        }
    
    }
    printf("%.1f,%.1f,%.1f",(float) pos/size,(float) neu/size,(float) neg/size);
    return 0;
}
