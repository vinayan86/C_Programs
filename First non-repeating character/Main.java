#include<stdio.h>
#include<string.h>

int main()
{
 int i,j;
 char str[100];
  int c=0,b=1;
 scanf("%[^\n]s", str);
 int n = strlen(str);
 for(i=0;i<n;i++)
 {
   c=0;
    for(j=0;j<n;j++)
     {
       if(str[i]==str[j])
       {
         c++;
        
       }
     }
     
   if(c==1)
   {
     b=0;
   printf("%c",str[i]);
     break;
   }
 }
  if(b==1)
     printf("All the characters are repetitive");
}