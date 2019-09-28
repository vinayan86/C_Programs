#include<stdio.h>
int main()
{
  int n;
   scanf("%d",&n);
  int s=n/100;
  int s2=n%10;
  int sum=s+s2;
  printf("%d",sum);
  return 0;
}