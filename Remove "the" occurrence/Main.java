#include<stdio.h>
#include<string.h>

int main()
{
 int i,j;
 char str[100],t[100];
  int c=0,b=0;
 scanf("%[^\n]s", str);
 int n = strlen(str);
 for(i=0;i<n;i++)
 {
   if(str[i]>='A'&&str[i]<='Z')
     str[i]=str[i]+32;
 }
 for(i=0;i<n;i++)
 {

   if(str[i]=='t'&&str[i+1]=='h'&&str[i+2]=='e')
   {
    
    i=i+3;
   }
     
     else
     {
     t[c]=str[i];
     c++;
     }

 
 }
 t[c]='\0';
  for(int k=0;t[k]!='\0';k++)
   printf("%c",t[k]);
}




