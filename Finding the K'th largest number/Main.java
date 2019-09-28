#include<stdio.h>
int main()
{
    
  int n,k,a[10];
scanf("%d", &n);
  for(int i = 0; i < n; i++)
  {
scanf("%d",&a[i]);
  }
  scanf("%d", &k);
 
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
  
  printf("%d",a[n-k]);

return 0;
}