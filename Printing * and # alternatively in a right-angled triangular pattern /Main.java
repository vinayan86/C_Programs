#include<stdio.h>
int main()
{
 int n,f=1;
  scanf("%d",&n);
 
for(int cur_row =1; cur_row <= n; cur_row++) 
      {
      
       
     for(int cur_col=1; cur_col <= cur_row ; cur_col++) 
 {
             
           if(f==1)
           {
               printf("*");
               f=0;
           }
           else
           {
               printf("#");
               f=1;
           }
 }
 
    
 
     printf("\n");
   }
return 0;
}