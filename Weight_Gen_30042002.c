#include<stdio.h>
int even(int n)
{
    return n%2==0?3:0;
}
int div(int n)
{
    return n%4==0&&n%6==0?4:0;
}
int perfect(int n)
{
    for(int i = 0; i <= n; i++)
    {
        if(n == i*i)
        {
            return 5;
        }
    }
    return 0;
}
void swap(int *a,int *b)
{
    int temp =*a;
    *a = *b;
    *b = temp;
}
int main()
{
int n;
scanf("%d",&n);
int a[n][n];
for(int i=0;i<n;i++)
{
scanf("%d",&a[0][i]);
a[1][i]=0;
}
int count;
for(int i=0;i<n;i++)
{
    count = even(a[0][i])+div(a[0][i])+perfect(a[0][i]);
    a[1][i] = count;
}
for(int i=0;i<n;i++)
{
    for(int j=0;j<n;j++)
    {
    if(a[1][i]<a[1][j])
    {
        swap(&a[1][i],&a[1][j]);
        swap(&a[0][i],&a[0][j]);
    }
    }
}
for(int i=0;i<n;i++)
{
printf("< %d , %d > \n",a[0][i],a[1][i]);
}
return 0;
}
