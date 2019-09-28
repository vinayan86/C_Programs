#include<stdio.h>



int main() {
   int s,a[10],i,k;
   
   scanf("%d",&s);
   
   
   for( i = 0; i < s ; i++)
   {
       scanf("%d",&a[i]);
   }
   
   
   scanf("%d",&k);
  
rot(a,s,k);
  
   return 0;  
}

 void rot(int a[],int s,int k)
 {
     int i , j ;
     int odd,even,oddt,event;
     if(s%2 == 0)
     {
        odd=s-2;
     
     }
     else
     {
            odd=s-1; 
     }
      if(s%2 == 0)
     {
        even= s-1;
     
     }
     else
     {
            even=s-2; 
     }
    
     

    //To Roate right and Left
    
    for( i = 0 ; i < k ; i++)
    {
        
        //for right rotation
        oddt = a[odd];
        for( j = odd; j >= 0 ; j=j-2)
        {
            
            a[j]=a[j-2];
        }
        
        a[0] = oddt;
        
        //for left rotation
        
        event = a[1];
        
        for( j = 1; j < s ; j = j+2)
        {
            
            a[j] = a[j+2]; 
        }
        
        a[even] = event;
        
    }
    
    for( i = 0 ; i < s ; i++ )
    {
        printf( "%d ", a[i]);
    }
  
 }