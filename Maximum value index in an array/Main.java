#include<stdio.h>
int main()
{
int s;
  scanf("%d",&s);
  int a[s],m,n,k,l=0;
  for(int i=0;i<s;i++)
  {
    scanf("%d",&a[i]);
 
  }
 l=a[0];
    for(int i=0;i<s;i++)
  {
if(a[i]>l)  
{
  l=i;
}
    }   
  printf("%d",l);

   
  return 0;
}