#include<stdio.h>

 void large(int a[],int s)
 {
     int i, m = 0, n = 0;
     
     for( i = 0; i < s/2 ; i++)
     { 
       m = m + a[i];
      
     }  
    
     for( i = s/2; i < s ; i++)
     { 
       n = n + a[i];
      
     }  
     
     if(m == n)
     {
         printf("Perfect Batch" );
   
     }
     else
     {
         printf("Not a Perfect Batch");
     }
 }

int main() {
   int s,a[10],i;
   
   scanf("%d",&s);

   for( i = 0; i < s ; i++)
   {
       scanf("%d",&a[i]);
   }
  
   large(a,s);
  
   return 0;  
}

