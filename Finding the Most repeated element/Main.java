#include<stdio.h>
int main()
{
    
  int i,j,n,k,a[10],temp;
scanf("%d", &n);

  for(int i = 0; i < n; i++)
  {
scanf("%d",&a[i]);
  }
  int c=0,f=0;
for(int i = 0; i < n;i++ )

  {
  c=0;
        for(int j = 0; j < n; j++)
        {
          if(a[i]==a[j])
          c=c+1;
        }
       if(f<c)
       {
         f=c;
         temp=a[i];
       }
  }
  
   
        printf("%d ",temp);
  
    
return 0;
}