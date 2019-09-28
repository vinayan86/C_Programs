#include <stdio.h>
int main() {
	int n;
  scanf("%d",&n);
  int c=0;
  for(int i=1;i<=n;i++)
  {
    
    printf("%d",i);
    c=c+1;
    if(c==3)
    {
     printf(",");
      c=0;
    }
  }
	return 0;
}