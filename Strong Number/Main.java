#include <stdio.h>
int main() {
		  int n,s,k=0,r;
	scanf("%d",&n);
  int f=n;
  while(n!=0)
  {
  r=n%10;
    int s=1;
  for(int i=1;i<=r;i++)
  {
   s=s*i;
    
    }
 
    k=k+s;
    
    n=n/10;
  }
    
  if(f==k)
   printf("Yes");
  else
    printf("No");
	return 0;
}