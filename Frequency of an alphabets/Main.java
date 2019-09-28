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
  
for (int i = 0; i < n; ++i) 
        {
 
            for (int j = i + 1; j < n; ++j)
            {
 
                if (s[i] > s[j]) 
                {
 
                   int a =  s[i];
                    s[i] = s[j];
                    s[j] = a;
 
                }

            }
           //printf("%c ",s[i]); 
        }
        for (int i = 0; i < n; i++) 
        {
 int f=1,c=1;
 
            for (int j = i+1; j < n; j++)
            {
 
                if (s[i] == s[j]) 
                {
                f=f+1;
                c=0;
                }
                if(c==0)
            {
                s[j]='0';
                c=1;
            }
              
                
            }
            if( (s[i]>='a' && s[i]<='z') || (s[i]>='A' && s[i]<='Z'))
               printf("%c%d ",s[i],f); 
               
        }
        
   return 0;
}