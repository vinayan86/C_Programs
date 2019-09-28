#include<stdio.h>
int fac(int n)
{
  if(n==1)
    return ;
  else
    return (n*fac(n-1));
}
int main()
{
int n;
  scanf("%d",&n);
int f=fac(n);
  printf("%d",f);
 
}