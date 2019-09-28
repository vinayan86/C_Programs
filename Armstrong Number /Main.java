#include <stdio.h>
int main() {
	 int n,s=0,r;
	scanf("%d",&n);
 int f=n;
  while(n>0)
  {
    r=n%10;
    s=s+r*r*r;
    n=n/10;
  }
  if(s==f)
  {
    printf("Armstrong Number");
  }
  else
     printf("Not an Armstrong Number");
    
    
	return 0;
}