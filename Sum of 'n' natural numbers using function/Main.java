#include<stdio.h>
int squares(int a)
{
  int s=0;
 for(int i=1;i<=a;i++)
 {
   s=s+i;
 }
  return s;
}
int main() {
int n ;
  scanf("%d",&n);
  int f=squares(n);
  printf("%d",f);
   return 0;
}