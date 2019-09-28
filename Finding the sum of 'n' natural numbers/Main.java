#include<stdio.h>
int sumn(int n)
{
  if(n==1)
    return ;
  else
    return (n+sumn(n-1));
}
int main()
{
int n;
  scanf("%d",&n);
int f=sumn(n);
  printf("%d",f);
 
}