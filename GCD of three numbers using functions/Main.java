#include <stdio.h>
int gcd(int p,int q,int r)
{
  int m,g;
  if(p<q)
    m=p;
  else
    m=q;
  while(m>=1)
  {
    if(p%m==0&&q%m==0)
    {
      g=m;
      break;
      
    }
    m--;
}
  printf("%d",g);
}
int main() {
int a, b,c ;
  scanf("%d%d%d",&a,&b,&c);
  
 gcd(a,b,c);
  
	return 0;
}