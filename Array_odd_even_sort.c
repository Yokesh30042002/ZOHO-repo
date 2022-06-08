/*
Input : 9
        1 2 3 4 5 6 7 8 9
Output :
        1 8 3 6 5 4 7 2 9
*/


#include <stdio.h>

void swap(int *a,int *b)
{
    int temp = *a;
    *a = *b;
    *b =temp;
}
void odd(int *a)
{
    printf("%d",a[1]);
}
int main()
{
int a[] = {1,2,3,4,5,6,7,8,9,10};
int size = sizeof(a)/sizeof(a[0]);
for(int i=0;i<size;i++)
{
    if(!(i&1))
    {
        for(int j=0;j<size;j=j+2)
        {
            if(a[i]<a[j])
            swap(&a[i],&a[j]);
        }
    }
    else
    {
        for(int j=1;j<size;j=j+2)
        {
            if(a[i]>a[j])
            swap(&a[i],&a[j]);
        }
    }
}
for(int i=0;i<size;i++)
printf("%d ",a[i]);
}
