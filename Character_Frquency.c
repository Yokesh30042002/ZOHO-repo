/*   Write a program that takes in the following input to give the corresponding output 
     
     input : a1b2c3
     output : abbccc
     
     input : d2f4c6
     output : ddffffcccccc
     
     
*/

#include<stdio.h>
int main()
{
//char a[100] = "a1b2c3";
char a[100] = "d2f4c6";
for(int i=0;a[i];i=i+2)
{
   for(int j=0;j<a[i+1]-'0';j++)
   {
       printf("%c",a[i]);
   }
}
return 0;
}
