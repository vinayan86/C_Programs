#include<stdio.h>
int main()
{
  int m,n=0;
   scanf("%d",&m);

  int k=m/10;
    int l=m%10;
    n=l+k;
  printf("%d",n);
  return 0;
}