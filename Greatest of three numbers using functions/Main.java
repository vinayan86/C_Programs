#include <stdio.h>
int largest(int p, int q,int r)
{
  if(p>q)
  {
    if(p>r)
    {
      printf("%d",p);
    }
  }
  else if(q>r)
  {
    printf("%d",q);
  }
  else
  {
    printf("%d",r);
  }
    
}
int  main()
{
  int a, b,c ;
  scanf("%d%d%d",&a,&b,&c);
  
 largest(a, b,c);
  
}