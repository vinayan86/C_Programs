#include<stdio.h>
#include<string.h>
 #define MAX_SIZE 100 
void lowet(char st[],int l)
{
  for (int i = 0; i < l;i++)
    {
  
   if (st[i] >= 'A' && st[i] <= 'Z') {
         st[i] = st[i] + 32;
         
      }
       
   }
}

int main()
{
  char st1[100], st2[100];
int count = 0, count1 = 0;
    int i, j, l, l1, l2;
 

   fgets(st1, MAX_SIZE, stdin); 
  
   fgets(st2, MAX_SIZE, stdin); 

    //gets(st2);
    l1 = strlen(st1);
    l2 = strlen(st2);
  lowet(st1,l1);
   lowet(st2,l2);
   
    for (i = 0; i < l1;)
    {
        j = 0;
        count = 0;
      
        while (st1[i] == st2[j] )
        {
            count++;
            i++;
            j++;
        }
        if (count == l2)
        {
            count1++;                                   
            count = 0;
        }
        else
            i++;
    }    
    printf("%d",count1);
  return 0;
}
