#include<stdio.h>
int main()
{
    char a[100];
    int size=0;
    scanf("%s",a);
    while(a[size]!='\0')size++;
    int max=size-1;
    for(int i=0;i<size;i++)
    {
        for(int j=0;j<size;j++)
        {
            if(i==j)
            {
                printf("%c",a[i]);
            }
            else if(j==max)
            {
                printf("%c",a[j]);
            }
            else
            {
                printf(" ");
            }
        }
        max--;
        printf("\n");
    }
}
