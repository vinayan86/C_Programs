#include <stdio.h>
#include <string.h>
#include<stdlib.h>
int main()
{
  char s[100],t[10],u[10],temp[10][10];
  int i=0,j=0,k=0,c,p;
      scanf("%[^\n]s",s);
      scanf("%s",t);
      scanf("%s",u);
      p=strlen(s);
   while(i<p)
      {
        if (s[i]!=' ')
        {
          temp[k][j] = s[i];
          j++;
        }
        else
        {
          temp[k][j]='\0';
          j=0; k++;
        }
        i++;
      }
  temp[k][j]='\0';
  c=k;
  for (i=0; i<=c; i++)
  {
    if(strcmp(temp[i],t)==0)
      strcpy(temp[i],u);
    printf("%s ",temp[i]);
  }
  return 0;
}