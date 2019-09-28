#include <stdio.h>
int mpow(int p, int q)
{
  int k=1;
 for(int i=1;i<=q;i++)
 {
   k=k*p;
 }
  return k;
}
int  main()
{
  int a , b ;
  scanf("%d%d",&a,&b);
  
 int s= mpow(a, b);
  printf("%d",s);
}