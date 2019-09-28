#include<stdio.h>
int main()
{
    
  int i,j,n,k,a[10];
scanf("%d", &n);
   scanf("%d", &k);
  for(int i = 0; i < n; i++)
  {
scanf("%d",&a[i]);
  }
 
 
    for(int i = 0; i < n; i++)
  {
        for(int j = i+1; j < n; j++)
  {
if(a[i]>a[j])
{
    int l=a[j];
    a[j]=a[i];
  a[i]=l;
  }
  
  }
  }
  int c=0,f=1;
for(int i = 1; i <= k;i++ )

  {
        for(int j = 0; j < n; j++)
        {
          if(i==a[j])
          c=c+1;
        }
         printf("%d %d\n",i,c);
  c=0;
  }

    
return 0;
}