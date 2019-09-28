#include<stdio.h>
int main()
{
	int n,c=0 ,f=0,k=0;
    scanf("%d",&n);
	for(int i=1;i<=n;i++)
    {
     for(int j=1;j<=n;j++)
    {
       
       if(i==1&&j==1)
       
  
       {
              printf("%d",i); 
           
       }
       else if(i%2==1&&j==n)
       {
               
              printf("%d",i+1);  
              k=i+1;
       }
       else if(i==k&&i%2==0)
       {
          printf("%d",i+1); 
          k=k+1;
          c=1;
              
       }
       else if(c==1&&j==n-1)
       {
            printf("%d",i); 
       }
       
       else
       {
         printf("%d",i);   
       }
    }
	
	
	 printf("\n");
    }
	
		
	return 0;
}