#include <stdio.h>
int main() {
   int n,s,k;
   scanf("%d",&n);
  k=n%10;
  while(n>=10)
  {
    

    n=n/10;
   
  
  }
  s=k+n;
      printf("%d",s);
	return 0;
}