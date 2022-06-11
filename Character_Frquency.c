/*   Write a program that takes in the following input to give the corresponding output 
     
     input : a1b2c3
     output : abbccc
     
     input : d2f4c6
     output : ddffffcccccc
     
     
*/

#include <stdio.h>
#define NUM(a) ((a>=48)&&(a<=57))
#include<string.h>

int main()
{
    char s[50] = "abc150b60c352";
    char cp[15];
    int num=0;
    int flag=0;
    for(int i=0;s[i];i++)
    {
        if(!NUM(s[i]))
        {
            cp[flag]=s[i];
            flag++;
            continue;
        }
        else
        {
            do
            {
                int temp = s[i] - '0';
                num = (num*10)+temp;
                i=i+1;
            }while(NUM(s[i]));
            i = i-1;
                for(int j=0;j<num;j++)
                printf("%s",cp);
            flag=0;
        }
        num=0;
    }
    return 0;
}
