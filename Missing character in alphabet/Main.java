// INCLUDE HEADER FILES NEEDED BY YOUR PROGRAM
// SOME LIBRARY FUNCTIONALITY MAY BE RESTRICTED
// DEFINE ANY FUNCTION NEEDED
// FUNCTION SIGNATURE BEGINS, THIS FUNCTION IS REQUIRED
#include <stdio.h>
#include <string.h>
// Main function
int main()
{
  char s[100],gh[100];
  int n,i,k,j;
scanf("%[^\n]s",s);
  n=strlen(s);
 for(i=0; i<26; i++)
    {
        gh[i] = 'a'+i;
    }

    gh[i]='\0';
  
for (int i = 0; i < 26; ++i) 
        {
 for (int j = 0; j < n; ++j) 
        {
      if(gh[i]==s[j])
      {
          gh[i]='0';
      }
     
           
        }
                   
        }
        for (int i = 0; i < 26; ++i) 
        {
            if(gh[i]!='0')
            printf("%c ",gh[i]); 
        }
   return 0;
}